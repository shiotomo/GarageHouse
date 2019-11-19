package work.tomosse.enums;

public enum Permission {
    WRITE_AND_READ(0),
    WRITE(1),
    READ(2);

    private int id;

    private Permission(final int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
