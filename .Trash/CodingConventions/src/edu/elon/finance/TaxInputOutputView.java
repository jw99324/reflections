/*
 * TaxInputOutputView.java 1.0 2015/02/04
 *
 * Copyright (c) 2015 David J. Powell
 */
package edu.elon.finance;


import java.util.Scanner;

import javax.swing.JOptionPane;


/**
 * View to get input data from user and to display results.
 *
 * @author dpowell2
 */
public class TaxInputOutputView {
    private Scanner in;

    /**
     * Create instance with an open scanner for use by all methods of class
     */
    public TaxInputOutputView() {
        in = new Scanner(System.in);
    }

    /**
     * Displays to standard output the tax amount due
     *
     * @param amount
     *            double value of tax amount due in dollars.
     */
    public void displayReturn(double amount) {
        System.out.println("Tax: " + amount);
    }

    /**
     * Prompt the user for the total income and return the amount entered as
     * double. No error checking is done for correctness.
     *
     * @return double value of income in dollars
     */
    public double getIncome() {
        String incomeString;
        incomeString = JOptionPane.showInputDialog(null,
                "What is your total income?", "Tax Calculator",
                QUESTION_MESSAGE);
        double income = Double.parseDouble(incomeString);
        // implement this method
        return income;
    }

    /**
     * Prompts the user for marital status and returns it as integer.
     *
     * @return int value of SINGLE or MARRIED
     */
    public int getMaritalStatus() {
        String status;
        status = JOptionPane.showInputDialog(null,
                "Are you married? (Y/N)", "Tax Calculator",
                QUESTION_MESSAGE);
        System.out.print("Are you married? (Y/N) ");
        int status;
        if (input.equals("Y")) {
            status = TaxReturnModel.MARRIED;
        } else {
            status = TaxReturnModel.SINGLE;
        }
        return status;
    }
}
