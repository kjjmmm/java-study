package org.example;

import java.util.Scanner;

public class KakaoBank {

    private int balance;
    public KakaoBank(){
        menu();
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("***********************.");
            System.out.println("안녕하세요 카카오 뱅크입니다.");
            System.out.println("***********************.");
            System.out.println("어떤 업무를 보시겠습니까?");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액 확인");
            System.out.println("4. 통장 만들기");
            System.out.println("5. 종료");

            int selection = sc.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("입금을 선택하였습니다.");
                    System.out.println("얼마를 넣으시겠습니까?.");
                    int depositAmount = sc.nextInt();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("출금을 선택하였습니다.");
                    System.out.println("얼마를 출금하시겠습니까?.");
                    int withdrawAmount = sc.nextInt();
                    withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("잔액 확인을 선택하였습니다.");
                    System.out.println("현재 잔액 : " + balance);
                    break;
                case 4:
                    System.out.println("통장 만들기를 선택하였습니다.");
                    break;
                case 5:
                    System.out.println("안녕히 가십시오.");
                    break;
            }

            if (selection == 5) {
                break;
            }

        }

    }
    public void deposit(int amount){
        this.balance += amount;
        System.out.println(amount+"원이 입금되었습니다.");
    }
    public void withdraw(int amount){
        if(balance < amount){
            System.out.println("잔액이 부족합니다.");
        }else{
            this.balance -= amount;
            System.out.println(amount+"원이 출금되었습니다.");
            System.out.println("남은 금액 : "+balance);
        }
    }

}
