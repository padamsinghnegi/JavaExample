package com.padam.collection;

class MyNode {
    Integer data;
    MyNode next;
    public MyNode(Integer data) {
        this.data = data;
        next = null;
    }
}
class Queue{
	MyNode front;
	MyNode rear;
	int size=0;
	final int limit=100;
	
	void add(Integer data){
		MyNode temp=new MyNode(data);
		if(rear==null){
			rear=temp;
			front=rear;
		}else{
			rear.next=temp;
			rear=temp;
		}
		size++;
	}
	
	Integer remove(){
		if(front==null)
			return null;
		MyNode temp = front;
		front=front.next;
		if(front==null){
			rear=null;
		}
		size--;
		return temp.data;
		
	}
	
	void print(){
		
		MyNode temp=front;
		while(temp!=null){
			System.out.print(" "+temp.data);
			temp=temp.next;
		}
		
	}
	
	boolean isFull(){
		return size==limit;
	}
	
	boolean isEmpty(){
		return front==null;
	}
}
public class MyQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue =new Queue();
		queue.add(2);
		queue.add(5);
		queue.add(7);
		queue.add(1);
		System.out.println(queue.size);
		
		queue.print();
		System.out.println();
		
		queue.remove();
		queue.remove();
		System.out.println(queue.size);
		
		queue.print();
		System.out.println();
		

	}

}
