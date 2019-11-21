package work.tomosse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/product")
@Controller
public class ProductController {

    /**
     * Productの一覧を表示する
     *
     * @param mav
     * @return
     */
    @GetMapping
    public ModelAndView index(final ModelAndView mav) {
        mav.setViewName("product/index");
        return mav;
    }

    /**
     * Productの詳細を表示する
     *
     * @param mav
     * @return
     */
    @GetMapping("/:product_id")
    public ModelAndView show(final ModelAndView mav) {
        mav.setViewName("product/show");
        return mav;
    }
}
