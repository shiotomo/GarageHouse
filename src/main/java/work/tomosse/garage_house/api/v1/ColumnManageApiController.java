package work.tomosse.garage_house.api.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import work.tomosse.garage_house.model.db.ColumnManage;
import work.tomosse.garage_house.service.ColumnManageService;

@Api(tags = "ColumnManage")
@ApiModel(value = "ColumnManage", description = "ColumnManage REST API")
@RestController
@RequestMapping("/api/v1/product/{prodcutId}/column_manages")
public class ColumnManageApiController {

    @Autowired
    ColumnManageService columnManageService;

    /**
     * productのカラム一覧を取得する
     *
     * @param productId
     * @return
     */
    public List<ColumnManage> getColumnManage(@PathVariable final Long productId) {
        return columnManageService.selectByProductId(productId);
    }

}
