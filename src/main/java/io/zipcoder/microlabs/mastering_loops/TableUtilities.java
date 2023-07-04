package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder result  = new StringBuilder();

        for(int row = 1 ; row <= tableSize ; row++) {
            for (int col = 1 ; col <= tableSize ; col ++ ){
                int product = col * row;
                result.append(String.format("%3d |", product));
             }
            result.append("\n");
        }
        String newString = result.toString();


        return newString;
    }
}
