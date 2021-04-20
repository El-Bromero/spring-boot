package org.tekcamp.springtek.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tekcamp.springtek.api.repos.GreetingRepo;

@Service
public class GreetingService {

	@Autowired
	GreetingRepo greetingRepo;

	public String greetEnglish() {
		return greetingRepo.getHelloEng();
	}

	public String greetSpanish() {
		return greetingRepo.getSaludosSpa();
	}

	public String greetFrench() {
		return greetingRepo.getSalutFre();
	}

	public String greetItalian() {
		return greetingRepo.getSalutiIta();
	}
}
