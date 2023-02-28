package gangs.of.four.creational.factorymethod.cpu;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ComputerFactory {

    private static Map<String, Supplier<Computer>> typeConstructorMap = new HashMap<>();

    static{
        typeConstructorMap.put("PC", PC::new);
        typeConstructorMap.put("SERVER", Server::new);
    }

    public static Computer getComputer(String computerType){
        return typeConstructorMap.get(computerType) == null ? null :
                typeConstructorMap.get(computerType).get();
    }
}
