package com.scottlogic.spring_di;

import org.springframework.stereotype.Component;

@Component
public class ScaredKnight implements Knight {

	@Override
	public void fight() {
		System.out.println("You ran away... coward!.");
	}

}
