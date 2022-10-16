public class Example {
    public static void main(String[] args) throws Exception{
        int[][] bsp = new int[4][];
        bsp[0] = new int[] {1,2,3,4};
        bsp[1] = new int[] {32,43,45};
        bsp[2] = new int[] {12,12};
        bsp[3] = new int[] {0,87,90,76,45};

        int sum = 0;

        TwoDimArraySumElementsThreaded calculator0 = new TwoDimArraySumElementsThreaded(bsp[0]);
        TwoDimArraySumElementsThreaded calculator1 = new TwoDimArraySumElementsThreaded(bsp[1]);
        TwoDimArraySumElementsThreaded calculator2 = new TwoDimArraySumElementsThreaded(bsp[2]);
        TwoDimArraySumElementsThreaded calculator3 = new TwoDimArraySumElementsThreaded(bsp[3]);

        Thread aThread0 = new Thread(calculator0);
        Thread aThread1 = new Thread(calculator1);
        Thread aThread2 = new Thread(calculator2);
        Thread aThread3 = new Thread(calculator3);

        aThread0.start();
        aThread1.start();
        aThread2.start();
        aThread3.start();

        aThread0.join();
        aThread1.join();
        aThread2.join();
        aThread3.join();
        aThread3.join();



        sum += calculator0.getResult();
        sum += calculator1.getResult();
        sum += calculator2.getResult();
        sum += calculator3.getResult();

        System.out.println("Final sum: " + sum);
    
    }
}