package com.sg.foundations.flowcontrol.methods;


public class ReturnToSender {
    public static void main(String[] args) {
//TODO Fix the type definitions to match the return types of the called methods.

//        variable containers that hold the method's return value
        char aMystery = mystery();
        String totallyUnexpected = unexpected();
        double aSurprise = surprise();
        boolean itsClassified = classified();
        int aSecret = secret();
// print lines calling the variables that hold the method with string literal concatenation
        System.out.println("The methods have returned! Their results...\n");
        System.out.println("Mysterious: " + aMystery);
        System.out.println("    Secret: " + aSecret);
        System.out.println("Surprising: " + aSurprise);
        System.out.println("Classified: " + itsClassified);
        System.out.println("Unexpected: " + totallyUnexpected);

    }

//    Methods:
    public static int secret(){
        return 42;
    }

    public static double surprise(){
        return 3.14;
    }

    public static char mystery(){
        return 'X';
    }

    public static boolean classified(){
        return true;
    }

    public static String unexpected(){
        return "Spanish Inquisition";
    }
}
