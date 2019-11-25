package work.tomosse.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Permission {
    WRITE_AND_READ(0),
    WRITE(1),
    READ(2);

    private int id;
}
