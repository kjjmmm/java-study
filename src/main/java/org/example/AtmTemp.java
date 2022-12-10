package org.example;

import org.example.code.AtmCommand;
import org.example.repository.BankAccountRepository;
import org.example.repository.UserAssetRepository;
import org.example.service.KakaoBankTemp;

import java.util.Scanner;

public class AtmTemp {
    private static boolean active = true;
    public static void main(String[] args) {

        KakaoBankTemp bank = null;
        bank = new KakaoBankTemp(new BankAccountRepository(),new UserAssetRepository());


        /*
            1. 사용자의 커맨드를 처리하는 일 -> 은행에게 넘겨준다
         */

        while(active) {
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

            switch (getCommand()) {
                case WITHDRAW: {
                    bank.withdraw();
                    break;
                }
                case DEPOSIT: {
                    bank.deposit();
                    break;
                }
                case CREATE_ACCOUNT:{
                    bank.createAccount();
                    break;
                }
                case SEARCH_USER:{
                    System.out.println(bank.searchByName());
                    break;
                }
                case EXIT: {
                    active= false;
                   break;
                }
            }
        }
    }

    public static AtmCommand getCommand(){
        int commandId = sc.nextInt();
        return AtmCommand.getCommandById(commandId);
    }
}
