package otus;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class GetMoneyTest {

    @Test
    void adds() throws IOException, ClassNotFoundException {


            Sum addd = new Sum();
//заводим банкноты в банкомат
            addd.add(1, 100);
            addd.add(5, 1000);
            addd.add(20, 500);
            addd.add(10, 200);
        //просим выдать определенную сумму
            GetMoney getMoney=new GetMoney();
            getMoney.getMymoney(800, addd.getSum100(), addd.getSum200(), addd.getSum500(), addd.getSum1000());




    }

}