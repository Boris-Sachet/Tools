package Tools;

/**
 * This is a convenient toolbox for printing stuff
 *
 * @author     Boris Sachet
 */

public class Print {
    //
    // One dimension table printers
    //
    /**
     * Display table of Strings
     * @param tab : table of String
     */
    public static void printTab(String[] tab) {
        int maxCellLength = 0;
        // Run through the whole table and get the length of the biggest element in the table (to format nicely on display)
        for (String cell : tab) {
            if (cell.length() > maxCellLength) {maxCellLength = cell.length();}
        }
        // Display length normalised tab content +1 for spacing between cells
        for (String cell : tab) {
            System.out.print(Format.normaliseLength(cell,(maxCellLength + 1)));
        }
        System.out.println();
    }

    /**
     * Display table of Strings vertically
     * @param tab : table of String
     */
    public static void printTabVertical(String[] tab) {
        int maxCellLength = 0;
        // Run through the whole table and get the length of the biggest element in the table (to format nicely on display)
        for (String cell : tab) {
            if (cell.length() > maxCellLength) {maxCellLength = cell.length();}
        }
        // Display length normalised tab content +1 for spacing between cells
        for (String cell : tab) {
            System.out.println(Format.normaliseLength(cell,(maxCellLength + 1)));
        }
        System.out.println();
    }

    /**
     * Display table of ints
     * @param tab : table of int
     */
    public static void printTab(int[] tab) {
        int maxCellLength = 0;
        // Run through the whole table and get the length of the biggest element in the table (to format nicely on display)
        for (int cell : tab) {
            if (Get.getLength(cell) > maxCellLength) {maxCellLength = Get.getLength(cell);}
        }
        // Display length normalised tab content +1 for spacing between cells
        for (int cell : tab) {
            System.out.print(Format.normaliseLength(cell,(maxCellLength + 1)));
        }
        System.out.println();
    }

    /**
     * Display table of characters
     * @param tab : table of char
     */
    public static void printTab(char[] tab) {
        // Display length normalised tab content +1 for spacing between cells
        for (char cell : tab) {
            System.out.print(Format.normaliseLength(cell,2));
        }
        System.out.println();
    }

    /**
     * Display table of characters
     * @param tab : table of Characters
     */
    public static void printTab(Character[] tab) {
        // Display length normalised tab content +1 for spacing between cells
        for (char cell : tab) {
            System.out.print(Format.normaliseLength(cell,2));
        }
        System.out.println();
    }

    /**
     * Display table of doubles
     * @param tab : table of double
     */
    public static void printTab(double[] tab) {
        int maxCellLength = 0;
        // Run through the whole table and get the length of the biggest element in the table (to format nicely on display)
        for (double cell : tab) {
            if (Get.getLength(cell) > maxCellLength) {maxCellLength = Get.getLength(cell);}
        }
        // Display length normalised tab content +1 for spacing between cells
        for (double cell : tab) {
            System.out.print(Format.normaliseLength(cell,(maxCellLength + 1)));
        }
        System.out.println();
    }

    /**
     * Display table of floats
     * @param tab : table of float
     */
    public static void printTab(float[] tab) {
        int maxCellLength = 0;
        // Run through the whole table and get the length of the biggest element in the table (to format nicely on display)
        for (float cell : tab) {
            if (Get.getLength(cell) > maxCellLength) {maxCellLength = Get.getLength(cell);}
        }
        // Display length normalised tab content +1 for spacing between cells
        for (float cell : tab) {
            System.out.print(Format.normaliseLength(cell,(maxCellLength + 1)));
        }
        System.out.println();
    }

