package org.example.repository;

import org.example.repository.data.BankAccount;

import java.util.HashMap;
import java.util.Map;

public class BankAccountRepository {
    private Map<Long, BankAccount> accountDb = new HashMap<>();
    private long autoIncrement;
    /*
        1. 저장
        2. id로 조회
        3. card_id로 조회
     */
    public void save(BankAccount bankAccount){
        //있는지 조회
        if(findById(bankAccount.getId())!= null)
            throw new RuntimeException("이미 존재하는 계좌입니다.");
        bankAccount.setId(++autoIncrement);
        accountDb.put(bankAccount.getId(),bankAccount);
    }

    public BankAccount findById(Long id){
        return null;
    }

    public BankAccount findByCardId(Long cardId){
        return null;
    }

    public BankAccount findByName(String name) {
        for (BankAccount account : accountDb.values()) {
            if(account.getName().equals(name))
                return account;
        }
        return null;
    }
}
