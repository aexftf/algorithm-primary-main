package core.designPatterns.strageticMode;

public class policyInterfaceImpl1 implements policyInterface {

    public policyInterfaceImpl1() {
        policyFactory.register(1,this);

    }





    @Override
    public void methond() {
        System.out.println("这是一的实现1的method");
    }
}
