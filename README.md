# Linked List:

Implement a method called `findMiddleNode` that returns the middle node of the linked list.

If the list has an even number of nodes, the method should return the second middle node.

##Description:
When the linked list has an odd number of nodes, like `1 -> 2 -> 3 -> 4 -> 5`, the function will find the exact middle node. In this case, it will return the node containing the value `3`.

When the linked list has an even number of nodes, there will be two middle nodes. The findMiddleNode function will return the second of these two middle nodes.

For example, if the linked list is `1 -> 2 -> 3 -> 4 -> 5 -> 6`, the two middle nodes are 3 and 4. The function will return the node containing the value `4`.

![34961473-1c9daf82-f9f4-11e7-90f2-45715b015edf](https://github.com/Sarmad-Chandio/FindMiddleNodeLinkedList/assets/87301967/f26bcb78-4892-4658-9fdd-0de801cfbe0f)

Image from: https://www.tutorialspoint.com/data_structures_algorithms/linked_lists_algorithm.htm


### Method Signature

```java
public Node findMiddleNode()
LinkedList myList = new LinkedList(1);

### EXAMPLE
LinkedList myList = new LinkedList(1);
myList.append(2);
myList.append(3);
myList.append(4);
myList.append(5);
Node middleNode = myList.findMiddleNode();
System.out.println(middleNode.value); // Output: 3

myList.append(6);
middleNode = myList.findMiddleNode();
System.out.println(middleNode.value); // Output: 4



