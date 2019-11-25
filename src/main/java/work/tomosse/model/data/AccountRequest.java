package work.tomosse.model.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import work.tomosse.enums.Role;

@Data
public class AccountRequest {
    @ApiModelProperty(value = "name")
    @JsonProperty("name")
    private String name;

    @ApiModelProperty(value = "password")
    @JsonProperty("password")
    private String password;

    @ApiModelProperty(value = "role")
    @JsonProperty("role")
    private Role role;
}