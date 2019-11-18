package work.tomosse.model.db;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {

    private int id;

    private String name;

    private String password;

    private String apiToken;

    private Timestamp createdAt;

    private Timestamp updatedAt;

    private Role role;

    protected enum Role {
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
}
