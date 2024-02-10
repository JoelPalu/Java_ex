#### Ex_4_2_2
# Calculator


<p> Here we going to explain how this calculator works </p>
<p> The calculator is a simple calculator that can do the following operations: </p>
<ul>
  <li> Add </li>
  <li> Reset </li>
  <li> Sum </li>
</ul>   

    public class Calculator {
    private int total = 0;

        Calculator() {
    
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

Calculators constructor is empty, so it does not take any parameters. There is no need to write a constructor, but it is good practice to do so.

The add method takes an integer as a parameter and adds it to the total.
If the number is negative, it throws an IllegalArgumentException. 

The reset method sets the total to 0 and prints "Calculator reset". 

The sum method returns the total value.



    

