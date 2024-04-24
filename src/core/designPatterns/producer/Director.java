package core.designPatterns.producer;

public class Director {

    /** @date 2022/10/26
    * @user Jack Geller
    * Description TODO
     * @param builder 
 * @param system
 * @param appName
 * @param appFunction
     * @return com.wwj.srb.core.designPatterns.producer.Product
     **/
    public  Product create(Builder builder,String system,String appName,String appFunction) {

        Product product = builder.setAppSystem(system)
                .setAppName(appName)
                .setAppFuction(appFunction)
                .build();

        return product;
    }
}
