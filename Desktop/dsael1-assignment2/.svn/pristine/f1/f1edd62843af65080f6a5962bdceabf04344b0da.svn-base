/*
 * TCSS 342 - WINTER
 */

package applications;

import structures.LinkedOutputRestrictedDeque;
import structures.QueueADT;

/**
 * Class that stores the radixSort method to sort a list of integers.
 * 
 * @author David Saelee
 * @version 01/26/2019
 * 
 */
public final class RadixSort {
    /**
     * Constant for modulo evaluation.
     */
    private static final int CONSTANT_10 = 10;

    /**
     * A private constructor to inhibit instantiation.
     */
    private RadixSort() {

    }

    /**
     * Method that takes an unsorted collection of integers, sorts number into
     * different array indexes, and returns a sorted list of integers.
     * 
     * @param theInput a queue of integers.
     * @return a queue of sorted integers.
     */
    public static QueueADT<Integer> radixSort(final QueueADT<Integer> theInput) {

        final LinkedOutputRestrictedDeque<Integer> masterQueue =
                        new LinkedOutputRestrictedDeque<Integer>();

        @SuppressWarnings("unchecked")
        final LinkedOutputRestrictedDeque<Integer>[] indexArray =
                        (LinkedOutputRestrictedDeque<Integer>[]) 
                        (new LinkedOutputRestrictedDeque[CONSTANT_10]);

        //creates 10 array queues.
        for (int i = 0; i < indexArray.length; i++) {

            indexArray[i] = new LinkedOutputRestrictedDeque<Integer>();

        }
        //Determines the largest number in the list so the 
        //loop below knows how many iterations it will have
        //to run to sort all numbers appropriately.
        int max = 0;
        while (!theInput.isEmpty()) {

            final int number = theInput.dequeue();

            if (number > max) {

                max = number;
            }

            masterQueue.enqueueAtFront(number);
        }

        for (int i = 0; i < String.valueOf(max).length(); i++) {

            radixRepeat(i, masterQueue, indexArray);
            enqueueToMaster(masterQueue, indexArray);
        }
        return masterQueue;
    }

    /**
     * Method takes in a integer argument and applies it towards the modulus
     * calculation. Adds the respective digit to the proper index array.
     * 
     * @param theRepeatAmount integer used for modulus calculation.
     * @param theMaster queue of integers.
     * @param theList array of 10 queues.
     */
    private static void radixRepeat(final int theRepeatAmount,
                                    final LinkedOutputRestrictedDeque<Integer> theMaster,
                                    final LinkedOutputRestrictedDeque<Integer>[] theList) {

        while (!theMaster.isEmpty()) {

            final int num = theMaster.dequeue();

            final int digit = (int) (num / (Math.pow(CONSTANT_10, theRepeatAmount))
                                     % CONSTANT_10);

            theList[digit].enqueueAtFront(num);

        }

    }

    /**
     * Method loops through all array queues and dequeues each element and
     * enqueues them back to the master queue.
     * 
     * @param theMaster queue of integers.
     * @param theList array of 10 queues.
     */
    private static void enqueueToMaster(final LinkedOutputRestrictedDeque<Integer> theMaster,
                                        final LinkedOutputRestrictedDeque<Integer>[] 
                                                        theList) {

        for (int i = CONSTANT_10 - 1; i >= 0; i--) {

            while (!theList[i].isEmpty()) {

                theMaster.enqueueAtFront(theList[i].dequeue());
            }
        }

    }

}
