package org.example;

import java.util.Scanner;

public class KakaoBank {

    public KakaoBank(){

        int money = 0;
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
                    int insert_money = sc.nextInt();
                    money += insert_money;
                    System.out.println("입금 되었습니다. 현재 잔액 : " + money);
                    break;
                case 2:
                    System.out.println("출금을 선택하였습니다.");
                    System.out.println("얼마를 출금하시겠습니까?.");
                    int minus_money = sc.nextInt();

                    if (money < minus_money) {
                        System.out.println("잔액이 부족 합니다. 현재 잔액: " + money);
                        break;
                    }

                    money -= minus_money;
                    System.out.println("출금 되었습니다. 현재 잔액 : " + money);
                    break;
                case 3:
                    System.out.println("잔액 확인을 선택하였습니다.");
                    System.out.println("현재 잔액 : " + money);
                    break;
                case 4:
                    System.out.println("통장 만들기를 선택하였습니다.");
                    System.out.println("성함을 입력해 주세요.");
//                    string nam = sc.next();
//                    System.out.println("통장 비밀번호를 입력해 주세요.");
//                    int pw = sc.nextInt();
//
//                    //계좌번호 생성
//                    int ran_num1 = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
//                    int ran_num2 = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
//                    string bank_num = ran_num1 + '-' + ran_num2;
//                    System.out.println("계좌 번호 :" + bank_num);
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

}
