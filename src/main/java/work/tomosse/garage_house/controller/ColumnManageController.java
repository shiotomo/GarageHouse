package work.tomosse.garage_house.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import work.tomosse.garage_house.model.db.ColumnManage;
import work.tomosse.garage_house.service.ColumnManageService;

@Controller
@RequestMapping("product/{productId}/column_manage")
public class ColumnManageController {

    @Autowired
    ColumnManageService columnManageService;

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

    /**
     * column_manageを追加する
     *
     * @param principal
     * @param productId
     * @param columnManage
     * @return
     */
    @PostMapping("/create")
    public String create(final Principal principal, @PathVariable final Long productId, final ColumnManage columnManage) {
        columnManageService.create(principal, productId, columnManage);
        return "redirect:/product/" + productId;
    }
}
