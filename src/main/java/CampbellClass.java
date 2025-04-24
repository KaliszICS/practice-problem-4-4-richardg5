/**
 * Utility class containing several methods involving conversions and Strings
 * @author Richard Gao
 * @version 1.0.0
 */
public class CampbellClass {
    /**
     * Private constructor to prevent instantiating utility class
     */
    private CampbellClass() {

    }

    /**
     * Converts an int into a String
     * @param convert the int value to be converted to a String
     * @return a String representation of convert
     */
    public static String convertString(int convert) {
        return Integer.toString(convert);
    }

    /**
     * Converts a double into a String
     * @param convert the double value to be converted to a String
     * @return a String representation of convert
     */
    public static String convertString(double convert) {
        return Double.toString(convert);
    }

    /**
     * Converts a boolean into a String
     * @param convert the boolean value to be converted to a String
     * @return a String representation of convert
     */
    public static String convertString(boolean convert) {
        return Boolean.toString(convert);
    }

    /**
     * Converts a measure of inches to centimeters
     * @param inches an int representing the measure in inches
     * @return an int representing the same measure but in centimeters
     */
    public static int convertMetersToCenti(int inches) {
        return (int) (inches * 2.5);
    }

    /**
     * Converts a measure of inches to centimeters
     * @param inches a double representing the measure in inches
     * @return a double representing the same measure but in centimeters
     */
    public static double convertMetersToCenti(double inches) {
        return inches * 2.5;
    }

    /**
     * Removes all non-letter characters from a String and converts all remaining characters into uppercase or lowercase
     * @param toRemove a String to have its non-letter characters to be removed
     * @param isUpper a boolean stating whether or not the remaining letters should be uppercase or not
     * @return a String containing all remaining letter characters in the case specified
     */
    public static String removeNonAlpha(String toRemove, boolean isUpper) {
        if (isUpper) {
            return toRemove.replaceAll("[^A-Za-z]", "").toUpperCase();
        }
        return toRemove.replaceAll("[^A-Za-z]", "").toLowerCase();
    }
}