package com.app.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.YourEntity;
import com.app.repo.Repository;

@RestController
public class MyController {

	
	 @Autowired
	    private Repository repository;

	 @PostMapping("/post")
	 public void saveData(@RequestBody YourEntity data) {
		 repository.save(data);
	 }
	 
	 
		/*
		 * @GetMapping("/filterbydate") public List<YourEntity> filterByDate(
		 * 
		 * @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
		 * 
		 * @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) { return
		 * repository.findByDateFieldBetween(startDate, endDate); }
		 */
	 
	 
	 
	 
	 
	  @GetMapping("/filterbydate")
	    public List<YourEntity> filterByDate(
	            @RequestParam @DateTimeFormat(iso= ISO.DATE) Date startDate,
	            @RequestParam @DateTimeFormat(iso= ISO.DATE) Date endDate) {
	        return repository.findByDateFieldBetween(startDate, endDate);
	    }
}
