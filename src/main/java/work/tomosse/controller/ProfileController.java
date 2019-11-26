package work.tomosse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    @GetMapping("/{id}")
    public ModelAndView show(@PathVariable final Long id, final ModelAndView mav) {
        mav.addObject("id", id);
        mav.setViewName("profile/show");
        return mav;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable final Long id, final ModelAndView mav) {
        mav.addObject("id", id);
        mav.setViewName("profile/edit");
        return mav;
    }

}
