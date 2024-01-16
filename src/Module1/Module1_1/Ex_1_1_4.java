package Module1.Module1_1;//ex_1_4

public class Ex_1_1_4 {
    private String name;

    public Ex_1_1_4(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Ex_1_1_4 cat1 = new Ex_1_1_4("Whiskers");
        // Create second cat
        Ex_1_1_4 cat2 = new Ex_1_1_4("Rex");

        // Call the meow method on the cat instance
        //Modified that it calls Whiskers 2 times once Rex and then once Whiskers again.
        cat1.meow();
        cat1.meow();
        cat2.meow();
        cat1.meow();
    }
}