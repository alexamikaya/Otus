package otus;

//выдаем баланс

public class Balance {

    public int getBalance(int sum100, int sum200, int sum500, int sum1000){
        int sum = 0;
        sum = sum100 + sum200 + sum500 + sum1000;
        System.out.println("\n" +
                "ATM machine balance = " + sum);
        return sum;
    }
}
