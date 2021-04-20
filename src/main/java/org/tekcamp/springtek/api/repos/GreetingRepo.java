package org.tekcamp.springtek.api.repos;
import lombok.Getter;
import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepo {
	@Getter private final String helloEng = "Greetings from TEKcamp!";


	@Getter private final String saludosSpa = "¡Saludos! de TEKcamp";

	@Getter private final String salutFre = "Salut! depuis TEKcamp";

	@Getter private final String salutiIta = "Saluti! da TEKcamp";
}
