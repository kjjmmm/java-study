package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        KakaoBank bank = new KakaoBank();
        while(true) {

            System.out.println("***********************.");
            System.out.println("안녕하세요 카카오 뱅크입니다.");
            System.out.println("***********************.");
            System.out.println("어떤 업무를 보시겠습니까?");
            System.out.println("번호를 입력해 주세요.");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액 확인");
            System.out.println("4. 종료");

            int selection = sc.nextInt();

            switch (selection) {
                case 1: System.out.println("입금을 선택하였습니다.");
                        System.out.println("얼마를 넣으시겠습니까?.");
                        int deposit = sc.nextInt();
                        bank.deposit(deposit);
                        System.out.println(deposit+"원을 입금하였습니다.");
                        System.out.println("현재 보유 금액은 "+bank.retainAmount()+"원 입니다.");
                        break;

                case 2: System.out.println("출금을 선택하였습니다.");
                        System.out.println("얼마를 출금하시겠습니까?.");
                        int withdraw = sc.nextInt();
                        System.out.println(withdraw+"원을 출금하였습니다.");
                        bank.withdraw(withdraw);
                        System.out.println("현재 보유 금액은 "+bank.retainAmount()+"원 입니다.");
                        break;

                case 3: System.out.println("잔액 확인을 선택하였습니다.");
                        System.out.println("현재 보유 금액은 "+bank.retainAmount()+"원 입니다.");
                        break;

                case 4: System.out.println("시스템을 종료합니다.");
                        System.out.println("안녕히 가십시오.");
                        break;
            }

            if (selection == 4) {
                break;
            }
        }

    }


}