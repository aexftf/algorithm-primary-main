package core.designPatterns.simpleFactory;

/**
 * 什么是简单工厂模式
 * 定义一个工厂类，该类提供一个静态方法，该方法会根据传入的参数的不同来创建不同的实例。
 *
 * 特点和优点：
 *
 * 工厂类中创建实例的方法是静态的，所以简单工厂模式也叫静态工厂模式
 * 根据传入参数的不同来获取不同的实例，不关注内部实现。
 * 缺点：
 *
 * 新增或修改创建过程需要修改静态方法内部逻辑，违背开闭原则；
 * 工厂类集成了创建实例的所有逻辑，职责过重，异常后会影响整个模块，另外内部逻辑过于复杂，扩展性差；
 * 工厂类使用静态方法，造成工厂角色无法被继承。

 * @author Jack Geller
 * @version 1.0
 * @date 2022年10月26日 12:06
 */
public abstract class Car {
    public abstract void run();

    /**
     * TODO
     *
     * @author Jack Geller
     * @version 1.0
     * @date 2022年10月26日 12:11
     */
    public static class MaseratiCar {
    }
}
