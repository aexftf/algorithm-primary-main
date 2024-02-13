package myThing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO
 *
 * @author Jack Geller
 * @version 1.0
 * @date 2023年07月28日 17:19
 */
public class multiThreadPoolQuestion {


        private static final int NUM_THREADS = 4; // 设置线程数量
        private static final int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 数组

        public static void main(String[] args) {
            ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
            AtomicInteger sum = new AtomicInteger(0); // 使用AtomicInteger作为原子变量

            for (int i = 0; i < NUM_THREADS; i++) {
                int finalI = i;
                executor.execute(() -> {
                    int partialSum = 0;
                    for (int j = finalI; j < nums.length; j += NUM_THREADS) {
                        partialSum += nums[j];
                    }
                    sum.addAndGet(partialSum); // 原子地将partialSum添加到sum中
                });
            }

            executor.shutdown();

            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Sum: " + sum.get());
        }














    }





