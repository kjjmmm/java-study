package org.example;

import java.util.Scanner;

public class KakaoBank {

    private int balance;
    private String password;
    private String name;

    public KakaoBank(){
    }

    public void deposit(int amount){
        if(amount<=0){
            System.out.println("금액을 정확히 입력해 주세요.");
            return;
        }
        balance += amount;
    }
    public void withdraw(int amount){
        if(balance < amount){
            System.out.println("보유 잔액이 부족합니다.");
            return;
        }
        balance -= amount;
    }
    public int retainAmount(){
        return balance;
    }
}
