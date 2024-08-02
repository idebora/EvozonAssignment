package Java1;

import java.util.Scanner;

public class LogicalOperations {


    public void printMyName() {

        System.out.println("Hello \n Debora");

    }

    public String compareTwoStrings(String word) {

        if (word.equals("Evozon")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }

    }

    public String compareStringNumber(String word, int number) {

        if (word.equals("Evozon") && number <= 3) {
            return word + number;

        } else if ((!word.equals("Evozon")) && number >= 4) {
            return number + word;

        } else {
            return "Conditiile nu au fost indeplinite simultan";
        }
    }

   /* Create a method in the LogicalOp class that takes a number as a parameter.
    The method should check the received number and display in the console a count down to -100,
    starting from the number received as a parameter. Pay attention to the type of method created,
    as the method displays, not returns. Call the method in the Main class,
    main() method to check if it works.

    */

    public void counterDownHundred(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }


//    Create a method in the LogicalOp class that takes two number parameters.
//    The method should check which of the two numbers is larger and perform an ascending
//    count from the smaller number to the larger number (e.g. if int x is the first parameter
//    and int y is the second, if x is greater than y, then the count should be from y to x).
//    Pay attention to the type of method created, as the method displays, not returns.
//    Call the method in the Main class, main() method to check if it works.


    public void counterBetweenTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = secondNumber; i <= firstNumber; i++) {
                System.out.println(i);
            }
        }
    }

//    ex 7 (if else)
////    Create a String method that takes a number parameter. If the
//    number is greater than 3 AND not equal to 4, return "The number is greater than 3 and not equal to 4".
//    If the number is equal to 4, return "The number is equal to 4";
//    if the number is less than 3, return "The number is lower than 3".
//    Call the method in main() to check if it works.

    public String verifyNumber3(int number) {

        if (number < 3) {
            return "The number is lower than 3";

        } else if (number == 4) {
            return "The number is equal to 4";

        } else
            return "The number is greater than 3 and not equal to 4";
    }

//    8. Create a method that takes a number as a parameter
//    and displays the number received. Using the Switch-Case construct,
//    check what number was received and display the text "The number is: x!"
//    where x should represent the number pressed. For this example, do not
//    use the concatenation of the string "The number is:" with the number from the parameter,
//    but write the entire text including the number for each case in the Switch-Case.
//    Call the method in main() to check if it works.

    public void checkNumber(int number) {
        switch (number) {
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            case 4:
                System.out.println("The number is 4");
                break;
            default:
                System.out.println("The number is bigger than 4");
                break;
        }
    }

//     9. Create a method called isNumberEven. The method should take a number as
//     a parameter and return true or false. If the number is even, return true;
//     if it is odd, return false. Call the method in main() to check if it works.

    public boolean evenNumber(int number) {
        if (number % 2 == 0) return true;
        else return false;
    }

//     10. Create a method called isEligibleToVote. The method should take a number
//     as a parameter representing the age, and the method should tell you if the person
//     has the right to vote. If the age is over 18, return true,
//     otherwise return false. Call the method in main() to check if it works.

    public boolean isEligibleToVote(int age) {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }

//      11. Create a method that takes 3 numbers as parameters and returns the largest number.
//      Call the method in main() to check if it works.

    public int checkLargestNumber(int firstnumber, int secondNumber, int thirdNumber) {
        if (firstnumber > secondNumber && firstnumber > thirdNumber) {
            return firstnumber;
        } else if (secondNumber > firstnumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (thirdNumber > firstnumber && thirdNumber > secondNumber) {
            return thirdNumber;
        } else
            return firstnumber;
    }

//     * Continuare assignment for loop
//    5 Create a method in the LogicalOp class that displays all even numbers from 1 to 100.

    public void evenNumbersToHundred() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

//     6. Create a method in the LogicalOp class that displays all odd numbers from 1 to 100.

    public void oddNumbersToHundred() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

//   7. Create a method in the LogicalOp class that takes a number parameter.
//   The method should add all numbers up to 100, starting from the number received as a parameter,
//   and return the result at the end.
//   Call the method in the Main class, main() method to check if it works.

    public int addNumbersToHundred(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    //  8.  Create a method in the LogicalOp class that takes a number parameter.
//     The method should add all numbers up to 100, starting from the number received as a parameter,
//     and calculate the average of the numbers. In the end, the method should return the average.
//     Call the method in the Main class, main() method to check if it works.

    public float averageNumbersToHundred(int number) {
        int sum = 0;
        int nr = 0;
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
            nr = nr + 1;
        }
        return (float) sum / nr;
    }

//    9.  Create a method in the LogicalOp class that displays the following pattern:
//           *******
//
//           ******
//
//           *****
//
//           ****
//
//           ***
//
//           **
//
//           *

    public void displayPattern() {
        for (int i = 0; i <7; i++) {
            for (int j = i; j < 7; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }


}







