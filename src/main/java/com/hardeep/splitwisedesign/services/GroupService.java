package com.hardeep.splitwisedesign.services;

import com.hardeep.splitwisedesign.models.Transaction;
import com.hardeep.splitwisedesign.services.strategies.PQSettleStrategy;
import com.hardeep.splitwisedesign.services.strategies.SettlementStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GroupService {

    private SettlementStrategy settlementStrategy;
    @Autowired
    public void GroupService(@Qualifier("PQSettleStrategy") SettlementStrategy settlementStrategy) {
        this.settlementStrategy = settlementStrategy;
    }
    public List<Transaction> settle(Long groupId){
        //Call expense repository for getting all expenses for this group
        // call expense repository for getting all expense shared by
        // call expense repostory for getting all expense paid by
        //Make the hashmap
        HashMap<String, Integer> userBalHashMap = new HashMap<>();
        List<Transaction> transactionList = settlementStrategy.settle(userBalHashMap);
        return transactionList;

    }
}
