package work.tomosse.garage_house.model.request;


import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ProductRequest {
    @ApiModelProperty(value = "name")
    @JsonProperty("name")
    @NotBlank
    private String name;
}
