package org.khanyi;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sum = new Scanner(System.in);
        System.out.println("Enter your calculation ");
        String cs = sum.nextLine();
        System.out.println(calculator(cs));

    }
    public static float calculator( String calc){

        
        String[] nums = calc.split(" ");
        float num1 = Float.parseFloat(nums[0]);
        String operator = nums[1];
        float num2 = Float.parseFloat(nums[2]);

        float result = 0 ;

    if (operator.equals("+")) {
        result = add(num1, num2);

    } else if (operator.equals("-")) {
        result = subtract(num1, num2);
    } else if (operator.equals("*")) {
        result = multiply(num1, num2);
    } else if (operator.equals("/")) {
        result = divide(num1,  num2);

    } else {
        System.out.println("Number Format Exception");
    }

    return result;


    }
    public static float add(float num1, float num2){
        float sum = num1 + num2;
        return sum;
    }
    public static float subtract(float num1, float num2){
        float diff= num1 - num2;
        return diff;
    }
    public static float multiply(float num1, float num2){
        float product= num1 * num2;
        return product;
    }
    public static float divide(float num1, float num2){
        float quotient= num1 / num2;
        return quotient;
    }
}