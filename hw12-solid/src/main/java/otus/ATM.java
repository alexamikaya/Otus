package otus;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ATM {

    Deposit deposit = new Deposit();
    Sum sum = new Sum();
    Map<Integer,Integer> map = new HashMap<>();
    GetMoney getMoney=new GetMoney();
    Money allMoney=new Money(0,0,0,0);
    Bank bank = new Bank(0,0,0,0,0);

    //главный класс - сущность банкомата, у него должны быть свои методы и состояния (абстракция)
    //сумма в банкомате
    public void moneyATM () {

        bank.getSum(getMoney.getSumm100(),getMoney.getSumm200(),getMoney.getSumm500(),getMoney.getSumm1000());
    }
    //добавление денег в банкомат
    public void addATM (Integer a, Integer b) throws IOException, ClassNotFoundException {

        deposit.add(a,b);
        map=deposit.getMap();
    }
    public Map<Integer, Integer> getMap(){
        return map;
    }
    //подсчет купюр
    public void sumATM (Map<Integer,Integer> map) throws IOException, ClassNotFoundException {
        sum.howMuch(map);
    }
    public int getSum100() {

        return sum.getSum100();
    }
    public int getSum200() {

        return sum.getSum200();
    }
    public int getSum500() {

        return sum.getSum500();
    }
    public int getSum1000() {
        return sum.getSum1000();
    }
    //выдача денег
    public void getATM (Integer money, Integer b, Integer c, Integer d, Integer e) throws IOException, ClassNotFoundException {

        getMoney.getMymoney(money, b, c, d, e);

    }


}
