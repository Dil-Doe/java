public class MyLinkedList<T> {

    private Node<T> head;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;


        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс: " + index);
        }

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс: " + index);
        }

        Node<T> removedNode;

        if (index == 0) {
            removedNode = head;
            head = head.next;
            removedNode.next = null;
        } else {
            Node<T> current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            removedNode = current.next;
            current.next = removedNode.next;
            removedNode.next = null;
        }

        size--;
        return removedNode.data;
    }

    public int size() {
        return size;
    }
}
