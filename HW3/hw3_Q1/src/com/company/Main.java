package com.company;

public class Main {

    public static void main(String[] args) {
        Psychiatrist psychiatrist = new Psychiatrist();
        Moody mood1 = new Happy();
        Moody mood2 = new Sad();

        psychiatrist.examine(mood1);
        psychiatrist.observe(mood1);
        System.out.println();

        psychiatrist.examine(mood2);
        psychiatrist.observe(mood2);
    }
}
