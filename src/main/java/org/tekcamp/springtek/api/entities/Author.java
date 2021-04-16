package org.tekcamp.springtek.api.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Author {
    private int author_id;
    private String firstName;
    private String lastName;
    private List<String> books;
}
