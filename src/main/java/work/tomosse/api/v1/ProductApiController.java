package work.tomosse.api.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import work.tomosse.enums.SuccessCode;
import work.tomosse.model.db.Product;
import work.tomosse.model.request.ProductRequest;
import work.tomosse.model.response.SuccessResponse;
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

    @ApiOperation(value = "プロダクト更新", notes = "プロダクトを更新します。")
    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable final Long id, @RequestBody final ProductRequest productRequest) {
        return productService.updateProduct(id, productRequest);
    }

    @ApiOperation(value = "プロダクト削除", notes = "プロダクトを削除します。")
    @DeleteMapping("/{id}")
    public SuccessResponse deleteProduct(@PathVariable final Long id) {
        productService.deleteProduct(id);
        return new SuccessResponse(SuccessCode.SuccessDelete);
    }

}
