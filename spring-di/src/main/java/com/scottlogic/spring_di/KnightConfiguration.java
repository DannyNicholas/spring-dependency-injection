package com.scottlogic.spring_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
// @PropertySource(value = "classpath:properties/application.properties")
public class KnightConfiguration {

	@Autowired
	Environment env;

	@Bean
	@Profile("brave")
	public Knight braveKnight() {
		System.out.println(env.getProperty("knight.greeting"));
		System.out.println(env.getProperty("spring.profiles.active"));
		System.out.println(env.getProperty("spring.config.location"));
		return new BraveKnight();
	}

	@Bean
	@Profile("scared")
	public Knight scaredKnight() {
		System.out.println(env.getProperty("knight.greeting"));
		System.out.println(env.getProperty("spring.profiles.active"));
		System.out.println(env.getProperty("spring.config.location"));
		return new ScaredKnight();
	}
}
