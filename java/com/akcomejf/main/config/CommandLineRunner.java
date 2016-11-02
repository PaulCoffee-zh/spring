package com.akcomejf.main.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunner implements ApplicationRunner  {

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		System.out.println("123");
	}

}
