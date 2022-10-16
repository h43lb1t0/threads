import java.util.ArrayList;

public class SplitArray {
    
    private int[][] array;

    SplitArray(int[][] array) {
        this.array = array;
    }

    ArrayList<TwoDimArraySumElementsThreaded> calculators = new ArrayList<TwoDimArraySumElementsThreaded>();
    ArrayList<Thread> threads = new ArrayList<Thread>();

    int sum = 0;

    public int getResult() {
        for (int[] row : array) {
            TwoDimArraySumElementsThreaded calculator = new TwoDimArraySumElementsThreaded(row);
            calculators.add(calculator);
        }
        for (TwoDimArraySumElementsThreaded calc : calculators) {
            Thread aThread0 = new Thread(calc);
            threads.add(aThread0);
            aThread0.start();
        }

        
        for (Thread thre : threads) {
            try {
                thre.join();
            } catch(Exception e){System.out.println(e);}     
        }    
            

        for (TwoDimArraySumElementsThreaded calc : calculators) {
            sum += calc.getResult();
        }

        return sum;
    }

}
