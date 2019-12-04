package work.tomosse.garage_house.api.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;

@Api(tags = "ColumnManage")
@ApiModel(value = "ColumnManage", description = "ColumnManage REST API")
@RestController
@RequestMapping("/api/v1/column_manages")
public class ColumnManageApiController {

}
