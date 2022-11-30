package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<KakaoBank> accounts = new ArrayList<KakaoBank>();

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
            System.out.println("4. 계좌 개설");
            System.out.println("5. 계좌 리스트 출력");
            System.out.println("6. 종료");


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

                case 4: System.out.println("계좌 개설을 선택하셨습니다.");
                        System.out.println("이름을 입력해 주세요.");
                        String name = sc.next();
                        System.out.println("계좌번호로 사용할 전화번호를 입력해 주세요.");
                        String phoneNumber = sc.next();
                        System.out.println("비밀번호를 입력해 주세요.");
                        String password = sc.next();

                        KakaoBank account = new KakaoBank(name,phoneNumber,password);
                        accounts.add(account);
                        System.out.println("계좌를 생성 했습니다.");
                        break;
                case 5: System.out.println("계좌 리스트를 출력합니다.");

                        for(int i=0; i<accounts.size(); i++){
                            String p_name = accounts.get(i).getName();
                            String p_account = accounts.get(i).getAccount();
                            String p_password = accounts.get(i).getPassword();
                            int p_balance = accounts.get(i).getBalance();

                            System.out.println(p_name+" | "+p_account+" | "+p_password+" | "+p_balance);
                        }


                case 6: System.out.println("시스템을 종료합니다.");
                        System.out.println("안녕히 가십시오.");
                        break;
            }

            if (selection == 6) {
                break;
            }
        }

    }


}