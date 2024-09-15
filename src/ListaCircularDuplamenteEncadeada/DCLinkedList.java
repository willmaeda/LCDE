package ListaCircularDuplamenteEncadeada;

public class DCLinkedList {
    protected Node head; // nodo cabeça da lista
    protected Node tail; // nodo cauda da lista

    protected long size; // número de nodos da lista

    // Construtor default que cria uma lista vazia
    public DCLinkedList() {
        head = tail = null;
        size = 0;
    }

    public void addHead(String element) {
        Node newNode = new Node(element, head, null);
        if (size == 0) {
            tail = head = newNode;
            tail.setNext(newNode);
        } else {
            head.setPrevious(newNode);
            head = newNode;
            tail.setNext(newNode);
        }
        size++;

    }

    public void addTail(String element) {
        Node newNode = new Node(element, null, tail);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
            tail.setNext(head);
        }
        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            throw new EmptyDCLinkedList("A lista está vazia");
        }
        head = head.getNext();
        tail.setNext(head);
        size--;
        if (size == 0) {
            tail = null;
        }
    }

    // Retorna uma representação em string da lista
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current != null) {
            sb.append(current.getElement());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    public long getSize() {
        return size;
    }
}
