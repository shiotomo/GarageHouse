package work.tomosse.enums;

public enum Role {
    ADMIN(0, "ADMIN"),
    WRITE(1, "USER");

    private int id;
    private String role;

    private Role(final int id, final String role) {
        this.id = id;
        this.role= role;
    }

    public int getId() {
        return this.id;
    }

    public String getRole() {
        return this.role;
    }
}
