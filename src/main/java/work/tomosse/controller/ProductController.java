package work.tomosse.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import work.tomosse.model.db.Product;
import work.tomosse.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

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
    @GetMapping("/{id}")
    public ModelAndView show(@PathVariable final Long id, final ModelAndView mav) {
        mav.setViewName("product/show");
        return mav;
    }

    /**
     * Productを作成するページを表示する
     *
     * @param mav
     * @return
     */
    @GetMapping("/new")
    public ModelAndView newPage(final ModelAndView mav) {
        mav.setViewName("product/new");
        return mav;
    }

    @PostMapping("/create")
    public String create(@ModelAttribute final Principal principal, @ModelAttribute final Product product) {
        productService.createProduct(principal, product);
        return "redirect:/product/";
    }
}
