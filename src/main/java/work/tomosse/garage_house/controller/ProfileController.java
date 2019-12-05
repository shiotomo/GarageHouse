package work.tomosse.garage_house.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import work.tomosse.garage_house.model.request.AccountRequest;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    /**
     * プロフィール表示用
     *
     * @param id
     * @param mav
     * @return
     */
    @GetMapping("/{id}")
    public ModelAndView show(@PathVariable final Long id, final ModelAndView mav) {
        mav.addObject("id", id);
        mav.setViewName("profile/show");
        return mav;
    }

    /**
     * プロフィール編集ページ用
     *
     * @param id
     * @param mav
     * @return
     */
    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable final Long id, final ModelAndView mav) {
        mav.addObject("id", id);
        mav.setViewName("profile/edit");
        return mav;
    }

    /**
     * プロフィール更新
     *
     * @param id
     * @param accountRequest
     * @return
     */
    @PatchMapping("/update/{id}")
    public String update(@PathVariable final Long id, @RequestBody final AccountRequest accountRequest) {
        return null;
    }

}
