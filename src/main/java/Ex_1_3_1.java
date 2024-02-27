import java.util.Scanner;

public class Ex_1_3_1 {
    public static void main(String[] args) {
        //Creating scanner to get user input
        Scanner reader = new Scanner(System.in);
        //Asking user input. Using Int variable to save the input
        System.out.println("Enter the A value");
        int val_a = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the B value");
        int val_b = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the C value");
        int val_c = Integer.parseInt(reader.nextLine());

        //Calculating discriminant
        double discriminant = val_b * val_b - 4 * val_a * val_c;

        //if 0 then there is no root
        if (discriminant == 0){
            System.out.println("No real roots");
        }

        //calculating both roots and printing out
        else{
            double root1 = (-val_b + Math.sqrt(discriminant))/(2*val_a);
            double root2 = (-val_b - Math.sqrt(discriminant))/(2*val_a);
            System.out.printf("Roots are %.3f and %.3f", root1, root2);
        }
    }
}
