package com.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.POJO.Movie;
import com.Repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	//@Qualifier("leaveTrackingRepository")
	private MovieRepository movieRepo;
	
	
    @Override
	public List<Movie> findAll() {
    
    	System.out.println( movieRepo.findAll()+"kjdsjkjhdjkj");
		return   movieRepo.findAll();
	}
    
   
 
@Override
	public List<Movie> findByTitleLike(String name) {
		List<Movie> result=movieRepo.findByTitleLike(name);
		System.out.println(movieRepo.findByTitleLike(name));
		return result;
		
	}

	@Override
	public void save(Movie theMovie) {
		movieRepo.save(theMovie);
	}



	@Override
	public List<Movie> findByCountryIn(Collection countries) {
		return  movieRepo.findByCountryIn(countries);
	}



	@Override
	public List<Movie> deleteByTitle(String title) {
		// TODO Auto-generated method stub
		return movieRepo.deleteByTitle(title);
	}

	/*@Override
	
	public void deleteById(int theId) {
		movieRepo.deleteById(theId);
	}

	@Override
	public List<Object> findMaxSalByDepartment() {
		return movieRepo.findMaxSalByDepartment();
	}

	@Override
	public List<Movie> findByFirstName(String firstName) {
		return movieRepo.findByFirstName(firstName);
	}
	*/
   
}
