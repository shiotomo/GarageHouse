package work.tomosse.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    // 4xx系
    NotFoundResource(101, "Not found resource.");

    private int minorCode;
    private String message;
}
