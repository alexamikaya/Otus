package otus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//считаем купюры
public class Sum {
    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    Money sum = new Money(0,0,0,0);
    int sum100= sum.getSum100();
    int sum200=sum.getSum200();
    int sum500=sum.getSum500();
    int sum1000=sum.getSum1000();

    //заводим купюры
    public void add(Integer bank, Integer nom) throws IOException, ClassNotFoundException {

        map.put(bank, nom);
        getMoney();
        getMap();

    }

    public Map<Integer, Integer> getMap() {

        return map;
    }
//считаем сумму купюр
    public ArrayList<Integer> getMoney(){
        sum100=0;
        sum200=0;
        sum500=0;
        sum1000=0;

        for(Map.Entry<Integer, Integer> pair: map.entrySet()){
            if(pair.getValue()==100){
                sum100 += pair.getKey()*pair.getValue();
            }
            if(pair.getValue()==200){
                sum200 += pair.getKey()*pair.getValue();
            }
            if(pair.getValue()==500){
                sum500 += pair.getKey()*pair.getValue();
            }
            if(pair.getValue()==1000){
                sum1000 += pair.getKey()*pair.getValue();
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(sum100);
        list.add(sum200);
        list.add(sum500);
        list.add(sum1000);
        return list;

    }
    public int getSum100() {

        return sum100;
    }
    public int getSum200() {

        return sum200;
    }
    public int getSum500() {

        return sum500;
    }
    public int getSum1000() {
        return sum1000;
    }


}
