Intersection2.7

// check the end of the linkedlists
public boolean isIntersection(LinkedListNode one, LinkedListNode two)
{
	while(one.next != null || two.next != null)
	{
		if(one.next != null)
		{
			one = one.next;
		}

		if(two.next != null)
		{
			two = two.next;
		}
		
	}

	return one == two;
}

// finding out the node of intersection
// trick is to find the length of the two
// find the bigger list, and find the difference between the two lists
// make the bigger list's head incremennt by the difference, so they start at the same point
public LinkedListNode findIntersection(LinkedListNode one, LinkedListNode two)
{
	int length1 = 1;
	int length2 = 1;
	LinkedListNode newHead1 = one;
	LinkedListNode newHead2 = two;

	while(one.next != null || two.next != null)
	{
		if(one.next != null)
		{
			one = one.next;
			length1++;
		}

		if(two.next != null)
		{
			two = two.next;
			length2++;
		}
	}

	// only one of these while loops will run
	while(length1 > length2)
	{
		newHead1 = newHead1.next;
		length1--;
	}

	while(length2 > length1)
	{
		newHead2 = newHead2.next;
		length2--;
	}

	// in case there isn't a cycle that is why the null check
	while(newHead1 != newHead2 && newHead1 != null)
	{
		newHead1 = newHead1.next;
		newHead2 = newHead2.next;
	}

	return newHead1;

}