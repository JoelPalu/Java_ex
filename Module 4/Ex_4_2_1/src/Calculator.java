public class Calculator {
    private int total = 0;

    public Calculator() {

    }

    //Method to add a number to the total and if number is negative, throw an exception
    public void add(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        total += number;
    }

    public void reset(){
        total = 0;
        System.out.println("Calculator reset");
    }

    public int sum(){
        return total;
    }

}
