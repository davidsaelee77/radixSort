/*
 * TCSS 342 - WINTER
 */

package applications;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import structures.LinkedOutputRestrictedDeque;
import structures.QueueADT;

/**
 * Console based program that takes in user input, reads text file of numbers,
 * and returns a text file with numbers sorted.
 * 
 * @author David Saelee
 * @version 01/26/2019
 *
 */
public final class RadixSortDemo {
    /**
     * The invalid response message.
     */
    public static final String INVALID = "You have entered an invalid response.";
    /**
     * User prompt message.
     */
    public static final String PROMPT = "Enter a file name with extension to sort contents: ";

    /**
     * A private constructor to inhibit instantiation.
     */
    private RadixSortDemo() {

    }

    /**
     * Client code to run radix sort code.
     * 
     * @param theArgs string array.
     */
    public static void main(final String[] theArgs) {

        final Scanner console = new Scanner(System.in);
        intro(console);
        console.close();

    }

    /**
     * Prompt user to enter text file name.
     * 
     * @param theInput scanner input.
     */
    private static void intro(final Scanner theInput) {

        final LinkedOutputRestrictedDeque<Integer> master =
                        new LinkedOutputRestrictedDeque<Integer>();

        try {
            System.out.println(PROMPT);

            final String inputFile = theInput.next();

            final Scanner fileInput = new Scanner(new File(inputFile));

            while (fileInput.hasNextInt()) {

                final int number = fileInput.nextInt();

                master.enqueueAtFront(number);

            }

            fileInput.close();

            final QueueADT<Integer> sortedQ = RadixSort.radixSort(master);

            writeToFile(sortedQ);

        } catch (final FileNotFoundException e) {

            System.out.println(INVALID);

            System.out.println("Would you like to try another file?");

            System.out.println("Press Y for 'YES' and N for 'NO'.");

            final String response = theInput.next();

            if ("Y".equalsIgnoreCase(response)) {

                intro(theInput);

            } else if ("N".equalsIgnoreCase(response)) {

                System.out.println("You have quit the program.");

            }

        }

    }

    /**
     * Writes sorted output to text file.
     * 
     * @param theInput queue of integers.
     */
    private static void writeToFile(final QueueADT<Integer> theInput) {

        try {

            final PrintStream ps = new PrintStream(new FileOutputStream("output.txt"));

            while (!theInput.isEmpty()) {

                ps.println(theInput.dequeue());
            }

            System.out.println("Your output file has been created.");
            ps.close();

        } catch (final FileNotFoundException e) {

            e.printStackTrace();
        }
    }

}
