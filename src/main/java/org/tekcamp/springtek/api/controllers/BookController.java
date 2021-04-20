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

    @GetMapping(path = "/isbn/{isbn}")
    public Book getBookByIsbn(@PathVariable String isbn) {
        return bookService.getBookByIsbn(isbn);
    }

    @GetMapping(path = "/title/{title}")
    public Book getBookByTitle(@PathVariable String title) {
        return bookService.getBookByTitle(title);
    }

    @PostMapping
    public Book createBook(@RequestBody Book newBook) {
        return bookService.createBook(newBook);
    }

    @PutMapping(value = "/isbn/{isbn}")
    public Book updateBookByIsbn(@PathVariable String isbn, @RequestBody Book book) {
        return bookService.updateBookByIsbn(isbn, book);
    }

    @PutMapping(value = "/title/{title}")
    public Book updateBookByTitle(@PathVariable String title, @RequestBody Book book) {
        return bookService.updateBookByTitle(title, book);
    }

    @DeleteMapping(value = "/isbn/{isbn}")
    public void deleteBookByIsbn(@PathVariable String isbn) {
        bookService.deleteBookByIsbn(isbn);
    }

    @DeleteMapping(value = "/title/{title}")
    public void deleteBookByTitle(@PathVariable String title) {
        bookService.deleteBookByTitle(title);
    }
}
