package otus;

import java.io.IOException;
import java.util.Map;

//Это унифицированный интерфейс для всех банкоматов мира, он показывает как работает любой банкомат, а именно имеет функции подсчета общего кол-ва денег,
// добавления денег, подсчет купюр, выдачи денег
public interface worldATM {

    //добавление денег в банкомат
    void add(int numberBills, int typeBill) throws IOException, ClassNotFoundException;
//возвращает карту количества купюр в банкомате
    Map<Integer, Integer> getMapBill();

    //подсчет суммы
    void sum(Map<Integer, Integer> map) throws IOException, ClassNotFoundException;


    //выдача денег
    void get(int money, Map<Integer, Integer> getMap) throws IOException, ClassNotFoundException;
}
