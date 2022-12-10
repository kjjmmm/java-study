package org.example.service;

import org.example.AtmTemp;
import org.example.InputReader;
import org.example.repository.BankAccountRepository;
import org.example.repository.UserAssetRepository;
import org.example.repository.data.BankAccount;

public class KakaoBankTemp {

    private BankAccountRepository bankAccountRepository;
    private UserAssetRepository userAssetRepository;

    public KakaoBankTemp(BankAccountRepository bankAccountRepository, UserAssetRepository userAssetRepository) {
        this.bankAccountRepository = bankAccountRepository;
        this.userAssetRepository = userAssetRepository;
    }

    public BankAccountRepository getBankAccountRepository() {
        return bankAccountRepository;
    }

    public void setBankAccountRepository(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public UserAssetRepository getUserAssetRepository() {
        return userAssetRepository;
    }

    public void setUserAssetRepository(UserAssetRepository userAssetRepository) {
        this.userAssetRepository = userAssetRepository;
    }

    public void deposit() {

    }

    public void withdraw() {

    }
    public void createAccount(){
        System.out.println("이름을 입력해주세요.");
        String name = InputReader.readLine();
        System.out.println("비밀번호을 입력해주세요.");
        String pw = AtmTemp.sc.next();
        BankAccount newAccount = new BankAccount(name, pw);
        bankAccountRepository.save(newAccount);
    }

    public BankAccount searchByName() {
        System.out.println("이름을 입력해주세요.");
        String name = AtmTemp.sc.next();
        return bankAccountRepository.findByName(name);
    }
}
