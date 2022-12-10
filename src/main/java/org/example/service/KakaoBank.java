package org.example.service;

import java.util.ArrayList;
import java.util.Scanner;

public class KakaoBank {

    private int balance;
    private int password;
    private String name;
    private String account;

    public KakaoBank(){}
    public KakaoBank(String name,String account, int password){
        this.name=name;
        this.account=account;
        this.password=password;
    }

    public void deposit(ArrayList<KakaoBank> accounts, String inputAccount, int amount){

        KakaoBank account = isExistAccount(accounts, inputAccount);

        if(amount<=0){
            System.out.println("금액을 정확히 입력해 주세요.");
            return;
        }
        account.balance += amount;

        System.out.println("입금되었습니다.");
        System.out.println("보유 금액은 "+account.balance+"원 입니다.");

    }

    public void withdraw(ArrayList<KakaoBank> accounts, String inputAccount, int amount){

        KakaoBank account = isExistAccount(accounts, inputAccount);

        if(account.balance < amount){
            System.out.println("보유 잔액이 부족합니다.");
            return;
        }
        account.balance -= amount;
        System.out.println("출금되었습니다.");
        System.out.println("보유 금액은 "+account.balance+"원 입니다.");

    }

    public void printAccounts(ArrayList<KakaoBank> accounts) {

        System.out.println("이름 | 계좌번호 | 비밀번호 | 잔액");
        for(int i=0; i<accounts.size(); i++){
            String p_name = accounts.get(i).name;
            String p_account = accounts.get(i).account;
            int p_password = accounts.get(i).password;
            int p_balance = accounts.get(i).balance;
            System.out.println(p_name+" | "+p_account+" | "+p_password+" | "+p_balance);
        }
    }
    public KakaoBank isExistAccount(ArrayList<KakaoBank> accounts, String account){

        for(int i=0; i<accounts.size(); i++){
            if(account.equals(accounts.get(i).account)){
                return accounts.get(i);
            }
        }
        return null;
    }

    public String inputAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호를 입력해 주세요.");
        String inputAccount = sc.next();
        return inputAccount;
    }

    public boolean checkAccountPassword(ArrayList<KakaoBank> accounts, String inputAccount, int password){
        KakaoBank account = isExistAccount(accounts, inputAccount);
        if(account.password==password){
            return true;
        }
        return false;
    }
    public void checkBalance(ArrayList<KakaoBank> accounts, String inputAccount){

        KakaoBank account = isExistAccount(accounts, inputAccount);
        System.out.println("보유 금액은 : " +account.balance+"원 입니다.");

    }


}
