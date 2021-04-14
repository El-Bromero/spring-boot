package org.tekcamp.springtek.api.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Book {
	private String isbn;
	private String title;
	private String author;
	private String course;
}
