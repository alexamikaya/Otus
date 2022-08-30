package otus;

public class Logger {
    private static java.util.logging.Logger log = java.util.logging.Logger.getLogger(TestLogging.class.getName());
    public void calculation(String param) {
        log.info("executed method: calculation, param:" + param);

    }
}
