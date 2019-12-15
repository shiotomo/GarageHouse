package work.tomosse.garage_house.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import work.tomosse.garage_house.model.db.ColumnManage;

@Controller
@RequestMapping("product/{productId}/column_manage")
public class ColumnManageController {

    /**
     * column_manageを追加するページを表示する
     *
     * @param mav
     * @param productId
     * @return
     */
    @GetMapping("/new")
    public ModelAndView newPage(final ModelAndView mav, @PathVariable final Long productId) {
        mav.addObject("productId", productId);
        mav.setViewName("column_manage/new");
        return mav;
    }

    @PostMapping("/create")
    public String create(final Principal principal, final Long productId, final ColumnManage columnManage) {
        return "redirect/product/";
    }

}
