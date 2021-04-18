package org.tekcamp.springtek.api.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
@NoArgsConstructor @Getter @Setter
public class Author {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer author_id;
    private String firstName;
    private String lastName;

    @OneToMany(targetEntity = Book.class, mappedBy = "author")
    private List<Book> books;
}
