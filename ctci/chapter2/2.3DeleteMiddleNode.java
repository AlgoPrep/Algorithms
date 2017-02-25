// 
// space O(1) time O(1)
// the trick to the problem is put the next data value in the current one and then move the pointer of it to the next one
public void deleteMiddleNode(Node node){
	node.data = node.next.data;
	node.next = node.next;
}
