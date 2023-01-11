package luckyboy.common;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class FailLog {
    @Builder.Default
    private Date date = new Date();

    private String api;

    private String comment;
}
