public class singlyLinkedList<E> {
    node head;

    public singlyLinkedList() {
        head = null;
    }

    public void addNode(buku data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Buku berhasil ditambahkan");
    }

    public void deleteNode() {
        if (head == null) {
            System.out.println();
        } else if (head.next == null) {
            System.out.println();
        } else {
            node current = head;
            node previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            System.out.println("Buku berhasil dihapus");
        }

    }

    public void printList() {
        if (head == null) {
            System.out.println("tidak ada buku");
        } else {
            node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;

            }
        }
    }
}