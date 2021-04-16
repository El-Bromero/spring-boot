package org.tekcamp.springtek.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tekcamp.springtek.api.entities.Author;
import org.tekcamp.springtek.api.repos.AuthorRepo;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepo authorRepo;

    public List<Author> findAllAuthors() {
        return authorRepo.findAllAuthors();
    }

    public Author getAuthorById(int id) {
        return authorRepo.getAuthorById(id);
    }

    public Author createAuthor(Author newAuthor) {
        return authorRepo.createAuthor(newAuthor);
    }

    public Author updateAuthorById(int id, Author author) {
        return authorRepo.updateAuthorById(id, author);
    }

    public void deleteAuthorById(int id) {
        authorRepo.deleteAuthorById(id);
    }
}
