import java.util.Scanner;

public class Ex_1_4_3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //Asking user for input
        System.out.println("How many values you want to enter?");
        int user = Integer.parseInt((reader.nextLine()));

        //List for collection the values. It's the size of users input.
        int[] values = new int[user];
        int[] removed_duplicates = new int[user];

        //Asking [user] amount of values
        for (int i = 0; i < values.length; i++) {
            System.out.println("Enter integer " + (i + 1));
            user = Integer.parseInt((reader.nextLine()));
            //adding user given value in "values" array
            values[i] = user;
        }

        //This integer was made that we can print right amount of values. Second arrays is same size as original, so if there are duplicates, then there will be unnecessary 0 values.
        int dublicate_list_id = 0;

        //For loop to go through all given values.
        for (int value : values){
            //Integer to track how many duplicate is there. Resets to 0 every loop.
            int dublicates = 0;
            //Comparing value to the value in the array without duplicates
            for (int o = 0; o < values.length ; o++){
                //If same value is found. Duplicates counter will go 1 up
                if (value == removed_duplicates[o]){
                    dublicates++;
                }
            }
            //If there no duplicates. A value will ve added in removed_duplicates array.
            if (dublicates == 0){
                removed_duplicates[dublicate_list_id]= value;
                // +1 to id. With that print will be clean.
                dublicate_list_id++;
            }
        }
        //After all math we print results to user
        System.out.println("Array without duplicates: ");
        //Prints values from removed_duplicates list in one row.
        for (int i= 0 ; i < dublicate_list_id; i++){
            System.out.print( removed_duplicates[i] + " ");
        }
    }
}
