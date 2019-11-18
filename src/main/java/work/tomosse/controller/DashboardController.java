package work.tomosse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class DashboardController {
    /**
     * ダッシュボードページ用
     *
     * @param mav
     * @return
     */
    @GetMapping("dashboard")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("dashboard/index");
        return mav;
    }
}
