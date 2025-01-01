public class Test3 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        // Printing out every element in the 2d array, row by row 
        // prints out 1,2,3,4,5,6,7,8,9
          for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " , ");
            }
        }
        

        // Printing out every element in the 2d array, column by column (literally swap the inner and outer loop)
        // prints out 1,4,7,2,5,8,3,6,9
        for (int col = 0; col < arr[0].length; col++) {
            for (int row = 0; row < arr.length; row++) {
                System.out.print(arr[row][col] + " , ");
                
            }
        }
        
    }
}