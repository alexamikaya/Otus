package otus;

// Рассчитываем сколько купюр можем выдать
public class GetMoney {
    Money getMoney=new Money(0,0,0,0);
    int summ100= getMoney.getSum100();
    int summ200=getMoney.getSum200();
    int summ500=getMoney.getSum500();
    int summ1000=getMoney.getSum1000();



    public int getMymoney(int i, int sum100, int sum200, int sum500, int sum1000){

        if (i>=100){
            int l=0;
            int bank1000=0;
            int bank500=0;
            int bank200=0;
            int bank100=0;

            if (i<=sum1000){
                bank1000= i/1000;
                summ1000 =sum1000 - (i/1000)*1000;
                l =i-(i/1000)*1000;

            }else{
                l = i-sum1000;
                bank1000= sum1000;
                summ1000 =0;
            }

            if (l<=sum500){
                bank500= l/500;
                summ500 =sum500 - (l/500)*500;
                l =l-(l/500)*500;

            }else{
                l = l-sum500;
                bank500= sum500;
                summ500 =0;
            }

            if (l<=sum200){
                bank200= l/200;
                summ200 =sum200 - (l/200)*200;
                l =l-(l/200)*200;

            }else{
                l = l-sum200;
                bank200= sum200;
                summ200 =0;
            }

            if (l<=sum100){
                bank100= l/100;
                summ100 =sum100 - (l/100)*100;
                l =l-(l/100)*100;

            }else{
                bank100= sum100;
                summ100 =sum100;
            }
            if (l!=0){
                System.out.println("Error, no money");
            }
            else {
                System.out.println("Nice, you can get : banknote 1000 - "+bank1000 + ", banknote 500 - " + bank500+ ", banknote 200 - " + bank200+ ", banknote 100 - " + bank100);
            }

        } else{
            summ100 =sum100;
            summ200 =sum200;
            summ500 =sum500;
            summ1000 =sum1000;
        }
        Bank balance=new Bank(getSumm100(),getSumm200(),getSumm500(),getSumm1000(),0);
        balance.getSum();
        return 0;
    }
    public int getSumm100(){
        return summ100;
    }
    public int getSumm200(){
        return summ200;
    }
    public int getSumm500(){
        return summ500;
    }
    public int getSumm1000(){
        return summ1000;
    }

}
