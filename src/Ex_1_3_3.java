import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_1_3_3 {
    public static void main(String[] args) {
        //Creating scanner to get user input
        Scanner reader = new Scanner(System.in);
        //Asking user input.
        System.out.println("Enter a number for the start point. Minimum value: 2");
        int val_1 = Integer.parseInt((reader.nextLine()));
        //Checking if number is smaller than 2 and changing it to 2
        if(val_1 <= 1){
            val_1= 2;
        }

        System.out.println("Enter a number for the end point");
        int val_2 = Integer.parseInt(reader.nextLine());
        //Array to collect all prime numbers
        List<Integer> list = new ArrayList<>();
        //loop to start checking number
        for(int i = val_1; i <= val_2; i++ ) {
           int loops = 0;
           //Dividing and number with all numbers from 2
           for(int o = 2; o <= i; o++){
                if(i % o == 0){
                    loops++;
                }
           }
           if(loops <= 1){
               list.add(i);
           }
        }
        System.out.println(list);
    }
}
