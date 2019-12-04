package work.tomosse.garage_house.model.request;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import work.tomosse.garage_house.enums.Role;

@Data
public class AccountRequest {
    @ApiModelProperty(value = "name")
    @JsonProperty("name")
    @NotBlank
    private String name;

    @ApiModelProperty(value = "password")
    @JsonProperty("password")
    @NotBlank
    private String password;

    @ApiModelProperty(value = "role")
    @JsonProperty("role")
    @NotBlank
    private Role role;
}
