package com.MongoJava.MongoJPA;

import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.javers.core.Javers;
import org.javers.core.metamodel.object.CdoSnapshot;
import org.javers.repository.jql.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.POJO.Movie;

@SpringBootApplication
@ComponentScan({"com.POJO","com.Repository","com.Service","com.GlobalException",
	"com.Controller"})
@EntityScan("com.POJO")
@EnableMongoRepositories("com.Repository")
@EnableMongoAuditing
public class MongoJpaApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MongoJpaApplication.class, args);
		
	}
	
	
	

}