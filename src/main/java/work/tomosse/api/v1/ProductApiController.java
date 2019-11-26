package work.tomosse.api.v1;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import work.tomosse.model.db.Product;

@Api(tags = "Product")
@ApiModel(value = "Product", description = "Product REST API")
@RestController
@RequestMapping("/api/v1/products")
public class ProductApiController {

    @ApiOperation(value = "プロダクト一覧取得", notes = "プロダクトの一覧を返却します。")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getProductList() {
        return null;
    }

}
