package com.joe.bookstore;

import com.joe.bookstore.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/books")
    public String books(Model model) {

        model.addAttribute("books", homeService.getBooks());

        return "books";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/library")
    public String library() {
        return "library";
    }
}
