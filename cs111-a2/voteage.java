public class voteage {
public static void main(String[] args) { 
    int age = Integer.parseInt(args[0]);
    if (age>=18) {
        System.out.println("You can vote");
    }
    else {
        System.out.println("You can't vote");
    }
    
}
}