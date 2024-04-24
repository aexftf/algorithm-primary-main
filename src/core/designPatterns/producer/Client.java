package core.designPatterns.producer;

/**
 * I am the Fuck second part
 *
 * @author Jack Geller
 * @version 1.0
 * @date 2022年10月26日 11:19
 */
public class Client {
 
    /** @date 2022/10/26
    * @user Jack Geller
    * Description TODO
     * @param system 
 * @param appName
 * @param appFuntion
     * @return com.wwj.srb.core.designPatterns.producer.Product
     **/
    public Product getProduct(String system, String appName, String appFuntion) {

        Director director = new Director();//产品经理
        Builder concreteBuilder = new ConcreteBuilder();
        director.create(concreteBuilder, system, appName, appFuntion);

        Product build = concreteBuilder.build();
        return build;
    }
}