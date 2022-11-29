package org.example;

public class Account {

    private String accountNumber;
    private String password;
    private String name;
    private int balance;

    public Account(){

    }

    public Account(String accountNumber, String password, String name, int balance){
        this.accountNumber=accountNumber;
        this.password=password;
        this.name=name;
        this.balance=balance;
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
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance -= amount;
    }



}
