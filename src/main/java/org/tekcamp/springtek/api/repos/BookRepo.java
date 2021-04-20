package org.tekcamp.springtek.api.repos;

import org.springframework.stereotype.Repository;
import org.tekcamp.springtek.api.entities.Book;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepo {

    private List<Book> books = new ArrayList<>();

    public List<Book> findAllBooks() {
        return this.books;
    }

    public Book getBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn))
            {
                return book;
            }
        }
        return null;
    }

    public Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title))
            {
                return book;
            }
        }
        return null;
    }

    public Book createBook(Book newBook) {
        books.add(newBook);
        return books.get(books.size()-1);
    }

    public Book updateBookByIsbn(String isbn, Book updateBook) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setTitle(updateBook.getTitle());
                book.setAuthor(updateBook.getAuthor());
                book.setCourse(updateBook.getCourse());
                return book;
            }
        }
        return null;
    }

    public Book updateBookByTitle(String title, Book updateBook) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setAuthor(updateBook.getAuthor());
                book.setCourse(updateBook.getCourse());
                return book;
            }
        }
        return null;
    }

    public void deleteBookByIsbn(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public void deleteBookByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }
}
