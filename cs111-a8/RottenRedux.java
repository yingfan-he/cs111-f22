public class RottenRedux {
    public static void main(String[] args) {
        double row = Double.parseDouble(args[0]);
        double col = Double.parseDouble(args[1]);
        double[][] arr = new double[row][col];
        double argStart = 2;
        
        for (int i = 0; i < args.length; i++) {
            for(int j= 0; j < args[0].length; j++)
            arr[i] = Double.parseDouble(argStart);
                argStart++;

        }
    }
}