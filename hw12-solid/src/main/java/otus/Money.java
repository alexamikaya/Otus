package otus;

import java.util.Map;

public class Money {
    //сущность банкнота
    protected int sumNom1;//купюра
    protected int nominals;
    protected Map<Integer, Integer> getSum;


    public Money(int sumNom1, int nominals, Map<Integer, Integer> getSum) {
        this.sumNom1 = sumNom1;
        this.nominals = nominals;
        this.getSum = getSum;

    }

    public int getNominals(int nominals) {
        return nominals;
    }

    public void setNominals(int nominals) {
        this.nominals = nominals;
    }

    public int getSumNom1(int sumNom1) {
        return sumNom1;
    }

    public void setSumNom1(int sumNom1) {
        this.sumNom1 = sumNom1;
    }

    public Map<Integer, Integer> getSum() {
        return getSum;
    }

    public Map<Integer, Integer> setSum() {
        this.getSum = getSum();
        return null;
    }
}
