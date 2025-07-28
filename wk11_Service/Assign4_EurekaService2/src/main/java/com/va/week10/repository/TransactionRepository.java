package com.va.week10.repository;

import com.va.week10.model.AccountTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<AccountTransaction, String> {}
