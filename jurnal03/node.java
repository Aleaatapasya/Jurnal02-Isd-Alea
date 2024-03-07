public class node {
    buku data;
    node next;

    public node(buku data) {
        this.data = data;
        this.next = null;
    }

    public buku getData() {
        return data;
    }
}