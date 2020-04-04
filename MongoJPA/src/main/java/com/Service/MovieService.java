package com.Service;

import java.util.Collection;
import java.util.List;

import com.POJO.Movie;

public interface MovieService {

    public List<Movie> findAll();
	
	//public Movie findById(int theId);
//	
	public void save(Movie theMovie);
//	
//	public void deleteById(int theId);

	List<Movie> findByTitleLike(String name);
	
	List<Movie> findByCountryIn(Collection<String> countries);
	
	List <Movie> deleteByTitle(String title);
	//findByAgeBetween(int from, int to)
	//findByAgeBetween(Range<Integer> range)
//	public List<Object> findMaxSalByDepartment();
	
//	 public List<Movie> findByFirstName(String firstName);
	
	//public void saveOrUpdate(Department theDepartment);
}
