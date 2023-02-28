package gangs.of.four.creational.prototype.file;

import java.io.File;

public interface Archiver {

    void archiver(File directory);

    Archiver clone();
}
