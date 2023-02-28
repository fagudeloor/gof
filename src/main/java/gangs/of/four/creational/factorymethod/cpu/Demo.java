package gangs.of.four.creational.factorymethod.cpu;

public class Demo {

    public static void main(String... args){
        Computer cpu1 = ComputerFactory.getComputer("CPU");
        Computer server1 = ComputerFactory.getComputer("SERVER");

        System.out.println(ComputerFactory.getComputer("CPU") == cpu1);
    }


}
