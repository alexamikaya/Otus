package otus;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ATM implements worldATM {

    private Deposit deposit = new Deposit();
    private Sum sum = new Sum();
    private Map<Integer, Integer> map = new HashMap<>();
    private GetMoney getMoney = new GetMoney();

    //главный класс - сущность банкомата, у него должны быть свои методы и состояния (абстракция)

    //добавление денег в банкомат
    @Override
    public void add(int numberBills, int typeBill) {

        deposit.add(typeBill, numberBills);
        map = deposit.getMap();
    }

    @Override
    public Map<Integer, Integer> getMapBill() {
        return map;
    }

    //подсчет суммы
    @Override
    public void sum(Map<Integer, Integer> map) throws IOException, ClassNotFoundException {
        sum.howMuch(map);
    }


    //выдача денег
    @Override
    public void get(int money, Map<Integer, Integer> getMap) throws IOException, ClassNotFoundException {

        getMoney.getMymoney(money, getMap);
        map = getMoney.getFinalSum();

    }


}
