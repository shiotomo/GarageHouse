package work.tomosse.garage_house.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ColumnType {
    INTEGER("INTEGER"),
    STRING("STRING"),
    DATE("DATE"),
    DOUBLE("DOUBLE"),
    BOOLEAN("BOOLEAN");

    private String type;
}
