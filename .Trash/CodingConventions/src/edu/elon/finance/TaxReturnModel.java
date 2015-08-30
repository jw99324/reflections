/*
 * TaxReturnModel.java 1.0 2015/02/04
 *
 * Copyright (c) 2015 Cay Horstmann
 */
package edu.elon.finance;


/**
 * A tax return of a taxpayer in 2008
 *
 * @author dpowell2
 */
public class TaxReturnModel {

    /** Single marital status represented by 1 */
    public static final int SINGLE = 1;
    /** Married status represented by 2 */
    public static final int MARRIED = 2;

    private static final double RATE1 = 0.10;
    private static final double RATE2 = 0.25;
    private static final double RATE1_SINGLE_LIMIT = 32000;
    private static final double RATE1_MARRIED_LIMIT = 64000;

    private double income;
    private int status;

    /**
     * Constructs a TaxReturnModel object for a given income and marital status.
     * The income is assumed in dollars and the the marital status is either
     * SINGLE or MARRIED. No validation of inputs are done.
     *
     * @param anIncome
     *            double value of yearly income greater than 0
     * @param aStatus
     *            int for SINGLE or MARRIED
     */
    public TaxReturnModel(double anIncome, int aStatus) {
        income = anIncome;
        status = aStatus;
    }

    public double getTax() {
        double tax1 = 0;
        if (status == SINGLE) {
            if (income <= RATE1_SINGLE_LIMIT) {
                tax1 = RATE1 * income;
            } else {
                tax1 = RATE1 * RATE1_SINGLE_LIMIT + RATE2
                        * (income - RATE1_SINGLE_LIMIT);
            }
        } else {
            if (income <= RATE1_MARRIED_LIMIT) {
                tax1 = RATE1 * income;
            } else {
                tax1 = RATE1 * RATE1_MARRIED_LIMIT + RATE2
                        * (income - RATE1_MARRIED_LIMIT);
            }
        }

        return tax1;
    }
}
