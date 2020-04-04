package com.Repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.POJO.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {

	
	   List<Movie> findByTitleLike(String lastname);
	   List<Movie> findByCountryIn(Collection<?> countries);
	   List <Movie> deleteByTitle(String title);
}
