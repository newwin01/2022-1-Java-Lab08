/**
 * MathDriver.java for driving MathCalculator
 * author: Jang Se Chang
 * Using Gradle will be helpful 
 */
package edu.handong.csee.java.hw2;

import edu.handong.csee.java.hw2.math.MathCalculator;
/**
*  used as driver of MathCalculator; read user input, create instance of MathDriver
*/
public class MathDriver{
    /**
     * constructor for MathDriver class
     */
    public MathDriver(){}
/**
*  main method for MathDriver
*/  
    public static void main(String[] args){
        MathDriver myDriver = new MathDriver();
        myDriver.run(args);
    }
 /**
 * run method for MathDriver; receive input and switch to right case; create instance of MathCalculator
*/
    public void run(String[] args){
       

        MathCalculator mathCalculator = new MathCalculator();

        mathCalculator.setName(args[0]);

        switch(args[1]){
            case "Max":
                System.out.println("Driver Name: " + mathCalculator.getName() + ", Answer: " + mathCalculator.getMax(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;
            case "Min": 
                System.out.println("Driver Name: " + mathCalculator.getName() + ", Answer: " + mathCalculator.getMin(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;
            case "Abs":
                System.out.println("Driver Name: " + mathCalculator.getName() + ", Answer: " + mathCalculator.getAbs(Integer.parseInt(args[2])));
                break;
            case "Sum":
                System.out.println("Driver Name: " + mathCalculator.getName() + ", Answer: " + mathCalculator.getSum(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;
            case "Diff":
                System.out.println("Driver Name: " + mathCalculator.getName() + ", Answer: " + mathCalculator.getDiff(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;
            case "Product":
                System.out.println("Driver Name: " + mathCalculator.getName() + ", Answer: " + mathCalculator.getProduct(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;
            case "Quotient":
                System.out.println("Driver Name: " + mathCalculator.getName() + ", Answer: " + mathCalculator.getQuotient(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;
            case "Remainder":
                System.out.println("Driver Name: " + mathCalculator.getName() + ", Answer: " + mathCalculator.getRemainder(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;
            case "Power":
                System.out.println("Driver Name: " + mathCalculator.getName() + ", Answer: " + mathCalculator.getPower(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;
            case "Factorial":
                System.out.println("Driver Name: " + mathCalculator.getName() + ", Answer: " + mathCalculator.getFactorial(Integer.parseInt(args[2])));
                break;
            case "Gcd":
                System.out.println("Driver Name: " + mathCalculator.getName() + ", Answer: " + mathCalculator.getGcd(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;
            case "Lcm":
                System.out.println("Driver Name: " + mathCalculator.getName() + ", Answer: " + mathCalculator.getLcm(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;
            case "Square":
                System.out.println("Driver Name: " + mathCalculator.getName() + ", Answer: " + mathCalculator.getSquare(Integer.parseInt(args[2])));
                break;
            default:
                System.out.println("Invalid command");

        }
        System.out.println("I did my best");

    }

}