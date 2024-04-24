package core.designPatterns.producer;

/**
 * 场景：一个公司开发产品，参与者：客户，产品经理，技术主管，程序员。
 * 需求：客户给产品经理需求，产品经理分析需求，告诉技术主管，或者程序员开发产品给客户。
 * （1）产品类
 */
public class Product {



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

        @Override
        public String toString() {
            return "Product [appName=" + appName + ", appFuction=" + appFuction
                    + ", appSystem=" + appSystem + "]";
        }



}
