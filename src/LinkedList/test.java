package LinkedList;

public class test {
	public static void main(String[] args){
		LinkedListClass list = new LinkedListClass();
		list.addElementToList(new Node(12));
		list.addElementToList(new Node(25));
		list.addElementToList(new Node(13));
		list.addElementToList(new Node(32));
		list.addElementToList(new Node(132));
		list.addElementToList(new Node(322));
		list.printList();
		System.out.println("head -> "+ list.getHead().data);
		// System.out.println("count " + list.getlistLenght(list.getHead()));
		// System.out.println("search Result "+ list.searchList(list.getHead(),138));
		// list.reverseList(list.getHead(), null);
		list.rotate(list.getHead(), 2);
		System.out.println("");
		list.printList();
		System.out.println("head -> "+ list.getHead().data);
	}
}