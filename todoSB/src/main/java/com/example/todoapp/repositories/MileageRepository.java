package com.example.todoapp.repositories;

import com.example.todoapp.models.MileageCollection;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * The main interface for manipulating MileageCollection
 * Mostly uses framework provided methods
 * @author Merwan
 *
 */
@Repository
public interface MileageRepository extends PagingAndSortingRepository<MileageCollection, String> {

	MileageCollection findByDate(String date);
	
}