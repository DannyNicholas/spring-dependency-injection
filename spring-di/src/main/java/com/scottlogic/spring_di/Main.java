package com.scottlogic.spring_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	private final Knight knight;

	public Main(Knight knight) {
		this.knight = knight;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(KnightConfiguration.class);
		Knight knight = ctx.getBean(Knight.class);

		Main app = new Main(knight);
		app.start();
	}

	public void start() {
		knight.fight();
	}

}
