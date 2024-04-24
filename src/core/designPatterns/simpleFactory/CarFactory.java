package core.designPatterns.simpleFactory;

/**
 * TODO
 *
 * @author Jack Geller
 * @version 1.0
 * @date 2022年10月26日 12:11
 */
public class CarFactory {

    public static Car createCar(String brand) {
        Car car = null;
        switch (brand) {
            case "maserati": // 玛莎拉蒂
                car = new MaseratiCar(brand);
                break;
            case "bmw": // 宝马
                car = new BMWCar(brand);
                break;
        }
        return car;
    }


    public static void main(String[] args) {
        Car car1 = CarFactory.createCar("bmw");
        car1.run();
        // 创造玛莎拉蒂车
        Car car2 = CarFactory.createCar("maserati");
        car2.run();
    }





}
