package otus;

public interface ClassInterface {
    @Log
    String calc1(int param);
    String calc2 (int param1, int param2);
    @Log
    String calc3 (int param1, int param2, String param3);
}
