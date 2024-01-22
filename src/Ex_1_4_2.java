import java.util.Scanner;

public class Ex_1_4_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //Asking user for input
        System.out.println("How many values you want to enter?");
        int user = Integer.parseInt((reader.nextLine()));

        //List for collection the values. It's the size of users input.
        int[] values = new int[user];

        //Asking [user] amount of values
        for (int i = 0; i < values.length; i++) {
            System.out.println("Enter integer " + (i + 1));
            user = Integer.parseInt((reader.nextLine()));
            //adding user given value in "values" array
            values[i] = user;
        }

        //Counting sum of the array
        String integ = "";
        // we make max sum the first value what user entered
        int max_sum = values[0];
        //Here we start with first value and every loop we move one value in the list
        for (int i = 0; i <= values.length - 1; i++) {
            //resetting sum to 0 every loop that we can compare the sub-arrays
            int sum = 0;

            //we sum values from i position
            for (int k = i; k <= values.length - 1; k++) {
                sum += values[k];

                //We compare is new sum larger than past max_sum. If yes it replaces it with new sum
                if (sum > max_sum) {
                    //Creating text for showing the integers radius in result
                    integ = i + 1 + " - " + (k + 1);
                    max_sum = sum;
                }
            }
        }
        //After all math we print results to user
        System.out.println("Max sum of values is: " + max_sum);
        System.out.println("Integers used: " + integ);
    }
}
