public class FizzBuzz {
    public static void main(String []args) {
        for (int i = 0; i < 100; i++) {
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("SpongeBob");
            }
            else if (i % 3 == 0) {
                System.out.println("Sponge");
            }
            else if (i % 5 == 0) {
                System.out.println("Bob");
            }
            else {
                System.out.println(i);
            }
            }
        }
    }


