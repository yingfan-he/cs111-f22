import javax.sound.sampled.SourceDataLine;

/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {
		// arg 0 is column and arg 1 is row of the MD array
		// use nested loop, start with i+2 to start at the 3rd input to populate the array
		// if u need to isolate column or row, just hardcode [i] or [j] value
		// add edge cases
		int row = Integer.parseInt(args[0]);
		int column = Integer.parseInt(args[1]);
		int [][] movieReviews = new int[row][column];
		int argStart = 2;
		// populate the array
		for (int i = 0 ; i < row; i++) {
			for (int j = 0; j < column; j++) {
			movieReviews[i][j] = Integer.parseInt(args[argStart]);  
			argStart++;
			}
		}
		 int maxSum = Integer.MIN_VALUE;
		int sum[] = new int[column];
		for (int j = 0; j < column; j++) {
			for (int i = 0; i < row; i++) {
				sum[j] += movieReviews[i][j];		
			}
		}
		int max = 0;
		int index = 0;
		for (int i = 0; i < column; i++) {
			if (sum[i] > max) {
				max = sum[i];
				index = i;
			}	
		}
		System.out.println(index);
	}

}
