//Declaring Node Class 
class Node{
	int myNode;//Declaring MyNode Variable
	Node next;//Declaring Node Next Value
	/*
	 * Declaring Parameterised Constructor
	 * To Intialise The myNode And Next Values
	 */
	public Node(int myNode) {
		this.myNode=myNode;
		this.next = null;
	}
}
//Declaring Main StackLL Class
public class StackLL {
	private Node head;
	/*
	 * Declaring StackLL Constructor
	 * To Intialise The head
	 */
	public StackLL() {
		this.head =null;
	}
	/*
	 * Declaring Push Method 
	 * To Push Nodes Into My Stack
	 */
public void push(int myNode) {
	Node newNode = new Node(myNode);//Storing The myNode Value in newNode
	newNode.next = this.head;//newNode.next Pointing To This.head
	this.head = newNode;//Storing newNode Value In This.head And Pointing To Next Node 
	}
	/*
	* Declaring Display Method
	* To Display The Nodes In My Stack
	*/
public void display() {
    System.out.println("My Stack Is :");//Print Statement To Print My Stack
    //If Head Is Null And Print The Stack Is empty
	if(this.head == null) {
	System.out.println("Stack is empty");
	}
	Node temp = this.head;//This.head Value Stored In Temp 
	//While Condition To Traverse The Nodes In Stack
	while(temp!=null) {
	System.out.println(temp.myNode);
	temp = temp.next;
		}//End Of While Loop
	}
}