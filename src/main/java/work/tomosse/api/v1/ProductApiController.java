package work.tomosse.api.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import work.tomosse.model.db.Product;
import work.tomosse.model.request.ProductRequest;
import work.tomosse.service.ProductService;

@Api(tags = "Product")
@ApiModel(value = "Product", description = "Product REST API")
@RestController
@RequestMapping("/api/v1/products")
public class ProductApiController {

    @Autowired
    ProductService productService;

    @ApiOperation(value = "プロダクト一覧取得", notes = "プロダクトの一覧を返却します。")
    @GetMapping
    public List<Product> getProductList() {
        return productService.getProductList();
    }

    @ApiOperation(value = "プロダクト作成", notes = "プロダクトを作成します。")
    @PostMapping
    public Product createProduct(@RequestBody final ProductRequest productRequest) {
        return productService.createProduct(productRequest);
    }
}
