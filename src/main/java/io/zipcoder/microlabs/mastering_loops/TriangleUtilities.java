package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder result = new StringBuilder();
        int idx = 1 ;
        while (idx < numberOfRows) {
            String thisRow = getRow(idx) ;
            result.append(thisRow).append("\n");
            idx++;
        }
        return result.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder result = new StringBuilder();

        for (int i = 0 ; i < numberOfStars ; i++ ) {
            result.append("*");
        }
        return result.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
