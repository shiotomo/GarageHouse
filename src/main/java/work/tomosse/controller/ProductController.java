package work.tomosse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/product")
@Controller
public class ProductController {

    @GetMapping
    public ModelAndView index(final ModelAndView mav) {
        mav.setViewName("product/index");
        return mav;
    }

}
