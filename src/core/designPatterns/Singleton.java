package core.designPatterns;

/**
 * 设计模式都是在代码重构时应用，代码实现功能时不用设计模式。能跑即可。
 * 双检锁，并发考虑
 */
public class Singleton {

    private volatile static  Singleton instance;

    private Singleton() {}


    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {

                    instance = new Singleton();
                }

        }

    }
        return instance;
}


}
