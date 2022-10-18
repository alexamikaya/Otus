package otus;

import java.lang.reflect.Method;

public class Logger {
    private static java.util.logging.Logger log = java.util.logging.Logger.getLogger(TestLogging.class.getName());
    public void calculation(Object param, String calculation) {
        log.info("executed method: "+calculation+", param:" + param);

    }
}
