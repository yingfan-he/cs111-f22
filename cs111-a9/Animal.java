public class Animal {
    
        int age;
        public int getAge() {
            return age;
        }

        public void setAge(int x) {
            this.age = x;
        }

        public void eat() {
            System.out.println("eat");


        }
    

public static void main(String[] args) {
    Animal dog = new Animal();
    dog.eat();
    dog.setAge(8);
    System.out.println(dog.getAge());

}
}
