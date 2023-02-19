package gangs.of.four.creational.singleton;

public class ThreadSafeSingletonBlock {

    private static ThreadSafeSingletonBlock instance;

    private ThreadSafeSingletonBlock() {}

    public static ThreadSafeSingletonBlock getInstance() {
        if (instance==null){
            synchronized (ThreadSafeSingleton.class){
                if (instance==null){
                    instance = new ThreadSafeSingletonBlock();
                }
            }
        }
        return instance;
    }
}
