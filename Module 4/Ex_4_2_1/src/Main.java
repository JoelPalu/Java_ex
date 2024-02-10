import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Calculator calc = new Calculator();

       Scanner user = new Scanner(System.in);

       //Asks user the values until user want to get the sum. User have an option to reset calculator anytime
        while(true){
              System.out.println("Enter a number to add to the total or type 'sum' to get the sum or type 'reset' to reset the calculator");
              String input = user.nextLine();
              if(input.equals("sum")){
                System.out.println("The sum is: " + calc.sum());

              }else if(input.equals("reset")){
                calc.reset();
              }else{
                try{
                     calc.add(Integer.parseInt(input));
                }catch (IllegalArgumentException e){
                     System.out.println(e.getMessage());
                }
              }
        }

    }
}