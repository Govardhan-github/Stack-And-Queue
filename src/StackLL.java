//Declaring Node Class 
class Node{
	int myNode;//Declaring MyNode Variable
	Node next;//Declaring Node Next Value
	/*
	 * Declaring Parameterized Constructor
	 * To Initialize The myNode And Next Values
	 */
	public Node(int myNode) {
		this.myNode=myNode;
		this.next = null;
	}
}
//Declaring Main StackLL Class
public class StackLL {
	private Node front;//Defining front Node
	private Node rear;//Defining rear Node
	private int length;//Defining Length 
	/*
	 * Declaring StackLL Constructor
	 * To Initialize The front
	 */
	public StackLL() {
		this.front =null;
	}
	/*
	 * Declaring enQueue Method 
	 * To Insert Nodes Into My Queue
	 */
public void enQueue(int myNode) {
	if(front == null) {
	rear = new Node(myNode);//Storing The myNode Value In  rear
	front = rear;//Pointing rear Value To Front
	}
	else {
		rear.next =new Node(myNode);//Storing myNode In rear.next
		rear = rear.next;//rear.next Is Pointing To rear
	}
	length++;
	
}
/*
 * Declaring deQueue Method 
 * To Delete Nodes In MyQueue
 */
public int deQueue() {
	//Check If Condition To Front Is Null Or Not
	if(front != null) {
		int result = front.myNode;//Storing front.myNode Value In Result
		front=front.next;//front.next Is Pointing To Front
		length--;
		return result;//Returning result
		}
		return length;//Returning length
	}

/*
 *Declaring Size Method
 *To Find The Size Of MyQueue 
 */
public int size() {
	return length;
}

/*
* Declaring DisplayQueue Method
* To Display The Nodes In My Queue
*/
public void displayQueue() {
	Node currentNode = front;//front Value Is Stored In CurrentNode
	//While Condition To Traverse The Nodes To Display
	while(currentNode != null) {
		System.out.println(currentNode.myNode);
		currentNode= currentNode.next;//CurrentNode.next Is Pointing To CurrentNode
		}
	}
}