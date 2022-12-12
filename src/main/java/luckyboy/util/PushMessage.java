package luckyboy.util;

import luckyboy.common.AshareConfig;
import luckyboy.common.PushUrlEnum;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

public class PushMessage {
    public static String sendMessage(PushUrlEnum pushUrlEnum, String title, String desp) throws Exception {
        System.out.println(pushUrlEnum.getUrl());
        HttpPost methon = new HttpPost(pushUrlEnum.getUrl());
        try {
            //创建参数集合
            List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
            //添加参数
            list.add(new BasicNameValuePair("pushkey", AshareConfig.PushKey));
            list.add(new BasicNameValuePair("text",title));
            list.add(new BasicNameValuePair("desp",desp));
            list.add(new BasicNameValuePair("type","markdown"));
            //把参数放入请求对象，，post发送的参数list，指定格式
            methon.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
            //添加请求头参数
            CloseableHttpClient client = HttpClients.createDefault();
            //启动执行请求，并获得返回值
            CloseableHttpResponse response = client.execute(methon);
            //得到返回的entity对象
            HttpEntity entity = response.getEntity();
            //把实体对象转换为string
            String result = EntityUtils.toString(entity, "UTF-8");
            System.out.println(result);
            //返回内容
            return result;
        } catch (Exception e1) {
            return e1.getStackTrace().toString();
        }
    }
}
