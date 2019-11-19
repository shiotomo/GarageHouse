package work.tomosse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import work.tomosse.service.AccountService;

@RequestMapping("/")
@Controller
public class DashboardController {

    @Autowired
    AccountService accountService;

    /**
     * ダッシュボードページ用
     *
     * @param mav
     * @return
     */
    @GetMapping("dashboard")
    public ModelAndView index(final ModelAndView mav) {
        final var accountList = accountService.selectAll();
        mav.setViewName("dashboard/index");
        return mav;
    }
}
