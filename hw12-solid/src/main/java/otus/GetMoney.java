package otus;


//принцип единственной ответственности - каждый класс отвечает за что-то одно. Класс getMoney выдает запрошенную сумму имеющимися купюрами
public class GetMoney {
    Money getMoney = new Money(0, 0, 0, 0);
    int summNom1 = getMoney.getSumNom1();
    int summNom2 = getMoney.getSumNom2();
    int summNom3 = getMoney.getSumNom3();
    int summNom4 = getMoney.getSumNom4();


    public int getMymoney(int i, int sumNom1, int sumNom2, int sumNom3, int sumNom4) {

        if (i >= 100) {
            int l = 0;
            int bank1000 = 0;
            int bank500 = 0;
            int bank200 = 0;
            int bank100 = 0;

            if (i <= sumNom4) {
                bank1000 = i / 1000;
                summNom4 = sumNom4 - (i / 1000) * 1000;
                l = i - (i / 1000) * 1000;

            } else {
                l = i - sumNom4;
                bank1000 = sumNom4;
                summNom4 = 0;
            }

            if (l <= sumNom3) {
                bank500 = l / 500;
                summNom3 = sumNom3 - (l / 500) * 500;
                l = l - (l / 500) * 500;

            } else {
                l = l - sumNom3;
                bank500 = sumNom3;
                summNom3 = 0;
            }

            if (l <= sumNom2) {
                bank200 = l / 200;
                summNom2 = sumNom2 - (l / 200) * 200;
                l = l - (l / 200) * 200;

            } else {
                l = l - sumNom2;
                bank200 = sumNom2;
                summNom2 = 0;
            }

            if (l <= sumNom1) {
                bank100 = l / 100;
                summNom1 = sumNom1 - (l / 100) * 100;
                l = l - (l / 100) * 100;

            } else {
                bank100 = sumNom1;
                summNom1 = sumNom1;
            }
            if (l != 0) {
                System.out.println("Error, no money");
            } else {
                System.out.println("Nice, you can get : banknote 1000 - " + bank1000 + ", banknote 500 - " + bank500 + ", banknote 200 - " + bank200 + ", banknote 100 - " + bank100);
            }

        } else {
            summNom1 = sumNom1;
            summNom2 = sumNom2;
            summNom3 = sumNom3;
            summNom4 = sumNom4;
        }


        return 0;
    }

    public int getSummNom1() {
        return summNom1;
    }

    public int getSummNom2() {
        return summNom2;
    }

    public int getSummNom3() {
        return summNom3;
    }

    public int getSummNom4() {
        return summNom4;
    }

}
