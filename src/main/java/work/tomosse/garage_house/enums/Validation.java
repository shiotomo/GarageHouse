package work.tomosse.garage_house.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Validation {
    NoValidation("NoValidation"),
    NotNull("NotNull"),
    ;

    private String validater;
}
