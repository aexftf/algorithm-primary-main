package myThing;

import java.util.concurrent.Callable;

/**
 * TODO
 *
 * @author Jack Geller
 * @version 1.0一般就用继承thread就够了
 * @date 2023年07月28日 17:48
 */
public class SumThreadSingle {




    static class SumThread extends Thread {

        private int[] array;
        private int start;
        private int end;
        public int result;

        public SumThread(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                result += array[i];
            }
        }

    }



        public static int sum(int[] array) {
            SumThread t1 = new SumThread(array, 0, array.length/2);
            SumThread t2 = new SumThread(array, array.length/2, array.length);

            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
                Thread.sleep(2*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return t1.result + t2.result;
        }





    public static void main(String[] args) {

        int[] ints = new int[]{
            1,2,3,4,5
        };

        System.out.println( sum(ints));
    }



//    static class SumThread extends Thread {
//
//        private int[] arr;
//        private int start;
//        private int end;
//        private int result;
//
//        public SumThread(int[] arr, int start, int end) {
//            this.arr = arr;
//            this.start = start;
//            this.end = end;
//
//        }
//
//
//        @Override
//        public void run() {
//            for (int i = start; i < end; i++) {
//                result += arr[i];
//            }
//
//        }
//
//    }
//
//
//        public static int sum(int[]arr)   {
//
//            SumThread t1 = new SumThread(arr, 0, arr.length / 2);
//            SumThread t2 = new SumThread(arr, arr.length / 2,arr.length );
//
//            t1.start();
//            t2.start();
//
//            try{
//                t1.join();
//                t2.join();
//            }
//            catch (InterruptedException e){
//                e.printStackTrace();
//            }
//
//
//
//            return t1.result+ t2.result;
//
//        }
//
//
//    public static void main(String[] args) {
//        int []num={1,2,3,4,5,6};
//
//        System.out.println(sum(num));
//
//
//
//    }
//
//


//
//
//
//
//
//
//
//











}
