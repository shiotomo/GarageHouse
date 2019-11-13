package work.tomosse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
public class SessionController extends ControllerBase {

    /**
     * Topページ用コントローラ
     *
     * @param mav
     * @return
     */
    @GetMapping
    public ModelAndView top(ModelAndView mav) {
        mav.setViewName("session/top");
        return mav;
    }

    /**
     * ログインページ用コントローラ
     *
     * @param mav
     * @return
     */
    @GetMapping("/login")
    public ModelAndView login(ModelAndView mav) {
        mav.setViewName("session/login");
        return mav;
    }

}
