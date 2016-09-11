package LinkedList;

public class LinkedListClass {
	Node head;
	Node last;
	LinkedListClass(){
		head = last = null;
	}
	/**
	 * Add element at end of the linkedList
	 * @param elem
	 */
	public void addElementToList(Node elem){
		if(head != null){
			last.next = elem;
			last = elem;
		}
		else if (head == null){
			head = last = elem;
		}
	}
	/**
	 * print all the element in the LinkedList
	 */
	public void printList(){
		Node cur = head;
		while(cur != null){
			System.out.print(cur.data + " -> ");
			cur = cur.next;
		}
	}
	/**
	 * return head of the LinkedList
	 * @return
	 */
	public Node getHead(){
		return head;
	}
	
	/**
	 * return last element in LinkedList
	 * @return
	 */
	public Node getTail(){
		return last;
	}
	/**
	 * return size of the LinkedList
	 * @param cur
	 * @return
	 */
	public int getlistLenght(Node cur){
		if(cur == null){
			return 0;
		}
		else {
			cur = cur.next;
			return 1+ getlistLenght(cur);
		}
	}
	/**
	 * check weather linkList contains data
	 * @param elem 
	 * @param data
	 * @return
	 */
	public boolean searchList(Node elem, int data){
		if(elem == null){
			return false;
		}
		else if(elem.data == data){
			return true;
		}
		else {
			return(searchList(elem.next, data));
		}
		
	}
    /*
	/*
	 * Reverse the given linklist using recursion
	 */
	public Node reverseList(Node curr, Node prev){
        if (curr.next == null) {
            head = curr;
            curr.next = prev;
            return null; 
        }
        Node next1 = curr.next;
        curr.next = prev;
        reverseList(next1, curr);
        return head;
	}
	
	public void rotate(Node elem, int val){
		if(val == 0){
			return;
		}
		Node cur = head;
		Node start = head;
		for(int i = 0;i < val; i++){
			cur = cur.next;
		}
		Node kNode = cur;
		head = cur.next;
		last.next = start;
		kNode.next = null;
		last = kNode;
	}
}						

