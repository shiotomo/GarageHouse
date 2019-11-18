package work.tomosse.model.db;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContentData {

    private int id;

    private int product_id;

    private int createdBy;

    private int updatedBy;

    private Timestamp createdAt;

    private Timestamp updatedAt;

}
