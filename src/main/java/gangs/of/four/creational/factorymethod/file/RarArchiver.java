package gangs.of.four.creational.factorymethod.file;

import java.io.File;

public class RarArchiver implements Archiver {

    public void archive(File directory) {
        System.out.println("Rar Archiver");
    }

}
