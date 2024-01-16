import java.util.Scanner;
public class Ex_1_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));
        //We add product calculation here
        System.out.println("The product of the numbers is " + (first * second * third));
        //To get decimals, we need make float or double variable. In this case average
        float average = (first + second + third)/3f;
        //Print average value
        System.out.println("The average of the numbers is " + average);

    }
}
