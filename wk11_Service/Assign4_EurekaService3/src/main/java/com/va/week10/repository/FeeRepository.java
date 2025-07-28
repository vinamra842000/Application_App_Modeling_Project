package com.va.week10.repository;

import com.va.week10.model.Fee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeeRepository extends MongoRepository<Fee, String> {}
