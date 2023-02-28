package gangs.of.four.creational.factorymethod.file;

import java.io.File;

public class ZipArchiver implements Archiver{

    public void archive(File directory) {
        System.out.println("Zip Archiver");
    }

}
