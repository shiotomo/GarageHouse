package work.tomosse.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import work.tomosse.enums.ErrorCode;

@Getter
@AllArgsConstructor
public class GarageHouseBadRequestException extends RuntimeException {
    private final ErrorCode errorCode;
}
