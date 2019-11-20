package work.tomosse.enums;

public enum Role {
    ADMIN("ADMIN"),
    USER("USER");

    private String role;

    private Role(final String role) {
        this.role= role;
    }

    public String getRole() {
        return this.role;
    }
}
