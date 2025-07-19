package org.khanyi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(calculator("12 + 3"));
    }
    public static float calculator( String calc){
        String[] nums = calc.split(" ");
        float num1 = Float.parseFloat(nums[0]);
        String operator = nums[1];
        float num2 = Float.parseFloat(nums[2]);

        float result = 0 ;

        if (operator.equals("+")){
            result = num1 + num2 ;

        }
        else if (operator.equals("-")){
            result = num1 - num2 ;
        }
        else if (operator.equals("*")){
            result = num1 * num2 ;
        }
        else if (operator.equals("/")) {
            result = num1 / num2;

        }
//
        return result;
//        System.out.println(num2);


    }
}