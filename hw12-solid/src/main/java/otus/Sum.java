package otus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//считаем купюры
//принцип единственной ответственности - каждый класс отвечает за что-то одно. Класс сумма подсчитывает деньги в банкомате
public class Sum {

    Money sum = new Money(0, 0, 0, 0);
    int sumNom1 = sum.getSumNom1();
    int sumNom2 = sum.getSumNom2();
    int sumNom3 = sum.getSumNom3();
    int sumNom4 = sum.getSumNom4();

    //заводим купюры
    public void howMuch(Map<Integer, Integer> nom) throws IOException, ClassNotFoundException {
        getMoney(nom);
    }


    //считаем сумму купюр
    public ArrayList<Integer> getMoney(Map<Integer, Integer> nom) {

        sumNom1 = 0;
        sumNom2 = 0;
        sumNom3 = 0;
        sumNom4 = 0;

        for (Map.Entry<Integer, Integer> pair : nom.entrySet()) {
            if (pair.getValue() == 100) {
                sumNom1 += pair.getKey() * pair.getValue();
            }
            if (pair.getValue() == 200) {
                sumNom2 += pair.getKey() * pair.getValue();
            }
            if (pair.getValue() == 500) {
                sumNom3 += pair.getKey() * pair.getValue();
            }
            if (pair.getValue() == 1000) {
                sumNom4 += pair.getKey() * pair.getValue();
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(sumNom1);
        list.add(sumNom2);
        list.add(sumNom3);
        list.add(sumNom4);
        return list;

    }

    public int getSumNom1() {

        return sumNom1;
    }

    public int getSumNom2() {

        return sumNom2;
    }

    public int getSumNom3() {

        return sumNom3;
    }

    public int getSumNom4() {
        return sumNom4;
    }


}
