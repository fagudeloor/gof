package gangs.of.four.creational.prototype.file;

import java.util.HashMap;
import java.util.Map;

public class ArchiverFactory {

    private static Map<String, Archiver> prototypes = new HashMap<String, Archiver>();

    static{
        prototypes.put("zip", new ZipArchiver());
        prototypes.put("rar", new RarArchiver());
    }

    public static Archiver getArchiver(String archiverType){
        return prototypes.get(archiverType).clone();
    }
}
