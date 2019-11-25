package work.tomosse.api.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;

@Api(tags = "Product")
@ApiModel(value = "Product", description = "Product REST API")
@RestController
@RequestMapping("/api/v1/products")
public class ProductApiController {

}
