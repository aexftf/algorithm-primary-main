package myThing;

/**
 * TODO
 *
 * @author Jack Geller
 * @version 1.0
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
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return t1.result + t2.result;
        }





    public static void main(String[] args) {

        int[] ints = new int[]{
            1,3,43,2323,232,2323,435,324,2342,45654,23123,2311311,12222
        };

        System.out.println( sum(ints));
    }







}
