package org.tekcamp.springtek.api.repos;

import org.springframework.stereotype.Repository;
import org.tekcamp.springtek.api.entities.Author;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepo {

    private List<Author> authors = new ArrayList<>();

    public List<Author> findAllAuthors() {
        return this.authors;
    }

    public Author getAuthorById(int id) {
        for (Author author : authors) {
            if (author.getAuthor_id() == id) {
                return author;
            }
        }
        return null;
    }

    public Author createAuthor(Author newAuthor) {
        authors.add(newAuthor);
        return authors.get(authors.size()-1);
    }

    public Author updateAuthorById(int id, Author updateAuthor) {
        for (Author author : authors) {
            if (author.getAuthor_id() == id) {
                author.setFirstName(updateAuthor.getFirstName());
                author.setLastName(updateAuthor.getLastName());
                author.getBooks().clear();
                author.getBooks().addAll(updateAuthor.getBooks());
                return author;
            }
        }
        return null;
    }

    public void deleteAuthorById(int id) {
        for (Author author : authors) {
            if (author.getId() == id) {
                authors.remove(author);
            }
        }
    }
}
