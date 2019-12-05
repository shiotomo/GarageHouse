package work.tomosse.garage_house.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import work.tomosse.garage_house.model.db.ColumnManage;

@Controller
@RequestMapping("/column_manage")
public class ColumnController {

    public String create(final Principal principal, final ColumnManage columnManage) {
        return "/product";
    }

}
