public class LinkedList {

    //class of Node:
    class Node {
        //as each node have it's value and reference of next node
        private Node next;
        public int value;

        //constructor
        public Node(int value) {
            this.value = value;
        }
    }

    //LinkedList parameters
        // : link list has node
        // : link list has tail
        // : link list has length
    private Node head;
    private Node tail;
    private int length;

    //constructor of Linked List will create the Node by calling node class constructor
    LinkedList(int value){
        Node createdNode= new Node(value);
        this.head=createdNode;
        this.tail=createdNode;
        length=1;

    }


    //LL: Find Middle Node ( ** Interview Question)
    Node foundList;
    public Node findMiddleNode() {

        // 1. Initialize two pointers: slow and fast, both pointing to the head of the list.
        // 2. While fast and fast.next should not be null
        //3. slow moves one step away from itself
        //4. fast moves two steps away from itself
        //5. return slow
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }


    //append
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }





}
