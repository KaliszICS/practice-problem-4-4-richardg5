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
     * Converts a char into a String
     * @param convert the char value to be converted to a String
     * @return a String representation of convert
     */
    public static String convertString(char convert) {
        return Character.toString(convert);
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
     * Converts a measure of meter to centimeters
     * @param meters an int representing the measure in meters
     * @return an int representing the same measure but in centimeters
     */
    public static int convertMetersToCenti(int meters) {
        return meters * 100;
    }

    /**
     * Converts a measure of inches to centimeters
     * @param meters a double representing the measure in inches
     * @return a double representing the same measure but in centimeters
     */
    public static double convertMetersToCenti(double meters) {
        return meters * 100;
    }

    /**
     * Removes all non-letter characters from a String
     * @param toRemove a String to have its non-letter characters to be removed
     * @return a String containing all remaining letter characters
     */
    public static String removeNonAlpha(String toRemove) {
        // "[^A-Za-z]" matches all non-uppercase letters and all non-lowercase letters
        return toRemove.replaceAll("[^A-Za-z]", "");
    }

    /**
     * Removes all non-letter characters from a String and converts all remaining characters into uppercase or lowercase
     * @param toRemove a String to have its non-letter characters to be removed
     * @param isUpper a boolean stating whether or not the remaining letters should be uppercase or not
     * @return a String containing all remaining letter characters in the case specified
     */
    public static String removeNonAlpha(String toRemove, boolean isUpper) {
        if (isUpper) {
            return removeNonAlpha(toRemove).toUpperCase();
        }
        return removeNonAlpha(toRemove).toLowerCase();
    }
}