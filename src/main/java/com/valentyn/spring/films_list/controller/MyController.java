package com.valentyn.spring.films_list.controller;

import com.valentyn.spring.films_list.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {


    @RequestMapping("/")
    public String showAllBooks() {
        return "all-books";
    }
}
