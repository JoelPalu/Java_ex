import java.util.Scanner;
import java.util.Random;

public class Ex_1_3_4 {
    public static void main(String[] args) {
        //Creating scanner to get user input
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();

        //We made infinite loop to keep giving the questions.
        while(true){
            int score = 0;

            //For loop that makes 10 cycles. 10 questions
            for (int i = 0; i <= 10; i++){
                //Generating 2 randoms between 1-10
                int rand1 = rand.nextInt(10)+1;
                int rand2 = rand.nextInt(10)+1;

                // calculating right answer
                int correct = rand1 * rand2;

                //Asking user input
                System.out.println("What is the product of " + rand1 + "x" + rand2 + "?");
                int user = Integer.parseInt((reader.nextLine()));

                //Checking if users answer is correct
                if (user == correct){
                    //When correct giving point
                    System.out.println("Correct!");
                    score++;
                }
                else{
                    //When wrong, just sends message that it was wrong.
                    System.out.println("Wrong!");
                }
            }

            //If all correct this will be true
            if (score == 10){
                System.out.println("Congratulations! You got all correct! \n press enter to start again!");
                //waiting users input to restart the quiz
                reader.nextLine();
            }

            //Just restarts from beginning.
            else{
                System.out.println("You got some wrong, try again.");
            }
        }
    }
}