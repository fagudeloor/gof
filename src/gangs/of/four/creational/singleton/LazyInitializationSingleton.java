package gangs.of.four.creational.singleton;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton(){
        if(instance==null){
            instance = new LazyInitializationSingleton();
        }
    }

    public static LazyInitializationSingleton getInstance() {
        if(instance==null){
            instance = new LazyInitializationSingleton();
        }

        return instance;
    }
}
