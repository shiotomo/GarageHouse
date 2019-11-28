package work.tomosse.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ProductRequest {
    @ApiModelProperty(value = "name")
    @JsonProperty("name")
    private String name;
}
