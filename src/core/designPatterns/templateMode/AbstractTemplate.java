package core.designPatterns.templateMode;
//httpServlet有应用此模式
public abstract class AbstractTemplate {


        public   void doService(int port){

                System.out.println("Service started");

                if (port == 0){
                    System.out.println("a");
                }
                if (port == 1){
                    System.out.println("b");
                }

        }



        public abstract void abstractMethod1();

        public abstract void abstractMethod2();


}
