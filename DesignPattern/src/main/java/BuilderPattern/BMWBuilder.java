package BuilderPattern;


public class BMWBuilder extends Builder {

    @Override
    public void buildFrame() {
        Car.setFrame("分体车架");
    }

    @Override
    public void buildSeat() {
        Car.setSeat("橡胶车座");
    }

    @Override
    public Car createCar() {
        return Car;
    }
}