/**
 * Given a binary tree, create a linked list for each level in the tree
 * and return a list of all the linked lists. The binary tree is not guaranteed
 * to be complete and/or full.
 * 
 * The solution uses BFS to get each node of the same level. It uses two counter variables
 * to keep track of the current level and how many nodes are in the next level.
 *
 * Time: O(n) because it iterates through each node in the tree.
 * Space: O(n) because it uses a queue as well as makes a new node for every node in the tree.
 */
public List<Node> depthList(Node root) {
	// Queue to implement BFS.
	Queue<Node> queue = new Queue<Node>();

	// What is returned at the end.
	List<Node> results = new List<Node>();

	// The root node to begin each value in the results array.
	LinkedList list = new LinkedList();

	// level represents how many nodes are in the current level.
	// This is hardcoded to 1 at first because we start with the root node.
	int level = 1;
	// numOfNodesInLevel represents how many nodes are in the next level.
	int numOfNodesInLevel = 0;

	list.add(new Node(root.element));
	queue.enqueue(root);	

	while (!queue.isEmpty()) {
		Node currentNode = queue.dequeue();
		level --;

		if (currentNode.left != null) {
			queue.enqueue(currentNode.left);
			// Increment this counter when adding to the queue.
			numOfNodesInLevel ++;
		}

		if (currentNode.right != null) {
			queue.enqueue(currentNode.right);
			numOfNodesInLevel ++;
		}

		// Make a new level.
		if (level == 0) {
			// Set the counters for the next level and reset the next level counter.
			level = numOfNodesInLevel;
			numOfNodesInLevel = 0;

			// The current level is complete, so add it to the results list.
			results.add(list);

			// Every level is a new LinkedList.
			list = new LinkedList()


		} else {
			// Add the current node to the list.
			list.add(new Node(currentNode.element));
		}

	}

	return results;
}

{"vl":{
	"0": { "x":20,"y":160 },
	"1": { "x":160,"y":80 },
	"2": { "x":320,"y":20 },
	"3": { "x":160,"y":220 },
	"4": { "x":260,"y":140 },
	"5": { "x":400,"y":80 },
	"6": { "x":260,"y":340 },
	"7": { "x":400,"y":220 },
	"8": { "x":580,"y":160 }},
	"el":{
		"0": { "u":0,"v":1,"w":5 },
		"1": { "u":1,"v":2,"w":4 },
		"2": { "u":2,"v":5,"w":3 },
		"3": { "u":5,"v":8,"w":6 },
		"4": { "u":0,"v":3,"w":14 },
		"5": { "u":3,"v":6,"w":5 },
		"6": { "u":6,"v":7,"w":3 },
		"7": { "u":7,"v":8,"w":12 },
		"8": { "u":3,"v":7,"w":2 },
		"9": { "u":5,"v":7,"w":3 },
		"10": { "v":1,"u":3,"w":13 },
		"11": { "u":1,"v":5,"w":4 },
		"12": { "v":4,"u":5,"w":4 },
		"13": { "v":3,"u":4,"w":6 }
	}
}