package otus;

public class Money {
    //сущность банкнота
    protected int sumNom1;//купюра номиналом 100 руб
    protected int sumNom2;//купюра номиналом 200 руб
    protected int sumNom3;//купюра номиналом 500 руб
    protected int sumNom4;//купюра номиналом 1000 руб

    public Money(int sum100, int sum200, int sum500, int sum1000) {
        this.sumNom1 = sumNom1;
        this.sumNom2 = sumNom2;
        this.sumNom3 = sumNom3;
        this.sumNom4 = sumNom4;
    }

    public int getSumNom4() {
        return sumNom4;
    }

    public void setSumNom4(int sum1000) {
        this.sumNom4 = sumNom4;
    }

    public int getSumNom3() {
        return sumNom3;
    }

    public void setSumNom3(int sumNom3) {
        this.sumNom3 = sumNom3;
    }

    public int getSumNom2() {
        return sumNom2;
    }

    public void setSumNom2(int sumNom2) {
        this.sumNom2 = sumNom2;
    }

    public int getSumNom1() {
        return sumNom1;
    }

    public void setSumNom1(int sumNom1) {
        this.sumNom1 = sumNom1;
    }
}
