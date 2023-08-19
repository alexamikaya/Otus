package otus;

import java.util.HashMap;
import java.util.Map;


//принцип единственной ответственности - каждый класс отвечает за что-то одно. Класс депозит отвечает за заведение денег в банкомат
public class Deposit {

    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    Money money = new Money(0, 0, null);
    Map<Integer, Integer> finalSum = money.setSum();

    public Map<Integer, Integer> getMap() {
        finalSum = map;
        return map;
    }
    //заводим купюры

    public void add(Integer bank, Integer nom) {
        map.put(bank, nom);

    }


}
