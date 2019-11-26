package work.tomosse.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import work.tomosse.enums.ErrorCode;

@Getter
@AllArgsConstructor
public class GarageHouseNotFoundException extends RuntimeException {
    private final ErrorCode errorCode;
}
