package com.joe.bookstore;

import com.joe.bookstore.model.Book;
import com.joe.bookstore.model.Inquiry;
import com.joe.bookstore.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("inquiry", new Inquiry());
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

    @PostMapping("/books")
    public String searchBooks(Model model, @ModelAttribute Inquiry inquiry) {
        String bookTitle = inquiry.getSearchString();
        model.addAttribute("books", homeService.searchedBooks(bookTitle));
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
