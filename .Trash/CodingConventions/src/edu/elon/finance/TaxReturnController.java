/*
 * TaxReturnController.java 1.0 2015/02/04
 *
 * Copyright (c) 2015 David J. Powell
 */
package edu.elon.finance;


/**
 * Converts all of the user's answers into something Java can use to create a
 * tax model and then shows the user what their taxes are
 *
 * @author jweed
 *
 */

public class TaxReturnController {

    /**
     * Top level control method that creates instance of View, gets marital
     * status and income, creates instance of tax model, gets tax amount from
     * model and has View display the tax amount
     */
    public void go() {
        TaxInputOutputView view = new TaxInputOutputView();
        int maritalStatus = view.getMaritalStatus();
        double income = view.getIncome();
        TaxReturnModel model = new TaxReturnModel(income, maritalStatus);
        double tax = model.getTax();
        view.displayReturn(tax);
    }

}
