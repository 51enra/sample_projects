package com.luv2code.springdemo;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class randomFortuneService implements FortuneService {
	
	private String[] fortunes = {
		"Was du heute kannst besorgen...",
		"Vorsicht ist die Mutter der Porzellankiste.",
		"Hoppladi hopplada..."
	};
	
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortunes.length);
		return fortunes[index];
	}

}
