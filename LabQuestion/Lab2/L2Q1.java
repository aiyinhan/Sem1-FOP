package LabQuestion.Lab2;

import java.util.Scanner;

public class L2Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter degree Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celcius = (fahrenheit - 32)/1.8;
        System.out.printf("%.2f fahrenheit is %.2f celcius",fahrenheit,celcius);
        System.out.println();
    }
}