package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Crop;

public interface CropRepository extends JpaRepository<Crop, Long> {


}
