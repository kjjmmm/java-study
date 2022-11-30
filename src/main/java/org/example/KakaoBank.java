package org.example;

import java.util.Scanner;

public class KakaoBank {

    private int balance;
    private String password;
    private String name;
    private String account;

    public KakaoBank(){
    }
    public KakaoBank(String name,String account, String password){
        this.name=name;
        this.account=account;
        this.password=password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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
