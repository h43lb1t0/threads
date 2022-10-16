public class TwoDimArraySumElements {
    private final int[][] matrix;

    public TwoDimArraySumElements(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getSummeElemente() {
        int summe = 0;
        for(int i = 0; i < this.matrix.length; i++) {
            for(int j = 0; j < this.matrix[i].length; j++) {
                summe += this.matrix[i][j];
            }
        }

        return summe;
    }
}
