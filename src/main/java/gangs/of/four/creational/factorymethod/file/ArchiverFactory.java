package gangs.of.four.creational.factorymethod.file;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ArchiverFactory {

    private static Map<String, Supplier<Archiver>> typeConstructorMAp = new HashMap<>();

    static{
        typeConstructorMAp.put("zip", ZipArchiver::new);
        typeConstructorMAp.put("rar", RarArchiver::new);
    }

    public static Archiver getArchiver(String archiverType){
        return typeConstructorMAp.get(archiverType) == null ? null :
                typeConstructorMAp.get(archiverType).get();
    }
}
