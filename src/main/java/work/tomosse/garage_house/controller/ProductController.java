package work.tomosse.garage_house.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import work.tomosse.garage_house.model.db.Product;
import work.tomosse.garage_house.service.ProductService;

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
    public ModelAndView index(final Principal principal, final ModelAndView mav) {
        mav.addObject("productList", productService.getProductListByAccount(principal));
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
        mav.addObject("product", productService.getProductById(id));
        mav.setViewName("product/show");
        return mav;
    }

    /**
     * productを作成するページを表示する
     *
     * @param mav
     * @return
     */
    @GetMapping("/new")
    public ModelAndView newPage(final ModelAndView mav) {
        mav.setViewName("product/new");
        return mav;
    }

    /**
     * productを作成する
     *
     * @param principal
     * @param product
     * @return
     */
    @PostMapping("/create")
    public String create(final Principal principal, @ModelAttribute final Product product) {
        final var createProduct = productService.createProduct(principal, product);
        return "redirect:/product/" + createProduct.getId();
    }
}
