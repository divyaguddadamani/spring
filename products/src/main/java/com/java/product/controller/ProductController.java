package com.java.product.controller;
import com.java.product.dto.ProductDto;
import com.java.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ProductController {

    @Autowired
    private ProductService productService;

    public ProductController() {
        System.out.println("created Controller");
    }

    @PostMapping("/purchase")
    public String Onpurchase( ProductDto dto, Model model) {
        System.out.println("Running in save methode");
        System.out.println(dto.toString());

        if (this.productService.saveAndValid(dto)) {
            model.addAttribute("success", "Product details saved successfully");
            model.addAttribute("productdto", dto);
            return "Response.jsp";

        } else {
            model.addAttribute("failure", "purchase failed");

        }
        return "Product.jsp";
    }
}