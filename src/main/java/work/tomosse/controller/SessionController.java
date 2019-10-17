package work.tomosse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class SessionController {

    @GetMapping
    public ModelAndView top(ModelAndView mav) {
        mav.setViewName("session/top");
        return mav;
    }

}
