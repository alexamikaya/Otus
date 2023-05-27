package otus;

public class Money {
    //сущность банкнота
    protected int sum100;//купюра номиналом 100 руб
    protected int sum200;//купюра номиналом 200 руб
    protected int sum500;//купюра номиналом 500 руб
    protected int sum1000;//купюра номиналом 1000 руб

    public Money(int sum100, int sum200, int sum500, int sum1000) {
        this.sum100 = sum100;
        this.sum200 = sum200;
        this.sum500 = sum500;
        this.sum1000 = sum1000;
    }

    public int getSum1000() {
        return sum1000;
    }

    public void setSum1000(int sum1000) {
        this.sum1000 = sum1000;
    }

    public int getSum500() {
        return sum500;
    }

    public void setSum500(int sum500) {
        this.sum500 = sum500;
    }

    public int getSum200() {
        return sum200;
    }

    public void setSum200(int sum200) {
        this.sum200 = sum200;
    }

    public int getSum100() {
        return sum100;
    }

    public void setSum100(int sum100) {
        this.sum100 = sum100;
    }
}
