package com.valentyn.spring.films_list.controller;

import com.valentyn.spring.films_list.entity.Book;
import com.valentyn.spring.films_list.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/")
    public String showAllBooks(Model model) {
        List<Book> allBooks = bookService.getAllBooks();

        model.addAttribute("allBooks", allBooks);

        return "all-books";
    }

    @RequestMapping("/addNewBook")
    public String addNewBook(Model model) {

        Book book = new Book();
        model.addAttribute("book", book);

        return "book-info";
    }

    @RequestMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Book book) {

        bookService.saveBook(book);

        return "redirect:/";
    }
}
