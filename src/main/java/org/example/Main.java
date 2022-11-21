package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("안녕하세요 카카오 뱅크입니다.");
            System.out.println("어떤 업무를 보시겠습니까?");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액 확인");
            System.out.println("4. 종료");
            int select_number = sc.nextInt();

            if(select_number==1){
                System.out.println("입금을 선택하였습니다.");
            }else if(select_number==2){
                System.out.println("출금을 선택하였습니다.");
            }else if(select_number==3){
                System.out.println("잔액 확인을 선택하였습니다.");
            }else if(select_number==4){
                System.out.println("안녕히 가십시오.");
                break;
            }

        }






    }
}