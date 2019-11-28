package work.tomosse.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageProperty {
    // Success系
    SuccessDelete("api.message.success.successDelete"),

    // Error系
    ResourceNotFound("api.message.error.resourceNotFound"),
    ConflictAccount("api.message.error.conflictAccount"),
    ConflictProduct("api.message.error.conflictProduct"),
    ;

    private String message;
}
