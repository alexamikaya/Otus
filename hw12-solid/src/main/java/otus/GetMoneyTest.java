package otus;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class GetMoneyTest {

    @Test
    void adds() throws IOException, ClassNotFoundException {


        ATM atm = new ATM();
        atm.moneyATM();
        atm.addATM (1,100);
        atm.addATM (5,1000);
        atm.addATM (20,500);
        atm.addATM (10,200);
        atm.sumATM(atm.getMap());
        atm.getATM(800, atm.getSum100(), atm.getSum200(), atm.getSum500(), atm.getSum1000());
        atm.moneyATM();



    }

}