package com.springMongo.SpringMongoCrud.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springMongo.SpringMongoCrud.Rep.BookRepo;
import com.springMongo.SpringMongoCrud.model.BookStore;

@RestController
@RequestMapping("/book")
public class Controller {
	
	@Autowired
	 BookRepo repo;
	
	@GetMapping("/books")
	public List<BookStore> allBooks() 
	{
		List<BookStore> list=new ArrayList<>();
		Iterator<BookStore> it=repo.findAll().iterator();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
		
	}
	@GetMapping("/book/{id}")
	public BookStore getBook(@PathVariable Integer id) {
		return repo.findById(id).get();
	}
	@PostMapping("/addBook")
	public void addbook(@RequestBody BookStore book) {
		repo.save(book);
	}
	@PutMapping("/updateBook")
	public void updatebook(@RequestBody BookStore book) {
		repo.save(book);
		
	}  
	@DeleteMapping("/DeleteBook/{id}")
	public String  deletebook(Integer id) {
		repo.deleteById(id);
		return "deleted successfully";

	}

}
