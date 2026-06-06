package com.example.library.controller;

import com.example.library.entity.Book;
import com.example.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    public Book save(@RequestBody Book b) {
        return service.save(b);
    }

    @GetMapping
    public List<Book> getAll() {
        return service.getAll();
    }

    @GetMapping("/search")
    public List<Book> search(@RequestParam String q) {
        return service.search(q);
    }
}
