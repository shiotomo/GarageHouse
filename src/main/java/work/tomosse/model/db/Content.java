package work.tomosse.model.db;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Content {

    private int id;

    private int column_manage_id;

    private int content_data_id;

    private String body;

    private String validation;

    private int createdBy;

    private int updatedBy;

    private Timestamp createdAt;

    private Timestamp updatedAt;
}
