package otus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import static java.util.stream.Collectors.*;

//считаем купюры
//принцип единственной ответственности - каждый класс отвечает за что-то одно. Класс сумма подсчитывает деньги в банкомате
public class Sum {

    private final Money sum = new Money(0, 0, null);
    int sumNom1 = sum.getSumNom1(0);
    ArrayList<Integer> list = null;
    private int finalSum;

    //заводим купюры
    public void howMuch(Map<Integer, Integer> nom) throws IOException, ClassNotFoundException {
        getMoney(nom);
    }


    //считаем сумму купюр
    public ArrayList<Integer> getMoney(Map<Integer, Integer> nom) {
        finalSum = 0;

        sumNom1 = 0;

        ArrayList<String> list1 = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : nom.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            list1.add(sum.getNominals(key) + "=" + sum.getSumNom1(value));
        }


        Map<String, Integer> result = list1.stream().map(e -> e.split("=")).collect(groupingBy(e -> e[0], summingInt(e -> Integer.parseInt(e[1]))));
        Map<String, Integer> sortedMap = new TreeMap<>(result);


        list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            list.add(sum.getNominals(Integer.parseInt(key)) * sum.getSumNom1(value));

        }
        for (int i = 0; i < list.size(); i++)
            finalSum += list.get(i);

        System.out.println("\n" +
                "ATM machine balance = " + finalSum);
        return list;


    }


}
