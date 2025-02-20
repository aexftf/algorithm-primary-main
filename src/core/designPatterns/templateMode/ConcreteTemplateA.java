package core.designPatterns.templateMode;

public class ConcreteTemplateA extends AbstractTemplate{






    @Override
    public void abstractMethod1() {
        System.out.println("hhhhh");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("hhhhh");

    }



    public static void main(String[] args) {
        ConcreteTemplateA concreteTemplateA = new ConcreteTemplateA();
        concreteTemplateA.doService(0);


        ConcreteTemplateB concreteTemplateB = new ConcreteTemplateB();
        concreteTemplateB.doService(1);

    }

}
