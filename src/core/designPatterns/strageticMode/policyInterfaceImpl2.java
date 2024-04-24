package core.designPatterns.strageticMode;

public class policyInterfaceImpl2 implements policyInterface{


    public policyInterfaceImpl2() {
        policyFactory.register(2,this);
    }

    @Override
    public void methond() {
        System.out.println("这是方法二的method");
    }





}
