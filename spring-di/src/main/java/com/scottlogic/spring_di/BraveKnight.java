package com.scottlogic.spring_di;

import org.springframework.stereotype.Component;

@Component
public class BraveKnight implements Knight {

	@Override
	public void fight() {
		System.out.println("You fought bravely.");
	}

}
