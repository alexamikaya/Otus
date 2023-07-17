package otus;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class GetMoneyTest {

    @Test
    void adds() throws IOException, ClassNotFoundException {


        ATM atm = new ATM();
        atm.money();
        atm.add(1, 100);
        atm.add(5, 1000);
        atm.add(20, 500);
        atm.add(10, 200);
        atm.sum(atm.getMapBill());
        atm.get(800, atm.getSumNom1(), atm.getSumNom2(), atm.getSumNom3(), atm.getSumNom4());
        atm.money();


    }

}