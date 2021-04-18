package org.tekcamp.springtek.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tekcamp.springtek.api.entities.Book;
import org.tekcamp.springtek.api.repos.iBookRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    iBookRepo bookRepo;

    public List<Book> getBooks() {
        Iterable<Book> bookIterable = bookRepo.findAll();
        List<Book> bookList = new ArrayList<>();
        bookIterable.forEach(bookList::add);
        return bookList;
    }

    public Optional<Book> getBookById(int bookID) {
        return bookRepo.findById(bookID);
    }

    public Book updateBook(int bookID, Book bookInfo) {
        Optional<Book> oBook = getBookById(bookID);

        if(oBook.isPresent()) {
            Book modifiedBook = oBook.get();
            String updatedBookTitle = bookInfo.getTitle();
            String updatedBookCourse = bookInfo.getCourse();
            modifiedBook.setTitle(updatedBookTitle);
            modifiedBook.setCourse(updatedBookCourse);
            return bookRepo.save(modifiedBook);
        }
        return bookInfo;
    }

    public Book createBook(Book book) {
        return bookRepo.save(book);
    }
}
