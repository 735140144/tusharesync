package luckyboy.params;

import lombok.Builder;
import lombok.Data;
import luckyboy.util.Formart;
@Data
@Builder
public class ConceptParams extends Formart {
    @Builder.Default
    private String src ="ts";
}
