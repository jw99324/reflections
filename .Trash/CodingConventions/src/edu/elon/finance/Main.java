/*
 * Main.java 1.0 2015/02/08
 *
 * Copyright (c) 2015 Jessica Weed
 */
package edu.elon.finance;


/**
 * Driver class that has single main method to instantiate the Controller and
 * call top control method
 *
 * @author dpowell2
 */
public class Main {

    /**
     * Driver method that starts application
     * 
     * @param args
     *            String array of command line arguments not used by application
     */
    public static void main(String[] args) {
        TaxReturnController controller = new TaxReturnController();
        controller.go();
        System.exit(0);
    }

}
