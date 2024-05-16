package BuilderPattern;

//指挥者类
public class Director {
    private Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public Car construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createCar();
    }
}