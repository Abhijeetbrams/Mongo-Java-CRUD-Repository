package com.MongoJava.MongoJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"com.POJO","com.Repository","com.Service","com.GlobalException",
	"com.Controller"})
@EntityScan("com.POJO")
@EnableMongoRepositories("com.Repository")
public class MongoJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoJpaApplication.class, args);
	}

}
