/**
 * MathDriver.java for driving MathCalculator
 * author: Jang Se Chang
 */
package edu.handong.csee.java.hw2.math;

/** 
*Class for calculating input; 
*/
public class MathCalculator{
    /**
     * constructor for MathCalculator class
     */
    public MathCalculator () {}
    
    private String name;
    /**
    * class for receive input and save name
    */
    public void setName(String args_name){
        name=args_name;
    }
    /**
    * get saved name
    */
    public String getName(){
        return name;
    }
    /**
     * compare inputs value and return greater one
     */
    public int getMax(int num1, int num2){
        if(num1>num2)
            return num1;
        else if(num2>num1)
            return num2;
        else 
            return num1;
    }
     /**
     * compare inputs value and return less one
     */
    public int getMin(int num1, int num2){
        if(num1>num2)
            return num2;
        else if(num2>num1)
            return num1;
        else
            return num1;
    }
     /**
     * receive input and return absoulute value
     */
    public int getAbs(int num){
        if(num>=0)
            return num;
        else 
            return num*(-1);
    }
    /**
     * receive two inputs and return sum of inputs
     */
    public int getSum(int num1,int num2){
        return num1+num2;
    }
    /**
     * receive two inputs and return difference of inputs
     */
    public int getDiff(int num1,int num2){
        return num1-num2;
    }
    /**
     * receive two input and get product of input
     */
    public int getProduct(int num1, int num2){
        return num1*num2;
    }
    /**
     * receive two inputs and return quotient of inputs
     */
    public int getQuotient(int num1, int num2){
        return num1/num2;
    }
    /**
     * receive two inputs and return remainder of inputs 
     */
    public int getRemainder(int num1, int num2){
        return num1%num2;
    }

    /**
     * receive two input and return power of input1 and input2
     */

    public int getPower(int num1, int num2){
        int result=1;
        if(num2==0)
            return 1;
        else{
            for(int i=1;i<=num2;i++){
                result=num1*result;
            }
        }
        return result;
    }
    /**
     * receive one input and return factorial of input
     */
    public int getFactorial(int num){
        int result=1;
        if(num==1)
            return 1;
        else{
            for(int i=1;i<=num;i++){
                result = result *i;
            }
        }
        return result;
    }
    /**
     * receive two input and use Euclidean algorithm to get Greatest Common divisor
     */
    public int getGcd(int num1, int num2){
        int tmp;

        if(num1==0)
            return num2;
        else if(num2==0)
            return num1;
        
        if(num1<num2){
            tmp=num1;
            num1=num2;
            num2=tmp;
        }
        while(num2!=0){
            tmp=num1%num2;
            num1=num2;
            num2=tmp;
        }
        return num1;
    }
    /**
     * receive two input and use Euclidean algorithm to get LCM
     */
    public int getLcm(int num1, int num2){
        return (num1*num2/getGcd(num1,num2));
    }
    /**
     * receive input and find square
     */
    public int getSquare(int num){
        return num*num;
    }
}