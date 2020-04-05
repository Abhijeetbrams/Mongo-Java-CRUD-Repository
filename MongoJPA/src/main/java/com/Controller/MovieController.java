package com.Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.POJO.Movie;
import com.POJO.Respose;
import com.Service.MovieService;
//import com.POJO.Department;
@RestController

@RequestMapping("/api")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movies")
	public List<Movie> findAll()
	{
	 
		
		return  movieService.findAll();
		
	}

	@GetMapping("/movies/get")
	public List<Movie> findByTitleLike(@RequestParam("title")String name)
	{
		System.out.println("Atleast Reached");
		System.out.println(movieService.findByTitleLike(name));
		return movieService.findByTitleLike(name);
	
	}
	
	
	
	@PostMapping("/movies")
	public ResponseEntity<Respose> save(@RequestBody Movie theMovie)
	{
		
		movieService.save(theMovie);
		Respose response = new Respose();
		response.setCode(HttpStatus.CREATED.toString());
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   
		response.setDate(dtf.format(now));
		response.setMessage("Succesfully Inserted");
		
		return new ResponseEntity(response,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/movies")
	public List<Movie> deleteByTitle(@RequestParam("title")String title)
	{
		return movieService.deleteByTitle(title);
	}
	
	@GetMapping("/movies/get1")
	List<Movie> findByCountriesIn(@RequestParam("country")List<String> countries)
	{
		return movieService.findByCountriesIn(countries);
	}
	
	@GetMapping("movies/title")
	List<Movie> findByTheMoviesTitle(@RequestParam("title")String title)
	{
		return movieService.findByTheMoviesTitle(title);
	}
	
	@GetMapping("movies/sort")
	public List<Movie> findByTitle(@RequestParam("title")String title) 
	{
		return movieService.findByTitle(title);
	}

}
