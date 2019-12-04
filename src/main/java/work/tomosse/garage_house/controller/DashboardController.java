package work.tomosse.garage_house.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import work.tomosse.garage_house.service.AccountService;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    AccountService accountService;

    /**
     * ダッシュボードページ用
     *
     * @param mav
     * @return
     */
    @GetMapping
    public ModelAndView index(final Principal principal, final ModelAndView mav) {
        mav.addObject("account", accountService.selectByName(principal.getName()));
        mav.setViewName("dashboard/index");
        return mav;
    }

    /**
     * ログイン認証成功時処理
     *
     * @param mav
     * @return
     */
    @PostMapping
    public String login() {
        return "redirect:/dashboard";
    }
}
