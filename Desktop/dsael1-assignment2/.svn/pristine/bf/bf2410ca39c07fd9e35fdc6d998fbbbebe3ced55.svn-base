/*
 * TCSS 342 - WINTER
 */

package tests;

import static org.junit.Assert.*;

import exceptions.EmptyCollectionException;
import org.junit.Test;
import structures.LinkedOutputRestrictedDeque;

/**
 * OutputRestrictedDeque operations JUnit test code.
 * 
 * @author David Saelee
 * @version 01/26/2019
 *
 */
public class OutputRestrictedDequeTest {
    /**
     * Test to determine if element is added to front of queue.
     */
    @Test
    public void testEnqueueAtFront() {

        final LinkedOutputRestrictedDeque<Integer> test =
                        new LinkedOutputRestrictedDeque<Integer>();

        test.enqueueAtFront(1);
        test.enqueueAtFront(2);

        assertEquals(Integer.valueOf(2), test.dequeue());

    }

    /**
     * Test to determine if element is added to rear of queue.
     */
    @Test
    public void testEnqueue() {

        final LinkedOutputRestrictedDeque<Integer> test =
                        new LinkedOutputRestrictedDeque<Integer>();

        test.enqueue(1);
        test.enqueue(2);

        assertEquals(Integer.valueOf(1), test.dequeue());

    }

    /**
     * Test to determine if element is removed from the front of queue.
     */
    @Test
    public void testDequeue() {

        final LinkedOutputRestrictedDeque<Integer> test =
                        new LinkedOutputRestrictedDeque<Integer>();

        test.enqueue(3);
        test.enqueue(4);

        assertEquals(Integer.valueOf(3), test.dequeue());
        assertEquals(Integer.valueOf(4), test.dequeue());

    }

    /**
     * Test to determine if element is removed from the front of queue and the
     * size is correct.
     */
    @Test
    public void testSizeAfterDequeue() {

        final LinkedOutputRestrictedDeque<Integer> test =
                        new LinkedOutputRestrictedDeque<Integer>();

        test.enqueue(3);
        test.enqueue(4);
        test.dequeue();

        assertEquals(1, test.size());
        assertEquals(Integer.valueOf(4), test.dequeue());
        assertEquals(0, test.size());

    }

    /**
     * Test to determine if the correct element is at the front of the queue.
     */
    @Test
    public void testFirst() {

        final LinkedOutputRestrictedDeque<Integer> test =
                        new LinkedOutputRestrictedDeque<Integer>();

        test.enqueue(3);
        test.enqueue(4);

        assertEquals(Integer.valueOf(3), test.first());
        assertEquals(Integer.valueOf(3), test.first());

    }

    /**
     * Test to determine the size of the queue.
     */
    @Test
    public void testSize() {

        final LinkedOutputRestrictedDeque<Integer> test =
                        new LinkedOutputRestrictedDeque<Integer>();

        assertEquals(0, test.size());

        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.enqueue(4);

        assertEquals(4, test.size());

    }

    /**
     * Test to determine if the queue is empty.
     */
    @Test
    public void testIsEmpty() {

        final LinkedOutputRestrictedDeque<Integer> test =
                        new LinkedOutputRestrictedDeque<Integer>();

        assertTrue(test.isEmpty());

    }

    /**
     * Test to determine if toString prints correct queue output.
     */
    @Test
    public void testToString() {

        final LinkedOutputRestrictedDeque<Integer> test =
                        new LinkedOutputRestrictedDeque<Integer>();

        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.enqueue(4);

        assertEquals("front -> 1, 2, 3, 4", test.toString());

    }

    /**
     * Test to determine if toString prints correct queue output of an empty
     * list.
     */
    @Test
    public void testEmptyToString() {

        final LinkedOutputRestrictedDeque<Integer> test =
                        new LinkedOutputRestrictedDeque<Integer>();

        assertEquals("", test.toString());
        assertTrue(test.toString().isEmpty());

    }

    /**
     * Test to determine if the queue is empty.
     */
    @Test
    public void testIsEmptyFalse() {

        final LinkedOutputRestrictedDeque<Integer> test =
                        new LinkedOutputRestrictedDeque<Integer>();

        test.enqueueAtFront(1);

        assertFalse(test.isEmpty());

    }

    /**
     * Test to determine if removing an element from a empty queue will throw an
     * error.
     */
    @Test(expected = EmptyCollectionException.class)
    public void testExceptionThrownWhenDequeueOnEmpty() {

        final LinkedOutputRestrictedDeque<Integer> test =
                        new LinkedOutputRestrictedDeque<Integer>();

        test.dequeue();

    }

    /**
     * Test to determine if checking the front element from a empty queue will
     * throw an error.
     */
    @Test(expected = EmptyCollectionException.class)
    public void testExceptionThrownWhenFirstOnEmpty() {

        final LinkedOutputRestrictedDeque<Integer> test =
                        new LinkedOutputRestrictedDeque<Integer>();

        test.first();

    }

}
