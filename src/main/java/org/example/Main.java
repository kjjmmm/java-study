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

                        String accountForDeposit = bank.inputAccount();
                        if(bank.isExistAccount(accounts,accountForDeposit)==null){
                            System.out.println("없는 계좌번호 입니다. 메뉴로 돌아갑니다.");
                            break;
                        }

                        System.out.println("얼마를 넣으시겠습니까?");
                        int deposit = sc.nextInt();

                        bank.deposit(accounts, accountForDeposit, deposit);
                        break;

                case 2: System.out.println("출금을 선택하였습니다.");

                        String accountForWithdraw = bank.inputAccount();
                        if(bank.isExistAccount(accounts,accountForWithdraw)==null){
                            System.out.println("없는 계좌번호 입니다. 메뉴로 돌아갑니다.");
                            break;
                        }

                        System.out.println("계좌 비밀번호를 입력해 주세요.");
                        int passwordForCheckWithdraw = sc.nextInt();
                        boolean checkPasswordForWithdraw = bank.checkAccountPassword(accounts, accountForWithdraw, passwordForCheckWithdraw);

                        if(checkPasswordForWithdraw==false){
                            System.out.println("비밀번호가 다릅니다.");
                            break;
                        }

                        System.out.println("얼마를 출금하시겠습니까?.");
                        int withdraw = sc.nextInt();

                        bank.withdraw(accounts, accountForWithdraw, withdraw);
                        break;

                case 3: System.out.println("잔액 확인을 선택하였습니다.");
                        String accountForCheckBalance = bank.inputAccount();
                        if(bank.isExistAccount(accounts,accountForCheckBalance)==null){
                            System.out.println("없는 계좌번호 입니다. 메뉴로 돌아갑니다.");
                            break;
                        }
                        System.out.println("계좌 비밀번호를 입력해 주세요.");
                        int passwordForCheckBalance = sc.nextInt();
                        boolean checkPasswordForBalance = bank.checkAccountPassword(accounts, accountForCheckBalance, passwordForCheckBalance);

                        if(checkPasswordForBalance==false){
                            System.out.println("비밀번호가 다릅니다.");
                            break;
                        }
                        bank.checkBalance(accounts, accountForCheckBalance);
                        break;

                case 4: System.out.println("계좌 개설을 선택하셨습니다.");
                        System.out.println("이름을 입력해 주세요.");
                        String name = sc.next();
                        System.out.println("계좌번호로 사용할 전화번호를 입력해 주세요.");
                        String phoneNumber = sc.next();
                        System.out.println("비밀번호를 입력해 주세요.");
                        int password2 = sc.nextInt();

                        KakaoBank account = new KakaoBank(name,phoneNumber,password2);
                        accounts.add(account);
                        System.out.println("계좌를 생성 했습니다.");
                        break;

                case 5: System.out.println("계좌 리스트를 출력합니다.");
                        bank.printAccounts(accounts);
                        break;

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