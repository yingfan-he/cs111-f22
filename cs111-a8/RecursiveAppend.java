/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author:
 *
 *************************************************************************/

public class RecursiveAppend {
    // Returns the original string appended to the original string n times 
    public static String appendNTimes(String original, int n) {
    if (n == 0) {
        return original;
    }
    return original + appendNTimes(original, n-1);


	// WRITE YOUR CODE HERE
    }

    public static void main (String[] args) {
        
    StdOut.print(appendNTimes("cat", 4));
	// WRITE TEST CASES HERE to test your method
    }
}
