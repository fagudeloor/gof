package gangs.of.four.structural.decorator.cars;

public class LuxuryCar extends CarDecorator {

    private String transmissionMode;

    public LuxuryCar(Car car){
        super(car);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println(" And drives soft as luxury car");
    }

}
