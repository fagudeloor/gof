package gangs.of.four.creational.prototype.file;

import java.io.File;
import java.io.Serializable;

import org.apache.commons.lang3.SerializationUtils;

public class ZipArchiver implements Archiver, Serializable {

    public void archiver(File directory) {
        System.out.println("Zip Archiver");
    }

    @Override
    public Archiver clone() {
        return SerializationUtils.clone(this) ;
    }
}
