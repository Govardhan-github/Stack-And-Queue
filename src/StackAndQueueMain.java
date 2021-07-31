public class StackAndQueueMain {
	/*
	 * Declaring Main Method  
	 */
public static void main(String[] args) {	
	StackLL myQueue = new StackLL();//Defining myQueue  
	myQueue.enQueue(56);//Inserting Node 56 Into myQueue
	myQueue.enQueue(30);//Inserting Node 30 Into myQueue
	myQueue.enQueue(70);//Inserting Node 70 Into myQueue
	System.out.println("size Of My Queue is : " +myQueue.size());//Calling Size Method To Display The Size Of MyQueue
	myQueue.displayQueue();//Calling The DisplayQueue Method To Display Nodes
	
}
}
