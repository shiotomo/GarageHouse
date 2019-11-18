package work.tomosse.enums;

public enum ColumnType {
    INTEGER("INTEGER"),
    STRING("STRING"),
    DATE("DATE"),
    DOUBLE("DOUBLE"),
    BOOLEAN("BOOLEAN");

    private String type;

    private ColumnType(final String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
