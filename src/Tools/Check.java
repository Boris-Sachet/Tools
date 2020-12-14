package Tools;

public class Check {
    //
    // String Content Checkers
    //
    /** Check if a string is a number
     * According to https://stackoverflow.com/a/14206803/11350845
     * @param strNum string to be checked
     * @return true if strNum is a valid number*/
    public static boolean isNumeric(String strNum) {
        return strNum != null && strNum.matches("[-+]?\\d*\\.?\\d+");
    }

    /** Check if the passed string can safely converted to Double
     * Star by checking if strNum is null
     * then do a conversion check, if it fails that means strNum is not of the expected type
     * if so the error is caught and false is returned
     * @param strNum string to be checked for double
     * @return true if strNum can be converted to double
     */
    public static boolean isDouble(String strNum) {
        if (strNum == null) {return false;}
        try {double d = Double.parseDouble(strNum);}
        catch (NumberFormatException nfe) {return false;}
        return true;
    }

    /** Check if the passed string can safely converted to Integer
     * Star by checking if strNum is null
     * then do a conversion check, if it fails that means strNum is not of the expected type
     * if so the error is caught and false is returned
     * @param strNum string to be checked for integer
     * @return true if strNum can be converted to integer
     */
    public static boolean isInteger(String strNum) {
        if (strNum == null) {return false;}
        try {int d = Integer.parseInt(strNum);}
        catch (NumberFormatException nfe) {return false;}
        return true;
    }

    /** Check if the passed string can safely converted to Float
     * Star by checking if strNum is null
     * then do a conversion check, if it fails that means strNum is not of the expected type
     * if so the error is caught and false is returned
     * @param strNum string to be checked for float
     * @return true if strNum can be converted to float
     */
    public static boolean isFloat(String strNum) {
        if (strNum == null) {return false;}
        try {float d = Float.parseFloat(strNum);}
        catch (NumberFormatException nfe) {return false;}
        return true;
    }
}
