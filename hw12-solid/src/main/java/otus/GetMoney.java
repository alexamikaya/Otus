package otus;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//принцип единственной ответственности - каждый класс отвечает за что-то одно. Класс getMoney выдает запрошенную сумму имеющимися купюрами
public class GetMoney {
    Money getMoney = new Money(0, 0, null);
    Map<Integer, Integer> finalSum = getMoney.setSum();
    Sum sum = new Sum();


    public void getMymoney(int i, Map<Integer, Integer> getMap) {


        HashMap<Integer, Integer> finalMap = new HashMap<>();
        finalSum = getMap;
        HashMap<Integer, Integer> getMyMoney = new HashMap<>();
        int ostatok = i;
        ArrayList<Integer> list = sum.getMoney(getMap);
        int sumList = 0;
        for (int r = 0; r < list.size(); r++)
            sumList += list.get(r);

        if (i > 0 & i < sumList) {
            for (Map.Entry<Integer, Integer> entry : getMap.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                if (ostatok < key) {
                    finalMap.put(key, value);

                } else if (ostatok / 2 <= key) {

                    int transit = ostatok / key;
                    ostatok = ostatok - (transit * key);
                    finalMap.put(key, value - 1);
                    getMyMoney.put(key, transit);

                } else if (ostatok < key * value) {

                    int transit = ostatok / key;
                    ostatok = ostatok - (transit * key);
                    finalMap.put(key, value - transit);
                    getMyMoney.put(key, transit);

                } else if (ostatok > key * value) {

                    ostatok = ostatok - (value * key);
                    finalMap.put(key, 0);
                    getMyMoney.put(key, value);

                } else {
                    finalMap.put(key, value);
                }
            }

        }
        if (ostatok != 0) {
            for (Map.Entry<Integer, Integer> entry : finalMap.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                if (ostatok == key & value != 0) {
                    ostatok = ostatok - key;
                    finalMap.put(key, value - 1);
                    ArrayList<Integer> listOfKeys = new ArrayList(getMyMoney.keySet());
                    Iterator<Integer> itr = listOfKeys.iterator();
                    int result = 0;
                    while (itr.hasNext()) {
                        if (itr.next() == key) {
                            result = 1;
                        }

                    }
                    System.out.println("Nice, you can get : ");
                    for (Map.Entry<Integer, Integer> entry1 : getMyMoney.entrySet()) {

                        Integer key1 = entry1.getKey();
                        Integer value1 = entry1.getValue();
                        if (result == 1 & key1 == key) {
                            getMyMoney.put(key1, value1 + 1);
                            System.out.println("nominal " + key1 + ": " + (value1 + 1));
                        } else if (result == 0 & value1 != 0) {
                            getMyMoney.put(key, 1);

                            System.out.println("nominal " + key + ": " + 1);
                            System.out.println("nominal " + key1 + ": " + value1);
                        } else if (value1 != 0) {
                            System.out.println("nominal " + key1 + ": " + value1);
                        }
                    }


                } else if (ostatok == key & value == 0) {
                    finalMap.put(key, value + 1);
                    ostatok = ostatok + key;
                    getMyMoney.put(key, value);
                }

            }
            if (ostatok != 0) {
                System.out.println("no money");
                return;
            }

        } else {

            System.out.println("Nice, you can get : ");
            for (Map.Entry<Integer, Integer> entry1 : getMyMoney.entrySet()) {
                Integer key1 = entry1.getKey();
                Integer value1 = entry1.getValue();
                System.out.println("nominal " + key1 + ": " + value1);
            }
        }
        finalSum = finalMap;
    }

    public Map<Integer, Integer> getFinalSum() {
        return finalSum;
    }
}
