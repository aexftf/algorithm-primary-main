package core.designPatterns;

//双重校验锁
//深拷贝、序列化 、直接new — 破解单例模式的几种方法。
//volatile: happen before原则。 通过内存屏障进行可见性。
//Lock锁的实现：aqs（抽象同步队列）—公平锁 和 非公平锁,state默认为0（无锁），抢夺锁通过cas将state++。     公平锁：会去判断当前线程是否是队列的头部，如果是才可以去抢锁。
public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {

        if (instance == null){//防止序列化实例生成

            synchronized (Singleton.class){

               if (instance == null){//防止已经有实例
                   instance =  new Singleton();
               }

           }
        }


        return instance;


    }



}