import java.util.Scanner;

public class Ex_1_2_3 {
    public static void main(String[] args) {

        //Counting weight for each item
        double luoti = 13.28;
        double naula = luoti*32;
        double leiviska = naula*20;

        //Creating scanner to get user input
        Scanner reader = new Scanner(System.in);
        //Asking user input. Using Double variable to save the input
        System.out.println("Enter the wight in gramms");
        double weight = Double.parseDouble(reader.nextLine());
        //Calculating how many items goes in each thing
        double leiv_amount = weight/leiviska;
        //we change amounts to int. That we calculate only full peaces.
        double nau_amount = (weight - (leiviska*(int)leiv_amount)) / naula;
        double luot_amount = (weight- leiviska*(int)leiv_amount - naula*(int)nau_amount) / luoti;

        //printing out the results
        System.out.printf(weight + "g is " + (int)leiv_amount + " leiviska " + (int)nau_amount + " naulaa and %.2f" + " luotia", luot_amount);

    }
}