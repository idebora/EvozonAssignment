package Java1;

public class LogicalOperations {


    public void printMyName() {

        System.out.println("Hello \n Debora");

    }

    public String compareTwoStrings(String word){

        if (word.equals("Evozon")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }

    }

    public String compareStringNumber(String word, int number){

        if (word.equals("Evozon") && number<=3) {
            return word + number;

        } else if ((!word.equals("Evozon")) && number>=4) {
            return number + word;

        }
        else {
            return "Conditiile nu au fost indeplinite simultan";
        }
    }

   /* Create a method in the LogicalOp class that takes a number as a parameter.
    The method should check the received number and display in the console a count down to -100,
    starting from the number received as a parameter. Pay attention to the type of method created,
    as the method displays, not returns. Call the method in the Main class,
    main() method to check if it works.

    */

    public void counterDownHundred(int number){
        for(int i = number; i>=-100; i--){
            System.out.println(i);
        }
    }


//    Create a method in the LogicalOp class that takes two number parameters.
//    The method should check which of the two numbers is larger and perform an ascending
//    count from the smaller number to the larger number (e.g. if int x is the first parameter
//    and int y is the second, if x is greater than y, then the count should be from y to x).
//    Pay attention to the type of method created, as the method displays, not returns.
//    Call the method in the Main class, main() method to check if it works.


    public void counterBetweenTwoNumbers(int firstNumber, int secondNumber ){
        if (firstNumber<secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++) {
                System.out.println(i);
            }
        }
        else {
            for (int i = secondNumber; i <= firstNumber; i++) {
                System.out.println(i);
            }
        }
    }

//     Create a method in the LogicalOp class that displays all even numbers from 1 to 100.



}
