import java.util.Scanner;

public class Ex_1_2_1 {
    public static void main(String[] args){
        //Creating scanner to get user input
        Scanner reader = new Scanner(System.in);
        //Asking user input. Using Double variable to save the input
        System.out.println("Enter degrees in fahrenheit");
        double Fd = Double.parseDouble(reader.nextLine());
        //Calculating Fahrenheit to celsius
        double celsius = (Fd-32)*5/9;
        //Printing the results
        System.out.printf(Fd + " fahrenheit in celsius %.1f\n ", celsius);
    }
}
