package lecture04;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    ArrayList<Account> accountList = new ArrayList<>();
    public ATM () {
        List<Account> accountList = new ArrayList<>();
    }
    public void registerAccount (String name, String number) {
        Account a = new Account(name,number);
        accountList.add(a);
        System.out.println(name + "さんのアカウントを口座番号：" + number + "で登録しました。");
    }
    public  boolean exitsAccount (String name, String number) {
        for (Account account : accountList) {
            if (name == account.getName() && number == account.getNumber()) {
                System.out.println("名前：" + name + "口座番号：" + number + "は存在します");
                return true;
            }
        }
        System.out.println("名前" + name + "口座番号：" + number + "は存在しません");
        return true;

    }
    public   void deposit (String number, long money) {
        for (Account account : accountList) {
            if (number == account.getNumber()) {
                account.setBalance(account.getBalance() + money);
            }
            System.out.println("口座番号：" + number + "に" + money + "円入金しました。");
        }
    }
    public   long withdraw (String number, long money) {
        for (Account account : accountList) {
            if (number == account.getNumber()) {
                if (money > account.getBalance()) {
                    System.out.println("口座番号：" + number + "から" + money + "引き出せませんでした。残高：" + account.getBalance() + "円");
                }else {
                    account.setBalance(account.getBalance() - money);
                    System.out.println("口座番号：" + number + "から" + money + "引き出しました。残高：" + account.getBalance() + "円");
                    return account.getBalance();
                }
            }
        }
    return 0;
    }
}
