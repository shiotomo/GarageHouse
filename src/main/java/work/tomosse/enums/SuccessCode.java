package work.tomosse.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SuccessCode {
    SuccessDelete(10, "Success delete."),
    ;

    private int minorCode;
    private String message;
}
