package com.valentyn.spring.films_list.dao;

import com.valentyn.spring.films_list.entity.Book;

import java.util.List;

public interface BookDAO {

    List<Book> getAllBooks();

    void saveBook(Book book);

    Book getBook(int id);

    void deleteBook(int id);
}
