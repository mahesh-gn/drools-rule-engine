package com.example.spring_drools.repository;

import com.example.spring_drools.entity.Price;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PriceRepository extends MongoRepository<Price, String> {}