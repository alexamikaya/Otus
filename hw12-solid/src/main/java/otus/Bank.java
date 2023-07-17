package otus;

public class Bank extends Money {

    //принцип единственной ответственности - каждый класс отвечает за что-то одно. Класс банк подсчитает сумму оставшихся после выдачи денег
    private int sum;//количество денег в банкомате

    public Bank(int sumNom1, int sumNom2, int sumNom3, int sumNom4, int sum) {
        super(sumNom1, sumNom2, sumNom3, sumNom4);
        this.sum = sum;
    }

    public int getSum(int sumNom1, int sumNom2, int sumNom3, int sumNom4) {
        sum = sumNom1 + sumNom2 + sumNom3 + sumNom4;
        System.out.println("\n" +
                "ATM machine balance = " + sum);
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
