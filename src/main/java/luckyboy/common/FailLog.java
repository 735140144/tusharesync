package luckyboy.common;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class FailLog {
    @Builder.Default
    private Long id = System.currentTimeMillis();

    @Builder.Default
    private Date date = new Date();

    private String pkg;

    private String api;

    private String comment;

    private String params;

    @Builder.Default
    private Integer if_retry = 0;
}
