package com.example.todoapp.controllers;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todoapp.models.CarDetailsCollection;
import com.example.todoapp.models.MileageCollection;
import com.example.todoapp.repositories.CarDetailsRepository;
import com.example.todoapp.repositories.MileageRepository;
/**
 * The Main controller for fetching and updating the application data
 * @author Merwan 
 *
 */
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TodoController {

   
    @Autowired
    MileageRepository mileageRepository;
    
    @Autowired
    CarDetailsRepository carDetailsRepository;
    
    /**
     * Inserts MilelageCollection information 
     * @param mc the MileageCollection to be inserted
     * @return
     */
    @PostMapping("/insertMileageCollection")
    public ResponseEntity<MileageCollection> insertMileageCollection(@Valid @RequestBody MileageCollection mc) {
    	 MileageCollection mileageData = mileageRepository.findByDate(mc.getDate());
    	 if(mileageData == null){
    		 mileageRepository.save(mc);
    		 return new ResponseEntity<>(mc, HttpStatus.OK);
    	 }
    	 else{
    		 	mileageData.setDistance(mc.getDistance());
    	        mileageData.setGasRemaining(mc.getGasRemaining());
    	        mileageData.setMileage(mc.getMileage());
    	        mileageData.setRange(mc.getRange());
    	        mileageData.setTotalDistance(mc.getTotalDistance());
    	        mileageData.setTotalGas(mc.getTotalGas());
    	        mileageData.setTotalGasCost(mc.getTotalGasCost());
    	        mileageRepository.save(mileageData);
    	        return new ResponseEntity<>(mileageData, HttpStatus.OK);
    	 }
       
    }
    
    /**
     * Gets the Mileage collection according to the given date
     * @param date the search criteria
     * @return
     */
    @GetMapping(value="/getMileageCollection/{date}")
    public ResponseEntity<MileageCollection> getMileageCollection(@PathVariable("date") String date) {
    	
      MileageCollection mileage = mileageRepository.findByDate(date);
        if(mileage == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(mileage, HttpStatus.OK);
        }
    }
    @GetMapping(value="/getAllMileageCollections")
    public List<MileageCollection> getAllMileageCollections() {
    	
      return (List<MileageCollection>) mileageRepository.findAll();
    }
    
    /**
     * Inserts and updates car details
     * @param cd the cars details object to be inserted
     * @return
     */
    @PostMapping("/insertCarDetails")
    public ResponseEntity<CarDetailsCollection> insertCarDetails(@RequestBody CarDetailsCollection cd) {
    	return insertData(cd);      
    }

	private ResponseEntity<CarDetailsCollection> insertData(CarDetailsCollection cd) {
		CarDetailsCollection carData = carDetailsRepository.findByEmailId(cd.getEmailId());
    	if(carData == null){
    		carDetailsRepository.save(cd);
    		return  new ResponseEntity<>(cd, HttpStatus.OK);
    	}
    	else{
    		if(StringUtils.isNotBlank(cd.getFuel()) && !cd.getFuel().equals(carData.getFuel())){
            	carData.setFuel(cd.getFuel());
            }
    		if(StringUtils.isNotBlank(cd.getMileage()) && !cd.getMileage().equals(carData.getMileage())){
    			carData.setMileage(cd.getMileage());
    		}
    		if(StringUtils.isNotBlank(cd.getOdometer()) && !cd.getOdometer().equals(carData.getOdometer())){
    			carData.setOdometer(cd.getOdometer());
    		}
    		if(StringUtils.isNotBlank(cd.getTotalGas()) && !cd.getTotalGas().equals(carData.getTotalGas())){
    			carData.setTotalGas(cd.getTotalGas());
    		}
    		if(StringUtils.isNotBlank(cd.getTotalGasCost()) && !cd.getTotalGasCost().equals(carData.getTotalGasCost())){
    			carData.setTotalGasCost(cd.getTotalGasCost());
    		}
    		carDetailsRepository.save(carData);
    	}
         return new ResponseEntity<>(carData, HttpStatus.OK);
	}
    
	
    /**
     * Fetches the car details for the given email address
     * @param emailId the email address used in the search
     * @return
     */
    @GetMapping(value="/getCarDetails/{emailId}")
    public ResponseEntity<CarDetailsCollection> getCarDetails(@PathVariable("emailId") String emailId) {
    	
    	CarDetailsCollection carDetials = carDetailsRepository.findByEmailId(emailId);
        if(carDetials == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(carDetials, HttpStatus.OK);
        }
    }
    /**
     * Gets all the cars details
     * @return
     */
    @GetMapping(value="/getAllCarDetails")
    public List<CarDetailsCollection> getAllCarDetails() {
    	
      return (List<CarDetailsCollection>) carDetailsRepository.findAll();
    }
    
 
}