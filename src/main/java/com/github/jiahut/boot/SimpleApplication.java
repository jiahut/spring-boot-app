package com.github.jiahut.boot;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.*;


@SpringBootApplication
class SimpleApplication implements CommandLineRunner {
	
	public void run(String... args) {
		 System.out.println("hello world");
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SimpleApplication.class, args);
	}

}


