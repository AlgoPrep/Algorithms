
// This solution runs in O(n) time and O(1) space.
// Use parameters to pass the min max range to check for for all parents such as grandparent trees.
// Ex. all right nodes need to be greater than the current node and the current node's parents.
// Another solution, more time and space complex, is to make an in order array and check if the array is sorted.
public boolean isBST(Node root) {
  return isBST(root, null, null);
}

// Use integer class instead of primitive int so that min and max can be null.
// This is because int cannot be null, but integer can.
private boolean isBST(Node root, Integer min, Integer max) {
  if (root == null) {
    // Base case where no tree is a valid bst.
    return true;
  }

  // Case for an invalid bst.
  if ((min != null && root.element < min) || (max != null && root.element > max)) {
    return false;
  }

  return isBST(root.left, min, root.element) && isBST(root.right, root.element, max);
}
