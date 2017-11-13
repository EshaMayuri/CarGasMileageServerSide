package com.example.todoapp.repositories;

import com.example.todoapp.models.CarDetailsCollection;
import com.example.todoapp.models.MileageCollection;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDetailsRepository extends MongoRepository<CarDetailsCollection, String> {
	CarDetailsCollection findByEmailId(String emailId);
}