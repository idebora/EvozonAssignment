package Java1;

public class Main {

    public static void main(String[] args) {

        LogicalOperations op = new LogicalOperations();

        Calculator calc = new Calculator();

//        op.printMyName();
//
//        System.out.println("Rezultatul sumei este " + calc.sum(2,3));
//
//        System.out.println("Rezultatul impartirii este " + calc.substract(2,3));
//
//        System.out.println("Rezultatul primei operatii este " +calc.operation1());
//
//        System.out.println("Rezultatul  operatiei 2 este " +calc.operation2());
//
//        System.out.println("Rezultatul  operatiei 3 este " +calc.operation3());
//
//        System.out.println(calc.addition(2,4));
//
//        System.out.println(calc.subtraction(5,9));
//
//        System.out.println(calc.multiplication(3,4));
//
//        System.out.println(calc.division(5,6));
//
//        System.out.println(calc.average(2,3,4));
//
//
//        System.out.println(op.compareTwoStrings("Evozon"));
//
//        System.out.println((op.compareStringNumber("Evhhozon",6)));

        op.counterDownHundred(2);

        op.counterBetweenTwoNumbers(50,50);

        System.out.println(op.evenNumber(9));

        System.out.println(op.checkLargestNumber(2,2,2));

        op.checkNumber(3);

        op.evenNumbersToHundred();

        System.out.println(op.addNumbersToHundred(44));

        System.out.println(op.averageNumbersToHundred(99));

        op.displayPattern();
    }



}