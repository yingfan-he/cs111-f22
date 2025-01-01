/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author:
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 2 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 2
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {
		int argscount = args.length;
        int arr[] = new int[argscount];
        boolean duplicate = false;
        for (int i = 0; i < args.length; i++) {
            int input = Integer.parseInt(args[i]);
            arr[i] = input;
        }
        for (int i = 0; i < argscount; i++) {
            for (int j = i+1; j < argscount; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }


                }
                

        }
		System.out.println(duplicate);

    }
   
}
		
		
		
