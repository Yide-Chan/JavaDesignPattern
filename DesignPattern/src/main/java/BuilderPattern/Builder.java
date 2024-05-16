package BuilderPattern;

import BuilderPattern.Car;

// 抽象 builder 类
public abstract class Builder {

    protected Car Car = new Car();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Car createCar();
}