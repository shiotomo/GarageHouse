package work.tomosse.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
public class DashboardController extends ControllerBase {

    @RequestMapping("/")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("dashboard/index");
        return mav;
    }

}
