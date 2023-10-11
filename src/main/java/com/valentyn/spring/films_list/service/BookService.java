package com.valentyn.spring.films_list.service;

import com.valentyn.spring.films_list.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    void saveBook(Book book);

    Book getBook(int id);

    void deleteBook(int id);
}
