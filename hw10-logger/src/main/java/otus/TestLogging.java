package otus;

public class TestLogging implements ClassInterface{



    public String calc1(int param) {
        String params=param+"";


        return params;
    }

    public String calc2(int param1, int param2) {
        String params=param1+ " , "+ param2;

        return params;
    }

    public String calc3(int param1, int param2, String param3) {
        String params=param1+ " , "+ param2+ " , "+ param3;

        return params;

    }
    @Override
    public String toString(){
        return "MainClass{}";
    }


}