package Tools;

/**
 * This is a convenient toolbox for formatting stuff into normalised strings
 *
 * @author     Boris Sachet
 */
public class Format {
    //TODO CHECK WHAT APPENDS WHEN X IS NULL
    //
    // Formatting functions
    //
    /**
     * Normalise the length off the input to the desired length
     * @param x value to normalise
     * @param length desired length of the return (should be greater than the length of the original or it won't do anything)
     * @return String containing the input and spaces to match desired length
     */
    public static String
    normaliseLength(int x, int length) {
        // Convert the int into string to get his length and initialise the spacer
        // Generate the number of spaces required to host
        return " ".repeat(Math.max(0, (length - Integer.toString(x).length()))) +x;
    }

    /**
     * Normalise the length off the input to the desired length
     * @param x value to normalise
     * @param length desired length of the return (should be greater than the length of the original or it won't do anything)
     * @return String containing the input and spaces to match desired length
     */
    public static String normaliseLength(double x, int length) {
        // Convert the int into string to get his length and initialise the spacer
        // Generate the number of spaces required to host
        return " ".repeat(Math.max(0, (length - Double.toString(x).length()))) +x;
    }

    /**
     * Normalise the length off the input to the desired length
     * @param x value to normalise
     * @param length desired length of the return (should be greater than the length of the original or it won't do anything)
     * @return String containing the input and spaces to match desired length
     */
    public static String normaliseLength(float x, int length) {
        // Convert the int into string to get his length and initialise the spacer
        // Generate the number of spaces required to host
        return " ".repeat(Math.max(0, (length - Float.toString(x).length()))) +x;
    }

    /**
     * Normalise the length off the input to the desired length
     * @param x : String ton normalise
     * @param length : desired length of the return (should be greater than the length of the original or it won't do anything)
     * @return String containing the input and spaces to match desired length
     */
    public static String normaliseLength(String x, int length) {
        // Convert the int into string to get his length and initialise the spacer
        StringBuilder spacer= new StringBuilder();
        // Manage the case where x is null
        if (x == null) {x = "";}
        // Generate the number of spaces required to host
        spacer.append(" ".repeat(Math.max(0, (length - x.length()))));
        return x+spacer;
    }

    //
    // Formatting and center functions
    //
    /**
     * Normalise the length off the input to the desired length and center it in the middle of the padding
     * @param x value to normalise
     * @param length desired length of the return (should be greater than the length of the original or it won't do anything)
     * @return String containing the input and spaces to match desired length
     */
    public static String normaliseLengthCenter(String x, int length) {
        // Convert the int into string to get his length and initialise the spacer
        StringBuilder spacer1= new StringBuilder();
        StringBuilder spacer2= new StringBuilder();

        // Size of the first spacer is the total size of the desired string minus the length of x div 2
        int spacer1Size = (length - x.length())/2;
        // Size of the second spacer is the size of the first of plus the rest of the previous division
        int spacer2Size  = (spacer1Size+((length - x.length())%2));

        // Generate the number of spaces required to host
        spacer1.append(" ".repeat(Math.max(0, spacer1Size)));
        spacer2.append(" ".repeat(Math.max(0, spacer2Size)));

        return spacer1+x+spacer2;
    }

    /**
     * Normalise the length off the input to the desired length and center it in the middle of the padding
     * @param x value to normalise
     * @param length desired length of the return (should be greater than the length of the original or it won't do anything)
     * @return String containing the input and spaces to match desired length
     */
    public static String normaliseLengthCenter(int x, int length) {
        return normaliseLengthCenter(Integer.toString(x),length);
    }

    /**
     * Normalise the length off the input to the desired length and center it in the middle of the padding
     * @param x value to normalise
     * @param length desired length of the return (should be greater than the length of the original or it won't do anything)
     * @return String containing the input and spaces to match desired length
     */
    public static String normaliseLengthCenter(double x, int length) {
        return normaliseLengthCenter(Double.toString(x),length);
    }

    /**
     * Normalise the length off the input to the desired length and center it in the middle of the padding
     * @param x value to normalise
     * @param length desired length of the return (should be greater than the length of the original or it won't do anything)
     * @return String containing the input and spaces to match desired length
     */
    public static String normaliseLengthCenter(float x, int length) {
        return normaliseLengthCenter(Float.toString(x),length);
    }
}