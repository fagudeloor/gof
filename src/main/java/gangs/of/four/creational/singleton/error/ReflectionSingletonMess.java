package gangs.of.four.creational.singleton.error;

import gangs.of.four.creational.singleton.EagerSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonMess {

    public static void main(String[] args){
        EagerSingleton instance = EagerSingleton.getMyResourceEager();
        EagerSingleton instanceTwo = null;

        try {
            Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
            System.out.println(constructors.length);
            for (Constructor c: constructors){
                c.setAccessible(true);
                System.out.println("into for");
                instanceTwo = (EagerSingleton) c.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(instance.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
