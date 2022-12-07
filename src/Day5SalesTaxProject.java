/*
    Program to calculate taxes and total purchase price
    Manli HartChang
    12/4/2022
 */

import java.util.Scanner;

public class Day5SalesTaxProject {
    //Global Variables
    static final double COUNTY_TAX = .04;
    static final double STATE_TAX = .02;
    static String iData;
    static int iPurchasePrice;

    static double cStateTax,cCountyTax,cTotalSalesTax,cTotalSale;
    static Scanner inputKeyboard;

    //main is the required method
    public static void main(String[] args) {
        init();
        input();
        calcs();
        output();
    }

    public static void output(){
        System.out.println("Purchase Price: " + iPurchasePrice);
        System.out.println("State Tax: " + cStateTax);
        System.out.println("County Tax: " + cCountyTax);
        System.out.println("Total Sales Tax: " + cTotalSalesTax);
        System.out.println("Total Sale: " + cTotalSale);
    }

    public static void calcs() {
        cStateTax = iPurchasePrice * STATE_TAX;
        cCountyTax = iPurchasePrice * COUNTY_TAX;
        cTotalSalesTax = cStateTax + cCountyTax;
        cTotalSale = iPurchasePrice + cTotalSalesTax;
    }
    public static void input(){
        System.out.println("Please enter your purchase price: ");
        iData = inputKeyboard.nextLine();

        //Convert the String iPurchasePrice to integer
        iPurchasePrice = Integer.parseInt(iData);
    }

    public static void init() {
        // instantiate the inputKeyboard object
        // objectname = new Classname(arguments)
        inputKeyboard = new Scanner(System.in);
    }
}


