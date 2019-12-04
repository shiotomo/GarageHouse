package work.tomosse.garage_house.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;
import work.tomosse.garage_house.enums.ErrorCode;

@Getter
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class GarageHouseNotFoundException extends RuntimeException {
    private final ErrorCode errorCode;
    private final String[] args;

    public GarageHouseNotFoundException(final ErrorCode errorCode, final String... args) {
        this.errorCode = errorCode;
        this.args = args;
    }
}
