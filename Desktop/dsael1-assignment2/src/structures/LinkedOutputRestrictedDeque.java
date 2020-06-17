/*
 * TCSS 342 - WINTER
 */

package structures;

/**
 * Custom class with method designed to add node to front of queue.
 * 
 * @author David Saelee
 * @version 01/26/2019
 *
 * @param <T> Generic parameter
 */
public class LinkedOutputRestrictedDeque<T> extends LinkedQueue<T>
                implements OutputRestrictedDequeADT<T> {

    /**
     * Method adds elements to the front of the queue.
     * 
     * @param theElement passes generic parameter.
     */
    @Override
    public void enqueueAtFront(final T theElement) {

        if (mySize == 0) { // Make a queue of one element if list is empty.
            enqueue(theElement);
        } else { // Adds to the front of queue if list is not empty.
            final Node<T> temp = new Node<T>(theElement);
            temp.myNext = myFront;
            myFront = temp;
            mySize++;

        }

    }

}
