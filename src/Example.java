public class Example {
    public static void main(String[] args) throws Exception{
        int[][] bsp = new int[4][];
        bsp[0] = new int[] {1,2,3,4};
        bsp[1] = new int[] {32,43,45};
        bsp[2] = new int[] {12,12};
        bsp[3] = new int[] {0,87,90,76,45};

        
        SplitArray summe = new SplitArray(bsp);


        System.out.println("Final sum: " + summe.getResult());
    
    }
}