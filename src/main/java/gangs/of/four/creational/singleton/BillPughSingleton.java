package gangs.of.four.creational.singleton;

public class BillPughSingleton {

    private BillPughSingleton(){}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getBillPughSingleton(){
        return SingletonHelper.INSTANCE;
    }
}
