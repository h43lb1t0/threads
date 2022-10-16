public class TwoDimArraySumElementsThreaded implements Runnable{

    int[] row;
    int sum;

    public TwoDimArraySumElementsThreaded(int[] row){
        this.row = row;
    }

    public int getResult(){
        return this.sum;
    }

    public void run() {
        for (int element : row) {
            this.sum += element;
        }
        System.out.println("summe: " + this.sum);
    }
}
