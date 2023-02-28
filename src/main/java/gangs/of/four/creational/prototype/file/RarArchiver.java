package gangs.of.four.creational.prototype.file;

import org.apache.commons.lang3.SerializationUtils;

import java.io.File;
import java.io.Serializable;

public class RarArchiver implements Archiver, Serializable {

    public void archiver(File directory) {
        System.out.println("Rar Archiver");
    }

    @Override
    public Archiver clone() {
        return SerializationUtils.clone(this) ;
    }
}
