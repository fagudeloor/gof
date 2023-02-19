package gangs.of.four.creational.singleton;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getMyResourceEager(){
         return instance;
    }
}
