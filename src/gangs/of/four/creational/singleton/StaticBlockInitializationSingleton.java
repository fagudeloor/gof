package gangs.of.four.creational.singleton;

public class StaticBlockInitializationSingleton {

    private static StaticBlockInitializationSingleton instance;

    private StaticBlockInitializationSingleton(){}

    static{
        try{
            instance = new StaticBlockInitializationSingleton();
        }catch (Exception e){

        }
    }

    public static StaticBlockInitializationSingleton getInstance() {
        return instance;
    }
}
