package otus;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


//принцип единственной ответственности - каждый класс отвечает за что-то одно. Класс депозит отвечает за заведение денег в банкомат
public class Deposit {

    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public Map<Integer, Integer> getMap() {
        return map;
    }
    //заводим купюры

    public void add(Integer bank, Integer nom) throws IOException, ClassNotFoundException {
        map.put(bank, nom);
        System.out.println(map);
    }


}
