package org.tekcamp.springtek.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tekcamp.springtek.api.entities.Author;
import org.tekcamp.springtek.api.repos.iAuthorRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    iAuthorRepo authorRepo;

    public List<Author> getAuthors() {
        Iterable<Author> authorIterable = authorRepo.findAll();
        List<Author> authorList = new ArrayList<>();
        authorIterable.forEach(authorList::add);
        return authorList;
    }

    public Optional<Author> getAuthorById(int authorID) {
        return authorRepo.findById(authorID);
    }

    public Author updateAuthor(int authorID, Author authorInfo) {
        Optional<Author> oAuthor = getAuthorById(authorID);

        if(oAuthor.isPresent()) {
            Author modifiedAuthor = oAuthor.get();
            String updatedAuthorFirstName = authorInfo.getFirstName();
            String updatedAuthorLastName = authorInfo.getLastName();
            modifiedAuthor.setFirstName(updatedAuthorFirstName);
            modifiedAuthor.setLastName(updatedAuthorLastName);
            return authorRepo.save(modifiedAuthor);
        }
        return authorInfo;
    }

    public Author createAuthor(Author author) {
        return authorRepo.save(author);
    }
}
