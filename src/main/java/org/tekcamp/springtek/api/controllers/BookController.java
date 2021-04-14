package org.tekcamp.springtek.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tekcamp.springtek.api.entities.Book;
import org.tekcamp.springtek.api.services.BookService;

import java.util.List;

@RestController
@RequestMapping(path = "/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }

    @PostMapping
    public Book createBook(@RequestBody Book newBook) {
        return bookService.createBook(newBook);
    }
}
