/**
 * This is a convenient toolbox for formatting stuff into normalised strings
 *
 * @author     Boris Sachet
 */
public class Format {
    //TODO CHECK WHAT APPENDS WHEN X IS NULL
    //
    // Formating functions
    //
    /**
     * Normalise the length off the input to the desired length
     * @param x value to normalise
     * @param length desired length of the return (should be greater than the length of the original or it won't do anything)
     * @return String containing the input and spaces to match desired length
     */
    public static String normaliseLength(int x, int length) {
        // Convert the int into string to get his length and initialise the spacer
        String spacer="";
        // Generate the number of spaces required to host
        for (int i=0; i < (length - Integer.toString(x).length()); i++) spacer+=' ';
        return spacer+x;
    }

    /**
     * Normalise the length off the input to the desired length
     * @param x value to normalise
     * @param length desired length of the return (should be greater than the length of the original or it won't do anything)
     * @return String containing the input and spaces to match desired length
     */
    public static String normaliseLength(double x, int length) {
        // Convert the int into string to get his length and initialise the spacer
        String spacer="";
        // Generate the number of spaces required to host
        for (int i=0; i < (length - Double.toString(x).length()); i++) spacer+=' ';
        return spacer+x;
    }

    /**
     * Normalise the length off the input to the desired length
     * @param x value to normalise
     * @param length desired length of the return (should be greater than the length of the original or it won't do anything)
     * @return String containing the input and spaces to match desired length
     */
    public static String normaliseLength(float x, int length) {
        // Convert the int into string to get his length and initialise the spacer
        String spacer="";
        // Generate the number of spaces required to host
        for (int i=0; i < (length - Float.toString(x).length()); i++) spacer+=' ';
        return spacer+x;
    }

    /**
     * Normalise the length off the input to the desired length
     * @param x : String ton normalise
     * @param length : desired length of the return (should be greater than the length of the original or it won't do anything)
     * @return lenght of input param
     */
    public static String normaliseLength(String x, int length) {
        // Convert the int into string to get his length and initialise the spacer
        String spacer="";
        // Manage the case where x is null
        if (x == null) {x = "";}
        // Generate the number of spaces required to host
        for (int i=0; i < (length - x.length()); i++) spacer+=' ';
        return x+spacer;
    }
}
