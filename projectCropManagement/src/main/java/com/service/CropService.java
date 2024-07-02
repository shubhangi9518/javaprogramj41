package com.service;

import java.util.List;

import com.model.Crop;

public interface CropService {

	public Crop saveCrop(Crop crop);
	public List<Crop> getAll();
}
