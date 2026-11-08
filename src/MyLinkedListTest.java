import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    @Test
    void newListShouldBeEmpty() {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        assertEquals(0, list.size());
    }

    @Test
    void shouldAddElements() {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(3, list.size());
    }

    @Test
    void shouldGetElementsByIndex() {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(30, list.get(2));
    }

    @Test
    void shouldRemoveElement() {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        int removed = list.remove(1);

        assertEquals(20, removed);
        assertEquals(2, list.size());
        assertEquals(30, list.get(1));
    }

    @Test
    void shouldRemoveOnlyElement() {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(10);

        int removed = list.remove(0);

        assertEquals(10, removed);
        assertEquals(0, list.size());
    }

    @Test
    void shouldThrowExceptionForInvalidIndex() {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));

        list.add(10);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(1));
    }

    @Test
    void shouldHandleManyElements() {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        assertEquals(1000, list.size());
        assertEquals(0, list.get(0));
        assertEquals(500, list.get(500));
        assertEquals(999, list.get(999));
    }

    @Test
    void shouldRemoveFirstAndLastElements() {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(10, list.remove(0));
        assertEquals(30, list.remove(1));

        assertEquals(1, list.size());
        assertEquals(20, list.get(0));
    }
}
