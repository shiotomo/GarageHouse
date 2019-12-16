package work.tomosse.garage_house.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import work.tomosse.garage_house.service.ColumnManageService;

@Controller
@RequestMapping("product/{productId}/content_data")
public class ContentDataController {

    @Autowired
    ColumnManageService columnManageService;

    /**
     * content_dataを作成するページを表示する
     *
     * @param mav
     * @param productId
     * @return
     */
    @GetMapping("/new")
    public ModelAndView newPage(final ModelAndView mav, @PathVariable final Long productId) {
        mav.addObject("columnManageList", columnManageService.selectByProductId(productId));
        mav.setViewName("content_data/new");
        return mav;
    }

}
