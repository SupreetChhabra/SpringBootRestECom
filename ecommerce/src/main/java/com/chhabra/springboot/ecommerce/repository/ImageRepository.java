package com.chhabra.springboot.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chhabra.springboot.ecommerce.entity.Images;

@Repository
public interface ImageRepository extends JpaRepository<Images, Integer>{

}
