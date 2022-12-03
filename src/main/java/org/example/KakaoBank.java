package org.example;

import java.util.ArrayList;
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

    public void printAccounts(ArrayList<KakaoBank> accounts) {

        for(int i=0; i<accounts.size(); i++){
            String p_name = accounts.get(i).getName();
            String p_account = accounts.get(i).getAccount();
            String p_password = accounts.get(i).getPassword();
            int p_balance = accounts.get(i).getBalance();
            System.out.println("이름 | 계좌번호 | 비밀번호 | 잔액");
            System.out.println(p_name+" | "+p_account+" | "+p_password+" | "+p_balance);
        }
    }
    public boolean isExistAccount(ArrayList<KakaoBank> accounts){

        Scanner sc = new Scanner(System.in);

        System.out.println("계좌번호를 입력해 주세요.");
        String account = sc.next();
        for(int i=0; i<accounts.size(); i++){
            if(account.equals(accounts.get(i).getAccount())){
                return true;
            }
        }
        return false;
    }


}
