package luckyboy.common;

import com.alibaba.fastjson.JSONObject;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Value;

@Builder
public class TusharePostParam {

    @Value("${shareDb.token}")
    private String token;
    private String api_name;
    private JSONObject params;
    private String fields;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"token\":\"")
                .append(token).append('\"');
        sb.append(",\"api_name\":\"")
                .append(api_name).append('\"');
        sb.append(",\"params\":")
                .append(params);
        sb.append(",\"fields\":\"")
                .append(fields).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
