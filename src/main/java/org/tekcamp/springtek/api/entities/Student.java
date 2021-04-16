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
public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private List<String> courses;
}