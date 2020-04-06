package com.Repository;

import java.util.Collection;
import java.util.List;

import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.POJO.Movie;

@JaversSpringDataAuditable
public interface MovieRepository extends MongoRepository<Movie, String> {

	
	   List<Movie> findByTitleLike(String lastname);
	   List<Movie> findByCountriesIn(Collection<?> countries);
	   List <Movie> deleteByTitle(String title);
	   
	   @Query(value="{ 'title' : ?0 }", fields="{ 'title' : 1, 'year' : 1}")
	   List<Movie> findByTheMoviesTitle(String title);
	   
	   @Query(sort = "{ year : -1 }") 
	   List<Movie> findByTitle(String title); 
}
