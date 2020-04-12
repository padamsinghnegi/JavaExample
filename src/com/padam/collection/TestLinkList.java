package com.padam.collection;

class Node<E> {
    E data;
    Node<E> next;
    public Node(E data) {
        this.data = data;
        next = null;
    }
}

/**
 * 
 * A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.
 * 
 */
class LinkedList<E> {

    private Node<E> head = null;

    public void append(E data) {
        Node<E> lastNode = getLastNode();
        if (lastNode == null) {
            head = new Node<E>(data);
        } else {
            lastNode.next = new Node<E>(data);
        }
    }

    public void delete(E val) {
        if(head == null){
            return;
        }

        Node<E> prevNode = null;
        Node<E> currNode = head;
        while (currNode != null && currNode.data != val) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        if(prevNode == null){
            head = head.next;
            return;
        }
        if (currNode == null) {
            System.out.println("A node with that value does not exist.");
            return;
        }
        prevNode.next = currNode.next;
    }

    public void print() {
        System.out.println("");
        if(head == null){
            System.out.print("EMPTY");
            return;
        }
        Node<E> tmpNode = head;
        while (tmpNode != null) {
            System.out.print(tmpNode.data + " -> ");
            tmpNode = tmpNode.next;
        }
    }

    private Node<E> getLastNode() {
        if (head == null) {
            return null;
        }
        Node<E> tmpNode = head;
        while (tmpNode.next != null) {
            tmpNode = tmpNode.next;
        }
        return tmpNode;
    }

	public void reverseList() {

		Node<E> current = head;
		Node<E> pre = null;
		Node<E> next;
		while(current!=null){
			next=current.next;
			current.next=pre;
			pre=current;
			current=next;
		}
		
		head=pre;
	}

	public int getNoOfNodes() {
		int count=0;
		Node<E> temp = head;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}

}
class TestLinkList {
	
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<Integer>();
        myList.print();
        myList.append(35);
        myList.append(33);
        myList.append(36);
        myList.append(40);
        myList.append(15);
        myList.append(25);
        myList.print();
        myList.delete(35);
        myList.delete(35);
        myList.print();
        
        myList.reverseList();
        myList.print();
        
        System.out.println("No. of nodes :"+myList.getNoOfNodes());

    }
}