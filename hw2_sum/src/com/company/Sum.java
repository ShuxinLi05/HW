package com.company;

public class Sum {
    public double num;

    public int add(int num1, int num2){
        int sum = 0;
        sum = num1 + num2;

        return sum;
    }

    public double add(double[] nums){
        double sum = 0.0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        return sum;
    }

}
