package com.k8u.igo.demo.springmongodb.repository;

import com.k8u.igo.demo.springmongodb.model.dto.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
