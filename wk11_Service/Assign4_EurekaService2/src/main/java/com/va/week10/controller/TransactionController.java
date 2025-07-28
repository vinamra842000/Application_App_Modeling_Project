package com.va.week10.controller;

import com.va.week10.model.AccountTransaction;
import com.va.week10.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @PostMapping
    public AccountTransaction addTransaction(@RequestBody AccountTransaction tx) {
        return transactionRepository.save(tx);
    }

    @GetMapping
    public List<AccountTransaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
}
