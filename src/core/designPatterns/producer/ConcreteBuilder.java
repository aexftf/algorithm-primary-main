package core.designPatterns.producer;
/**
 * 具体建造者类——程序员
 * .
 */

public class ConcreteBuilder extends Builder {


    private Product product;// 产品类
    private InnerProduct innerProduct = new InnerProduct();// 产品缓冲类

    @Override
    public Builder setAppName(String appName) {
        innerProduct.setAppName(appName);
        return this;
    }

    @Override
    public Builder setAppFuction(String appFuction) {
        innerProduct.setAppName(appFuction);
        return this;
    }

    @Override
    public Builder setAppSystem(String appSystem) {
        innerProduct.setAppName(appSystem);
        return this;
    }



    private class InnerProduct {
        private String appName;
        private String appFuction;
        private String appSystem;

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

        public String getAppFuction() {
            return appFuction;
        }

        public void setAppFuction(String appFuction) {
            this.appFuction = appFuction;
        }

        public String getAppSystem() {
            return appSystem;
        }

        public void setAppSystem(String appSystem) {
            this.appSystem = appSystem;
        }
    }

    @Override
    public Product build() {
        product = new Product();
        product.setAppName(innerProduct.getAppName());
        product.setAppFuction(innerProduct.getAppFuction());
        product.setAppSystem(innerProduct.getAppSystem());
        return product;

    }
}
