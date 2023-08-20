package otus;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class GetMoneyTest {

    @Test
    void adds() throws IOException, ClassNotFoundException {


        ATM atm = new ATM();

        atm.sum(atm.getMapBill());
        atm.add(1, 100);
        atm.add(5, 1000);
        atm.sum(atm.getMapBill());
        atm.add(20, 500);
        atm.sum(atm.getMapBill());
        atm.add(10, 200);
        atm.get(1400, atm.getMapBill());
        atm.sum(atm.getMapBill());


    }

}