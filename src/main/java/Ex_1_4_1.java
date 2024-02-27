import java.util.Random;
import java.util.Scanner;

public class Ex_1_4_1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();

        //First name list
        String[] firstName = {"Riley", "Jasmine", "Logan", "Aurora", "Mason", "Zoe", "Oliver","Ava", "Ethan", "Harper"};
        //Last name list
        String[] lastName = {"Anderson", "Harrison", "Bennett", "Mitchell", "Reynolds", "Hawkins", "Patel", "Gallagher", "McAllister","Donovan"};

        //Asking user input
        System.out.println("How many names you want to generate?");
        int user = Integer.parseInt((reader.nextLine()));
        String[] fullNames = new String[user];

        //Loop to generate the names
        for(int i = 0; i <= user-1; i++){
            fullNames[i] = firstName[rand.nextInt(9)] +" "+ lastName[rand.nextInt(9)];

        }
        for (String name : fullNames){
            System.out.println(name);
        }




    }
}
