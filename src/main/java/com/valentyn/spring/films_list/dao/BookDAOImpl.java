package com.valentyn.spring.films_list.dao;

import com.valentyn.spring.films_list.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Book> getAllBooks() {
        Session session = sessionFactory.getCurrentSession();
        List<Book> allBooks = session.createQuery("from Book", Book.class)
                .getResultList();
        return allBooks;
    }
}
