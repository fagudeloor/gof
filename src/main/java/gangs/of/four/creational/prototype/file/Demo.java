package gangs.of.four.creational.prototype.file;


import java.io.File;

public class Demo {

    public static void main(String[] args){

        String archiverType1 = "zip";
        String archiverType2 = "rar";

        Archiver zipArchiver = ArchiverFactory.getArchiver(archiverType1);
        Archiver rarArchiver = ArchiverFactory.getArchiver(archiverType2);

        zipArchiver.archiver(new File(""));
        rarArchiver.archiver(new File(""));
    }
}
