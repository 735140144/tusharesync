package luckyboy.service.Impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import luckyboy.common.FailLog;
import luckyboy.mapper.failLog.FailLogMapper;
import luckyboy.service.FailLogService;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class FailLogServiceImpl implements FailLogService {
    @Resource
    private FailLogMapper failLogMapper;

    @Override
    public void Retry() {
        List<FailLog> failLogs = failLogMapper.needTry();
        if (failLogs.size() > 0) {
            for (FailLog failLog : failLogs) {
                String pre_url = "http://0.0.0.0:8000/data/";
                String url = pre_url + failLog.getPkg() + "/" + failLog.getApi();
                CloseableHttpClient httpclient = HttpClients.createDefault();
                CloseableHttpResponse response = null;
                try {
                    // 创建uri
                    URIBuilder builder = new URIBuilder(url);
                    JSONObject jsonObject = JSON.parseObject(failLog.getParams());
                    for (String key : jsonObject.keySet()) {
                        builder.addParameter(key, jsonObject.getString(key));
                    }
                    URI uri = builder.build();
                    // 创建http GET请求
                    HttpGet httpGet = new HttpGet(uri);
                    // 执行请求
                    response = httpclient.execute(httpGet);
                    // 判断返回状态是否为200
                    if (response.getStatusLine().getStatusCode() == 200) {
                        failLog.setIf_retry(1);
                        failLogMapper.updateIf_retryAndApi(failLog);
                    }
                } catch (Exception e) {
                    log.info("重试失败，重试参数{}", failLog.toString());
                }
            }
        }
        log.info("开始校验重试数据!");
        List<FailLog> check = failLogMapper.check();
        for (FailLog ck : check) {
            for (FailLog failLog : failLogs) {
                if (ck.getPkg().equals(failLog.getPkg()) && ck.getApi().equals(failLog.getApi()) && ck.getParams().equals(failLog.getParams())){
                    log.info("无需再次重试数据：{}",ck.toString());
                    failLogMapper.updateIf_retryAndApi(ck);
                    break;
                }
            }
        }
    }
}
