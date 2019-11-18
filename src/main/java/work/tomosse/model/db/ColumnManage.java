package work.tomosse.model.db;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import work.tomosse.enums.ColumnType;

@Data
@AllArgsConstructor
public class ColumnManage {

    private int id;

    private int product_id;

    private ColumnType columnType;

    private String validation;

    private int createdBy;

    private int updatedBy;

    private Timestamp createdAt;

    private Timestamp updatedAt;
}
