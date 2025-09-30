package com.hardeep.splitwisedesign.services.strategies;

import com.hardeep.splitwisedesign.models.Transaction;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
@Service
public interface SettlementStrategy {
    List<Transaction> settle(HashMap<String,Integer> userBalMap);
}
