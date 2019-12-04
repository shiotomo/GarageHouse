package work.tomosse.garage_house.model.response;

import lombok.Data;
import work.tomosse.garage_house.enums.SuccessCode;

@Data
public class SuccessResponse {
    private int code;
    private String message;

    public SuccessResponse(final SuccessCode successCode) {
        this.code = successCode.getMinorCode();
        this.message = successCode.getMessage();
    }
}
