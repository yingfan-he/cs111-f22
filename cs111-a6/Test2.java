public class Test2 {
    public static void main(String[] args) {
      /*  System.out.println(Math.max(15, 12.3));
        System.out.println(Math.min(15.5, 12));

        System.out.println(Math.min(7,3+2));
        System.out.println(Math.min(7.5,3+2));
        System.out.println(Math.max(15, 12));
        System.out.println(Math.pow(2,2));
        
        
        System.out.println(Math.pow(2,2));
        System.out.println(Math.ceil(2*3));
        */ 


        //CREATING AND POPULATING THE ARRAY FROM INPUT 
        int n = StdIn.readInt();
        int[][] arr = new int[n][n];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = StdIn.readInt();
            }
        }
    }
}