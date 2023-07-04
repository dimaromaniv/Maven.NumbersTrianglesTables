package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static Boolean isItEven (int number) {
        if( number % 2 == 0) {
            return true;
        }
        else {
            return  false;
        }
    }
    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        for (int i = start ; i < stop ; i++ ) {
            if(!isItEven(i)) {
                result = result +=i;
            }
        }
        return result.toString();
    }


    public static String getOddNumbers(int start, int stop) {
            String result = "";
            for (int i = start ; i < stop ; i++ ) {
                if(isItEven(i)) {
                    result = result +=i;
                }
            }
            return result.toString();

    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start,stop,step,2).toString();
    }

    public static String getRange(int stop) {
        String result = "";
        for (int i = 0 ; i < stop ; i ++) {
            result = result + i;
        }
        return result.toString();
    }

    public static String getRange(int start, int stop) {
        String result = "";
        for (int i = start ; i < stop ; i ++) {
            result = result + i;
        }
        return result.toString();

    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i = start ; i < stop ; i += step) {
            result = result + i;
        }
        return result.toString();

    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
         StringBuilder resultStb = new StringBuilder();

        for ( int i = start ; i < stop; i+= step) {
            resultStb.append((int) Math.pow(i,exponent));
        }
        return resultStb.toString();
    }
}
