package com.springboot.graphqlpoc;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataStructuresApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataStructuresApplication.class, args);}

	@Bean
	public ModelMapper modelMapper() {return new ModelMapper();}

}
