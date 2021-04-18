package org.tekcamp.springtek.api.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "book")
@NoArgsConstructor @Getter @Setter
public class Book {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer isbn;
	private String title;
	private String course;

	@ManyToOne(targetEntity = Author.class)
	@JoinColumn(name = "author_id") // explicitly naming foreign key
	private Author author;

	public Book(String title, String course) {
		this.title = title;
		this.course = course;
	}
}
