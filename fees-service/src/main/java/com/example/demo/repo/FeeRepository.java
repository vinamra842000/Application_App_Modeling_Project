package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.model.FeeEntity;

public interface FeeRepository extends MongoRepository<FeeEntity, String> { }
