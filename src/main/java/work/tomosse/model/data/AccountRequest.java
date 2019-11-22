package work.tomosse.model.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AccountRequest {

    @JsonProperty("name")
    private String name;

    @JsonProperty("password")
    private String password;

    @JsonProperty("role")
    private String role;
}
