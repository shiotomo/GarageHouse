package work.tomosse.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    TestInvalidRequest(101, "Error Test");

    private int minorCode;
    private String message;
}
