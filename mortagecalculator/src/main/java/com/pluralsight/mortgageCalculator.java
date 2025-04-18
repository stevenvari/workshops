package com.pluralsight;

import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This is for prompt the user

        System.out.println("Enter the loan amount e.g (5000) ");
        int loanAmount1 = scanner.nextInt();
        System.out.println("Your loan is: " + loanAmount1);

        System.out.println("type a interest rate that you would like: %");
        double interestRate1 = scanner.nextDouble();


        System.out.println("Your loan term in years: ");
        int years1 = scanner.nextInt();
        System.out.println("loan term in years is: " + years1);


        /*System.out.println("Total interest: ");
        double totalInterest2 = scanner.nextDouble();
        System.out.println("your total interest is: " + totalInterest2);*/

        //calculate monthly interest

        int monthlyPayments = years1 * 12;

        double monthlyPayment1 = loanAmount1 * interestRate1 * Math.pow(1 + monthlyPayments, years1)
                / (Math.pow(1 + monthlyPayments, years1)-1);

        System.out.println("your total payment is " + monthlyPayment1);
        System.out.println("total of interest: " + monthlyPayment1 * years1);











    }
}
