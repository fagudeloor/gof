package gangs.of.four.creational.prototype.employ;

public class PrototypePatternTest {

    public static void main(String... args){
        Employees ems = new Employees();
        ems.loadData();

        Employees emsNew1 = (Employees) ems.clone();
        Employees emsNew2 = (Employees) emsNew1.clone();

        emsNew2.getEmpList().add("John");
        emsNew2.getEmpList().remove("Pankaj");

        System.out.println("ems List: " + ems.getEmpList());
        System.out.println("emsNew1 List: " + emsNew1.getEmpList());
        System.out.println("emsNew2 List: " + emsNew2.getEmpList());

    }
}
