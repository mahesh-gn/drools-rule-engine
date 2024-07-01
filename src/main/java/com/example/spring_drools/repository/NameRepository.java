package com.example.spring_drools.repository;

import com.example.spring_drools.entity.Name;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NameRepository extends MongoRepository<Name, String> {}