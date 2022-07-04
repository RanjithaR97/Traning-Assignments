package com.springMongo.SpringMongoCrud.Rep;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springMongo.SpringMongoCrud.model.BookStore;



public interface BookRepo extends MongoRepository<BookStore,Integer> {

}
