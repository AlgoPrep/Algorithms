public boolean finalStart(Node head) {
	Node fast = head;
	Node copy = head;
	Node slow = head;
 	while(fast.next != null && fast.next.next != null) {
		fast = fast.next.next;
		slow = slow.next;	
		if (fast == slow) {
			while (copy != fast) {
				copy = copy.next;
				fast = fast.next;
				if (copy == fast) {
					return true;
				}
				}
		}
	return false;
}
		
