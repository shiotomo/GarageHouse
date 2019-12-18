package work.tomosse.garage_house.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import work.tomosse.garage_house.model.request.ContentDataRequest;
import work.tomosse.garage_house.service.ColumnManageService;
import work.tomosse.garage_house.service.ContentDataService;

@Controller
@RequestMapping("product/{productId}/content_data")
public class ContentDataController {

    @Autowired
    ColumnManageService columnManageService;

    @Autowired
    ContentDataService contentDataService;

    /**
     * content_dataを作成するページを表示する
     *
     * @param mav
     * @param productId
     * @return
     */
    @GetMapping("/new")
    public ModelAndView newPage(
            final ModelAndView mav,
            @PathVariable final Long productId,
            @ModelAttribute("contentDataRequest") final ContentDataRequest contentDataRequest) {
        mav.addObject("columnManageList", columnManageService.selectByProductId(productId));
        mav.setViewName("content_data/new");
        return mav;
    }

    /**
     * content_dataを作成する
     *
     * @param productId
     * @return
     */
    @PostMapping("/create")
    public String create(
            final Principal principal,
            @PathVariable final Long productId,
            @ModelAttribute final ContentDataRequest contentDataRequest) {
        contentDataService.createContentData(principal, productId, contentDataRequest);
        return "redirect:/product/" + productId;
    }
}
