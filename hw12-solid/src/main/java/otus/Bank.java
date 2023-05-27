package otus;

public class Bank extends Money {

    //принцип единственной ответственности - каждый класс отвечает за что-то одно. Класс банк подсчитает сумму оставшихся после выдачи денег
    private int sum;//количество денег в банкомате
    public Bank(int sum100, int sum200, int sum500, int sum1000, int sum) {
        super(sum100, sum200, sum500, sum1000);
        this.sum = sum;
    }

    public int getSum(int sum100, int sum200, int sum500, int sum1000) {
        sum = sum100 + sum200 + sum500 + sum1000;
        System.out.println("\n" +
                "ATM machine balance = " + sum);
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
