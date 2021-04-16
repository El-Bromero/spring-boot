package org.tekcamp.springtek.api.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Course {
    private int courseID;
    private String name;
    private int credits;
    private String instructor;
}
