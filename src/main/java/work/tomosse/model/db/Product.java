package work.tomosse.model.db;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private int id;

    private String name;

    private int createdBy;

    private int updatedBy;

    private Timestamp createdAt;

    private Timestamp updatedAt;
}
