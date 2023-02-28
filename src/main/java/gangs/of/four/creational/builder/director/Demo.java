package gangs.of.four.creational.builder.director;

public class Demo {

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector(new CheapComputerBuilder());

        director.setComputerBuilder(new CheapComputerBuilder());
        director.buildComputer();
        Computer computer = director.getComputer();
        System.out.println(computer);

        director.setComputerBuilder(new ExpensiveComputerBuilder());
        director.buildComputer();
        computer = director.getComputer();
        System.out.println(computer);
    }
}
