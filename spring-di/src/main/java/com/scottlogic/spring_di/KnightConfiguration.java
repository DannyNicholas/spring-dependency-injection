package com.scottlogic.spring_di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfiguration {
	
	@Bean
	public Knight braveKnight() {
		return new BraveKnight();
	}

}
