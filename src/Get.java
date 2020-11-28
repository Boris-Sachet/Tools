/**
 * This is a convenient toolbox for getting info about stuff
 *
 * @author     Boris Sachet
 */
public class Get {
    /**
     * Get number of character of the input
     * @param numb int
     * @return lenght of input param as int
     */
    public static int getLength(int numb) {
        return Integer.toString(numb).length();
    }

    /**
     * Get number of character of the input
     * @param numb int
     * @return lenght of input param as int
     */
    public static int getLength(double numb) {
        return Double.toString(numb).length();
    }

    /**
     * Get number of character of the input
     * @param numb int
     * @return lenght of input param as int
     */
    public static int getLength(float numb) {
        return Float.toString(numb).length();
    }
}
