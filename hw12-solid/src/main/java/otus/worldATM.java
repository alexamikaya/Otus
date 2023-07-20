package otus;

import java.io.IOException;
import java.util.Map;

//Это унифицированный интерфейс для всех банкоматов мира, он показывает как работает любой банкомат, а именно имеет функции подсчета общего кол-ва денег,
// добавления денег, подсчет купюр, выдачи денег
public interface worldATM {
    //подсчет суммы денег
    void money();

    //добавление денег в банкомат
    void add(int numberBills, int typeBill) throws IOException, ClassNotFoundException;
//возвращает карту количества купюр в банкомате
    Map<Integer, Integer> getMapBill();

    //подсчет купюр
    void sum(Map<Integer, Integer> map) throws IOException, ClassNotFoundException;

    int getSumNom1();

    int getSumNom2();

    int getSumNom3();

    int getSumNom4();

    //выдача денег
    void get(int money, int nom1, int nom2, int nom3, int nom4) throws IOException, ClassNotFoundException;
}
