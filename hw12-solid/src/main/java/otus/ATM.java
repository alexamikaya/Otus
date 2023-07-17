package otus;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ATM implements worldATM {

    private Deposit deposit = new Deposit();
    private Sum sum = new Sum();
    private Map<Integer, Integer> map = new HashMap<>();
    private GetMoney getMoney = new GetMoney();
    private Bank bank = new Bank(0, 0, 0, 0, 0);

    //главный класс - сущность банкомата, у него должны быть свои методы и состояния (абстракция)
    //сумма в банкомате
    @Override
    public void money() {

        bank.getSum(getMoney.getSummNom1(), getMoney.getSummNom2(), getMoney.getSummNom3(), getMoney.getSummNom4());
    }

    //добавление денег в банкомат
    @Override
    public void add(int numberBills, int typeBill) throws IOException, ClassNotFoundException {

        deposit.add(numberBills, typeBill);
        map = deposit.getMap();
    }

    @Override
    public Map<Integer, Integer> getMapBill() {
        return map;
    }

    //подсчет купюр
    @Override
    public void sum(Map<Integer, Integer> map) throws IOException, ClassNotFoundException {
        sum.howMuch(map);
    }

    @Override
    public int getSumNom1() {

        return sum.getSumNom1();
    }

    @Override
    public int getSumNom2() {

        return sum.getSumNom2();
    }

    @Override
    public int getSumNom3() {

        return sum.getSumNom3();
    }

    @Override
    public int getSumNom4() {
        return sum.getSumNom4();
    }

    //выдача денег
    @Override
    public void get(int money, int nom1, int nom2, int nom3, int nom4) {

        getMoney.getMymoney(money, nom1, nom2, nom3, nom4);

    }


}
