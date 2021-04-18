package org.tekcamp.springtek.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tekcamp.springtek.api.entities.Author;
import org.tekcamp.springtek.api.services.AuthorService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/authors")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAuthors();
    }

    @GetMapping(path = "/id/{id}")
    public Optional<Author> getAuthorById(@PathVariable int id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author newAuthor) {
        return authorService.createAuthor(newAuthor);
    }

    @PutMapping(value = "/id/{id}")
    public Author updateAuthorById(@PathVariable int id, @RequestBody Author author) {
        return authorService.updateAuthor(id, author);
    }

//    @DeleteMapping(value = "/id/{id}")
//    public void deleteAuthorById(@PathVariable int id) {
//        authorService.deleteAuthorById(id);
//    }
}