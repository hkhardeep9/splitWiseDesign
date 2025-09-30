package com.hardeep.splitwisedesign.services.strategies;

import com.hardeep.splitwisedesign.models.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
@Service("PQSettleStrategy")
public class PQSettleStrategy implements SettlementStrategy{
    private static class UserForPQ implements Comparable<UserForPQ>{
        String name;
        int amount;

        @Override
        public int compareTo(UserForPQ o) {
            return this.amount - o.amount;
        }
    }
    @Override
    public List<Transaction> settle(HashMap<String, Integer> userBalMap) {
        List<Transaction> res = new ArrayList<>();
        PriorityQueue<UserForPQ> paidMore = new  PriorityQueue<>();
        PriorityQueue<UserForPQ> paidLess = new  PriorityQueue<>();
        for(String userName: userBalMap.keySet()){
            int bal = userBalMap.get(userName);
            UserForPQ user = new UserForPQ();
            if(bal > 0){
                user.amount = bal;
                paidMore.add(user);
            }
            else{
                user.amount = Math.abs(bal);
                paidLess.add(user);
            }
        while(paidMore.size() > 0 && paidLess.size() > 0){
            UserForPQ pmUser = paidMore.remove();
            UserForPQ plUser = paidLess.remove();
            int amount = Math.min(pmUser.amount, plUser.amount);
            Transaction t = new Transaction();
            t.setAmount(amount);
            t.setFrom(plUser.name);
            t.setTo(pmUser.name);
            pmUser.amount -= amount;
            plUser.amount -= amount;
            res.add(t);
            if(pmUser.amount != 0){
                paidMore.add(pmUser);
            }
            if(plUser.amount != 0){
                paidLess.add(plUser);
            }
        }
        }
        return res;
    }
}
