package work.tomosse.garage_house.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    // 4xx系
    ResourceNotFound(101, MessageProperty.ResourceNotFound),
    ConflictAccount(102, MessageProperty.ConflictAccount),
    ConflictProduct(103, MessageProperty.ConflictProduct),
    ;

    private int minorCode;
    private MessageProperty messageProperty;
}
