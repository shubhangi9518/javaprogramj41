package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Crop;
import com.service.CropService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CropController {

	@Autowired
	CropService cropService;
	
	@PostMapping("/add")
	public ResponseEntity<Crop> saveCrop(@RequestBody Crop crop) {
		Crop c=cropService.saveCrop(crop);
	    return  ResponseEntity.status(HttpStatus.CREATED).header("add", "Crop added").body(c);

	}
	@GetMapping("/getAll")
	public List<Crop> getAll() {
		return cropService.getAll();
	}

	

	
}
