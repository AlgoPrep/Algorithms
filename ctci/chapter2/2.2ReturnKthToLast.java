// Time O(n)
// Space O(1)
//get the k node from the back and we return the node
public Node getKNode(Node start, int k){
   int counter = 0;
   Node slow = start;
   Node fast = start;
   while(fast != null){
       if(counter > k ){
	 slow = slow.next;
        }
      fast = fast.next;
      counter++;
    }
   return slow;
   }
