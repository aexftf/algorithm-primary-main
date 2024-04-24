package core.designPatterns.strageticMode;

import java.util.HashMap;

public class policyFactory {



     private static  HashMap<Integer,policyInterface>map= new HashMap<>();


     public static void register(Integer i,policyInterface p){

         map.put(i,p);

     }


     public static void doPolicyService(int type){


         policyInterface policyInterface = map.get(type);

         if (policyInterface!=null){
             policyInterface.methond();
         }
         else{
             System.out.println("wrong policy son of the beach");
         }

     }




    public static void main(String[] args) {
        policyInterfaceImpl2 policyInterfaceImpl2 = new policyInterfaceImpl2();
//        policyInterfaceImpl1 policyInterfaceImpl1 = new policyInterfaceImpl1();

        doPolicyService(1);

    }










}
