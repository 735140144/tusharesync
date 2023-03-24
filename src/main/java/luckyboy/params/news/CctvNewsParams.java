package luckyboy.params.news;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class CctvNewsParams extends Formart {
    private String date;
}
