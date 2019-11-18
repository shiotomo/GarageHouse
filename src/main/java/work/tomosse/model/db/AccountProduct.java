package work.tomosse.model.db;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountProduct {

    private int id;

    private int accountId;

    private int productId;

    private int createdBy;

    private int updatedBy;

    private Timestamp createdAt;

    private Timestamp updatedAt;

    protected enum Authority {
        WRITE_AND_READ(0),
        WRITE(1),
        READ(2);

        private int id;

        private Authority(final int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }
    }
}
