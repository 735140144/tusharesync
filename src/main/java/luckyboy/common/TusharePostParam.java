package luckyboy.common;

import com.alibaba.fastjson.JSONObject;
import lombok.Builder;

@Builder
public class TusharePostParam {

    @Builder.Default
    private String token = "945e12f7dc5e197133193578440a4d3db4f83bd20c0aa641043a9739";
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
