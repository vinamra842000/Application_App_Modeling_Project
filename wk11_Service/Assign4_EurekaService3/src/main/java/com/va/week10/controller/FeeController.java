package com.va.week10.controller;

import com.va.week10.model.Fee;
import com.va.week10.repository.FeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fees")
public class FeeController {

    @Autowired
    private FeeRepository feeRepository;

    @PostMapping
    public Fee applyFee(@RequestBody Fee fee) {
        return feeRepository.save(fee);
    }

    @GetMapping
    public List<Fee> getAllFees() {
        return feeRepository.findAll();
    }
}
