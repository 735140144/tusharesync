package luckyboy.common;

import lombok.Data;

import java.util.List;

@Data
public class TranResult {

    private String fields;

    private List<String> values;
}