    //
    // Two dimensions table printer
    //
    /**
     * Display two dimensional table of int
     * @param tab : table 2D of int
     */
    // Note tab.length gives the number of lines and tab[0].length give the number of columns
    public static void printTab(int[][] tab) {
        int lineCount = 0, maxCellLength = 0;
        String tableBorder = " "; // TODO REMOVE TAB BORDER AND JUST USE SPACE

        /* Run through the whole table and get the length of the biggest element in the table (to format nicely on display) */
        for (int[] line : tab) {
            for (int columnCell : line) {
                if (Get.getLength(columnCell) > maxCellLength) {maxCellLength = Get.getLength(columnCell);}
            }
        }

        /* Make sure that maxCellLength at least match the size of the biggest line indicator in case the table if
         * filled with small values*/
        if (maxCellLength < Get.getLength(tab[0].length)) {
            maxCellLength = Get.getLength(tab[0].length);
        }

        /* Display the first line with the columns numbers */
        // Adaptable spacer to match column indicator length +2 for the ':' character and the table border '|'
        System.out.print(Format.normaliseLength("", (Get.getLength(tab.length) + 1)));
        // Display column number for each column
        for (int i = 0; i < tab[0].length; i++) {
            // +1 to account for space between columns
            System.out.print(Format.normaliseLength(i,(maxCellLength + 1)));
        }
        System.out.println();

        /* Display of the content of the table */
        // For each line in the table
        for (int[] line : tab) {
            // Display line number on the side, normalised to the biggest it can get
            System.out.print(Format.normaliseLength(lineCount, Get.getLength(tab.length)) + ":" + tableBorder);
            // For each column/item in this line // Note: this for can be replaced with the printTab method //TODO: DO JUST THAT
            for (int columnCell : line) {
                // Display the cell content (length normalised and with border)
                System.out.print(Format.normaliseLength(columnCell,maxCellLength) + tableBorder);
            }
            lineCount++;
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Display two dimensional table of String
     * @param tab : table 2D of int
     */
    // Note tab.length gives the number of lines and tab[0].length give the number of columns
    public static void printTab(String[][] tab) {
        int lineCount = 0, maxCellLength = 0;
        String tableBorder = " "; // TODO REMOVE TAB BORDER AND JUST USE SPACE

        /* Run through the whole table and get the length of the biggest element in the table (to format nicely on display) */
        for (String[] line : tab) {
            for (String columnCell : line) {
                if (columnCell != null && columnCell.length() > maxCellLength) {maxCellLength = columnCell.length();}
            }
        }

        /* Make sure that maxCellLength at least match the size of the biggest line indicator in case the table if
        * filled with small values*/
        if (maxCellLength < Get.getLength(tab[0].length)) {
            maxCellLength = Get.getLength(tab[0].length);
        }

        /* Display the first line with the columns numbers */
        // Adaptable spacer to match column indicator length +2 for the ':' character and the table border '|'
        System.out.print(Format.normaliseLength("", (Get.getLength(tab.length) + 1)));
        // Display column number for each column
        for (int i = 0; i < tab[0].length; i++) {
            // +1 to account for space between columns
            System.out.print(Format.normaliseLength(i,(maxCellLength + 1)));
        }
        System.out.println();

        /* Display of the content of the table */
        // For each line in the table
        for (String[] line : tab) {
            // Display line number on the side, normalised to the biggest it can get
            System.out.print(Format.normaliseLength(lineCount, Get.getLength(tab.length)) + ":" + tableBorder);
            // For each column/item in this line // Note: this for can be replaced with the printTab method //TODO: DO JUST THAT
            for (String columnCell : line) {
                // Display the cell content (length normalised and with border)
                System.out.print(Format.normaliseLength(columnCell,maxCellLength) + tableBorder);
            }
            lineCount++;
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Display two dimensional table of String
     * Each column will be the size of the largest item in this column
     * @param tab : table 2D of int
     */
    public static void printTabElastic(String[][] tab){
        printTabElastic(tab,' ');
    }

    /**
     * Display two dimensional table of String
     * Each column will be the size of the largest item in this column
     * @param tab table 2D of int
     * @param border character used for borders between cells
     */
    // TODO report the various improvements made in this printer into the others
    // Note tab.length gives the number of lines and tab[0].length give the number of columns
    public static void printTabElastic(String[][] tab,Character border) {
        int lineCount = 0, columnCount;
        Integer[] columnSizes = new Integer[tab[0].length];

        /*Initialize column size with the max size of the biggest line indicator*/
        for (int i = 0; i<tab[0].length;i++) {columnSizes[i] = Get.getLength(tab[0].length);}

        /* Run through the whole table and get the length of the biggest element in the table (to format nicely on display) */
        for (String[] line : tab) {
            columnCount = 0;
            for (String columnCell : line) {
                if (columnCell != null && columnCell.length() > columnSizes[columnCount]) {columnSizes[columnCount] = columnCell.length();}
                columnCount++;
            }
        }

        /* Display the first line with the columns numbers */
        // Adaptable spacer to match column indicator length +2 for the ':' character and the table border '|'
        System.out.print(Format.normaliseLength("", (Get.getLength(tab.length) + 1)) + border);
        // Display column number for each column
        for (int i = 0; i < tab[0].length; i++) {
            // +border to account for space between columns
            System.out.print(Format.normaliseLengthCenter(i,(columnSizes[i])) + border);
        }
        System.out.println();

        /* Display of the content of the table */
        // For each line in the table
        for (String[] line : tab) {
            // Display line number on the side, normalised to the biggest it can get
            System.out.print(Format.normaliseLength(lineCount, Get.getLength(tab.length)) + ":" + border);
            // For each column/item in this line // Note: this for can be replaced with the printTab method //TODO: DO JUST THAT
            columnCount = 0;
            for (String columnCell : line) {
                // Display the cell content (length normalised and with border)
                System.out.print(Format.normaliseLength(columnCell,columnSizes[columnCount]) + border);
                columnCount++;
            }
            lineCount++;
            System.out.println();
        }
        System.out.println();
    }

    // TODO : two dimension printer for all other vars formats
    
}