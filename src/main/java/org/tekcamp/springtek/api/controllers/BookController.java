package org.tekcamp.springtek.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tekcamp.springtek.api.entities.Book;
import org.tekcamp.springtek.api.services.BookService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public Iterable<Book> getAllBooks() {
        return bookService.getBooks();
    }

    @GetMapping(path = "/isbn/{isbn}")
    public Optional<Book> getBookByIsbn(@PathVariable int isbn) {
        return bookService.getBookById(isbn);
    }

//    @GetMapping(path = "/title/{title}")
//    public Book getBookByTitle(@PathVariable String title) {
//        return bookService.getBookByTitle(title);
//    }

    @PostMapping
    public Book createBook(@RequestBody Book newBook) {
        return bookService.createBook(newBook);
    }

    @PutMapping(value = "/isbn/{isbn}")
    public Book updateBookByIsbn(@PathVariable int isbn, @RequestBody Book book) {
        return bookService.updateBook(isbn, book);
    }

//    @PutMapping(value = "/title/{title}")
//    public Book updateBookByTitle(@PathVariable String title, @RequestBody Book book) {
//        return bookService.updateBookByTitle(title, book);
//    }

//    @DeleteMapping(value = "/isbn/{isbn}")
//    public void deleteBookByIsbn(@PathVariable String isbn) {
//        bookService.deleteBookByIsbn(isbn);
//    }
//
//    @DeleteMapping(value = "/title/{title}")
//    public void deleteBookByTitle(@PathVariable String title) {
//        bookService.deleteBookByTitle(title);
//    }
}
