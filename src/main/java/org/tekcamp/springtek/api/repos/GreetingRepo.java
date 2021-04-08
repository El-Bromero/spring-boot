package org.tekcamp.springtek.api.repos;
import lombok.Getter;
import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepo {
	@Getter private final String helloEng = "Greetings from TEKcamp!";
	//add additional greeting data here
}
