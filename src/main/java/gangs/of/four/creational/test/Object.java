package gangs.of.four.creational.test;

public class Object {

    public static void main (String[] args){

        Person person1 = new Person();
        person1.setName("David");
        Person person2;
        person2 = person1;
        person2 = new Person();
        person2.setName("Diego");

        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }


}
