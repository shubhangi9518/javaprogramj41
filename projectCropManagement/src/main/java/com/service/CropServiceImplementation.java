package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CropRepository;
import com.model.Crop;

@Service
public class CropServiceImplementation implements CropService{

	@Autowired
	CropRepository cropRepo;

	@Override
	public Crop saveCrop(Crop crop) {
		return cropRepo.save(crop);
	}

	@Override
	public List <Crop> getAll() {
		return cropRepo.findAll();
	}

	
	
}
