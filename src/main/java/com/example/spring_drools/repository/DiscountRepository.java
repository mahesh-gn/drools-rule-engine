package com.example.spring_drools.repository;

import com.example.spring_drools.entity.Discount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DiscountRepository extends MongoRepository<Discount, String> {}