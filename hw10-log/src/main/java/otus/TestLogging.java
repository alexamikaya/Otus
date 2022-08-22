package otus;

import java.util.logging.Logger;

public class TestLogging implements ClassInterface{
    private static Logger log = Logger.getLogger(TestLogging.class.getName());

    @Log
    public void calculation(int param) {
        log.info("executed method: calculation, param:" + param);

    }
    @Log
    public void calculation(int param1, int param2) {
        log.info("executed method: calculation, param:" + param1+ " , "+ param2);

    }
    @Log
    public void calculation(int param1, int param2, String param3) {
        log.info("executed method: calculation, param:" + param1+ " , "+ param2+" , "+ param3);

    }
    @Override
    public String toString(){
        return "MainClass{}";
    }


}