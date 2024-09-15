package ListaCircularDuplamenteEncadeada;

public class Node {
    private String element; // assumimos: os elementos são strings
    private Node next;
    private Node previous;

    public Node(String s, Node n, Node p) { element = s; next = n; previous = p; }
    public String getElement() { return element; }
    public Node getNext() {return next; }
    public Node getPrevious() {return previous; }
    public void setElement(String newElem) { element = newElem; }
    public void setNext(Node newNext) { next = newNext; }
    public void setPrevious(Node newPrevious) { previous = newPrevious; }
}
