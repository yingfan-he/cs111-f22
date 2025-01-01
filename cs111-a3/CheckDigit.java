/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {
        long num = Long.parseLong(args[0]);
        long num2 = Long.parseLong(args[0]);
        int sum = 0;
        while (num>0) {
            sum+= num%10;
            num /= 100;
        
        }
        sum%=10;
     

        int sum2 = 0;
        num2/=10;
        while (num2>0) {
            sum2 += num2%10;
            num2 /= 100;
            
        }
        
        sum2%=10;
        sum2*=3;
        sum2%=10;
        int result = (sum+sum2);
        result%=10;
        System.out.println(result);
        

        // WRITE YOUR CODE HERE
    }
}