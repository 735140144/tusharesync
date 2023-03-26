package luckyboy.schedule;
@FunctionalInterface
public interface Worker extends Runnable{
    void doWork() throws InterruptedException;

    default void run() {
        try {
            doWork();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
