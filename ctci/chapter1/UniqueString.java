public class UniqueString {
  public static void main(String[] args) {
  }

  /**
   * With hashset datastructure, this gives us linear time and space complexity
   */
  public boolean findUnique(String str) {
    HashSet<Character> set = new HashSet<Character>();

    for (int i = 0; i < str.length(); i ++) {
      if(set.contains(str.charAt(i)) {
        return false;
      }

      set.add(str.charAt(i));
    }

    return true;
  }


}
