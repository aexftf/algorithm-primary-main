package core;

import org.springframework.stereotype.Service;

import java.util.concurrent.*;
@Service
public  class ThreadPoolDemo {
    LinkedBlockingQueue<Runnable> threadQueue = new LinkedBlockingQueue<>();
        /**
         * 核心线程数：4
         * 最大线程数：10
         * 最大存活时间：10s
         * 阻塞队列：ArrayBlockingQueue(20) 最大20个任务
         */


//    任务并发执行：线程池是实现任务并发执行的一种有效方式。它可以帮助您将大量任务分配到线程中，并充分利用计算资源。
//
//    长时间运行的任务：如果您的应用程序需要执行长时间运行的任务（例如I/O操作），则使用线程池可以帮助您避免阻塞主线程，并允许其他任务并发执行。
//
//    提高性能：使用线程池可以减少线程创建和销毁的开销，从而提高应用程序的性能和响应性。
//
//    控制并发度：线程池可以帮助您控制并发度，以避免过度消耗系统资源，例如内存和CPU。
//
//    资源共享：线程池是一种有效的资源共享机制，因为它可以将有限的计算资源分配给多个任务，从而提高资源利用率。

        private static ExecutorService service = new ThreadPoolExecutor(4, 10,
                10L, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20));

        /**
         * 执行线程任务
         * @param runTask
         */
        public static void runBusiness(Runnable runTask) {
            service.execute(runTask);
        }






        public static void main(String[] args) {

            Runnable task1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("我是第一个任务。");
                }
            });

            Runnable task2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("我是第二个任务。");
                }
            });

            runBusiness(task1);
            runBusiness(task2);

        }









    }





