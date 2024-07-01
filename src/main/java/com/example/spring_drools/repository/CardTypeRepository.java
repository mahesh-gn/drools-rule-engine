package com.example.spring_drools.repository;

import com.example.spring_drools.entity.CardType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardTypeRepository extends MongoRepository<CardType, String> {}
