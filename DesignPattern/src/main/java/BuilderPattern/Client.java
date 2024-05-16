package BuilderPattern;

//测试类
public class Client {
    public static void main(String[] args) {
        showCar(new BMWBuilder());
        showCar(new XiaomiSU7Builder());
    }
    private static void showCar(Builder builder) {
        Director director = new Director(builder);
        Car car = director.construct();
        System.out.println(car.getFrame());
        System.out.println(car.getSeat());
    }
}