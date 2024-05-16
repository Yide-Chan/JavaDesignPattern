package BuilderPattern;


public class XiaomiSU7Builder extends Builder {

    @Override
    public void buildFrame() {
        Car.setFrame("一体压铸车架");
    }

    @Override
    public void buildSeat() {
        Car.setSeat("真皮车座");
    }

    @Override
    public Car createCar() {
        return Car;
    }
}