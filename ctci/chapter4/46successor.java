// For this problem, assume the node has a parent pointer and there are no duplicates.
// There are three cases for the successor in a BST.
// 1. The node has a right child, so find the smallest element in the right subtree.
// 2. The node is a leaf node and a left child of the parent. 
//    Then the successor will be the parent.
// 3. The node is a leaf node and a right child of the parent.
//    Then the successor will be the grandparent whose connection is a a left pointer.
// 
// 
//  The solution runs in O(n) time and O(1) space
public Node successor(Node node) {
  if (node == null)  {
    return null;
  } else if (node.right != null) {
    return minNode(node.right);
  } else if (node.parent.element > node.element) { // the node is a left child
    return node.parent;
  } else if (node.parent.element < node.element) { // the node is a right child
    while (node.parent.element < node.element) {
      node = node.parent;
    }

    return node;
  }

  return null;
}

private Node minNode(Node node) {
  if (node == null) {
    return null;
  } else if (node.left == null) {
    return node;
  }
  return  minNode(node.left);
}
