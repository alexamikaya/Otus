package otus;

import java.lang.annotation.Annotation;
import java.util.logging.Logger;

public class TestLogging {
    private static Logger log = Logger.getLogger(TestLogging.class.getName());
    Log logg;
    @Log(logs= "executed method: calculation, param:" )
    public void calculation(int param) {
        log.info(logg.logs() + param);
        
    }
    @Log(logs= "executed method: calculation, param1, param2:" )
    public void calculation(int param1, int param2) {
        log.info(logg.logs() + param1+" , "+param2);
    }
    @Log(logs= "executed method: calculation, param1, param2, param3:" )
    public void calculation(int param1, int param2, String param3) {


        log.info( logg.logs()+ param1+" , "+param2+" , "+param3);
    }
}