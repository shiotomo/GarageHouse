package work.tomosse.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountResponse {
    private Long id;
    private String name;
    private String role;
}
