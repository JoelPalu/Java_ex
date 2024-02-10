import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        //Amount of numbers in the sequence
        int n = 100;

        int a = 0, b = 1;

        // Create a new file
        FileWriter writer = new FileWriter("Module 3/Ex_3_4_2/src/fibonacci.csv");

        // Write the header row
        writer.write("Number\n");

        //Fibonacci sequence got from google.
        for (int i = 0; i < n; i++) {
            writer.write(a + "\n");
            int temp = a;
            a = b;
            b = temp + a;
        }

        // Close the file
        writer.close();

        System.out.println("Fibonacci sequence written to fibonacci.csv");
    }
}