package gangs.of.four.structural.decorator.cars;

public class SportsCar extends CarDecorator {

    private String transmissionMode;

    public SportsCar(Car c){
        super(c);
    }
    @Override
    public void drive() {
        super.drive();
        System.out.println("And drives fast like a sports Car");
    }

    public void setTransmissionMode(String transmissionMode){
        this.transmissionMode = transmissionMode;
    }
}
