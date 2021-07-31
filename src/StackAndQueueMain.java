public class StackAndQueueMain {
	/*
	 * Declaring Main Method  
	 */
public static void main(String[] args) {
	StackLL myStack = new StackLL();//Defining StackLL 
	myStack.display();
	myStack.push(70);//Pushing Node 70 Into myStack
	myStack.push(30);//Pushing Node 30 Into myStack
	myStack.push(56);//Pushing Node 56 Into myStack
	myStack.display();//Calling Display Method To Display The myStcak
	}
}
