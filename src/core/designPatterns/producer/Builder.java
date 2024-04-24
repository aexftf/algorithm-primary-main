package core.designPatterns.producer;

/**
 * （2）抽象建造者类——技术主管（可省略）
 */
public abstract class Builder {


    public abstract Builder setAppName(String appName);

    public abstract Builder setAppFuction(String appFuction);

    public abstract Builder setAppSystem(String appSystem);

    public Product build() {
        return null;
    }
}