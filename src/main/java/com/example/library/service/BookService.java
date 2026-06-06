package com.example.library.service;

import com.example.library.entity.Book;
import com.example.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public Book save(Book b) {
        return repo.save(b);
    }

    public List<Book> getAll() {
        return repo.findAll();
    }

    public List<Book> search(String q) {
        return repo.findByTitleContainingIgnoreCase(q);
    }
}
