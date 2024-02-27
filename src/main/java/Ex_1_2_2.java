import java.util.Scanner;

public class Ex_1_2_2 {
    public static void main(String[] args) {
        //Creating scanner to get user input
        Scanner reader = new Scanner(System.in);
        //Asking user input. Using Double variable to save the input
        System.out.println("Enter length of the first leg");
        double leg1 = Double.parseDouble(reader.nextLine());
        System.out.println("Enter length of the second leg");
        double leg2 = Double.parseDouble(reader.nextLine());
        //Calculating hypotenuse
        double hypotenuse = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
        System.out.println("Hypotenuse " + hypotenuse);

    }
}