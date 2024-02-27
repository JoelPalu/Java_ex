import java.util.Scanner;

public class Ex_1_3_2 {
    public static void main(String[] args) {
        //Creating scanner to get user input
        Scanner reader = new Scanner(System.in);
        //Asking user input. Binary number
        System.out.println("Enter a binary number");
        String binary = (reader.nextLine());

        if(!binary.isEmpty()){
            int total = 0;
            int loc = 0;
            for(int i = binary.length()-1; i >= 0; i--){
                int num = Integer.parseInt(String.valueOf(binary.charAt(loc)));
                if(num != 0){
                    total += Math.pow(2,(i));
                }
                loc++;
            }
            System.out.println(total);
        }
    }
}
