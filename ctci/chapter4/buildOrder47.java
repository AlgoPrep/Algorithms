import java.util.ArrayList;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Stack;

public class buildOrder47 {

  public static void main(String[] args ) {

    char[] projects = "abcdef".toCharArray();
    char[][] dependencies = { 
      "da".toCharArray(),
      "bf".toCharArray(),
      "db".toCharArray(),
      "af".toCharArray(),
      "cd".toCharArray()
    };

    ArrayList<Character> list = buildOrder(projects, dependencies);
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i));
    }
  }

  /**
   * This question uses DFS and a topological sort to determine the build order.
   * The DFS determines which node to sort and in which order.
   * The topological sort determines what node is added to the build list.
   * The solution runs in O(n + m) where n is the number of nodes and m is the number of edges
   * Time: O(n + m)
   * Space: O(n)
   */
  public static ArrayList<Character> buildOrder(char[] projects, char[][] dep) {
    // Hashtable to represent the graph where the key is the node and the value is the list of adjacent nodes.
    Hashtable<Character, ArrayList<Character>> table = new Hashtable<Character, ArrayList<Character>>();
    // Hashset to keep track of duplicates.
    HashSet <Character> visited = new HashSet<Character>();
    // Stack for dfs.
    Stack<Character> stack = new Stack<Character>();

    // Populate the hashtable with empty lists.
    for (int i = 0; i < projects.length; i ++) {
      table.put(projects[i], new ArrayList<Character>());
    }

    // Iterate through the dependencies which are the edges where the second value is the start node and the first value is the end node.
    // For example, this dependency [A, B] is represented in the graph as node B points to node A.
    for (int i = 0; i < dep.length; i++) {
      ArrayList<Character> list = table.get(dep[i][1]);
      list.add(dep[i][0]);
      table.put(dep[i][1], list);
    }

    // the list to return.
    ArrayList<Character> build = new ArrayList<Character>();

    for (int i = 0; i < projects.length; i ++) {
      build = topologicalSort(table, visited, stack, build, projects[i]);
    }

    return build;
  }

  private static ArrayList<Character> topologicalSort(Hashtable<Character, ArrayList<Character>> table, HashSet<Character> visited, Stack<Character> stack, ArrayList<Character> build, char project) {
    // If the node is in the visited set then return to prevent duplicates.
    if (visited.contains(project)) return build;

    // Mark the node as visited.
    visited.add(project);
    // Add to stack for DFS.
    stack.push(project);

    // Iterate through and call recursively for every neighbor.
    ArrayList<Character> neighbors = table.get(project);
    for (int i = 0; i < neighbors.size(); i ++) {
      // Prevent duplicates
      char neighbor = neighbors.get(i);
      if (visited.contains(neighbor)) continue;

      // Set build equal to the recursive call.
      build = topologicalSort(table, visited, stack, build, neighbor);
    }

    // Add to the build list then return it.
    build.add(project);

    // Remove from stack.
    stack.pop();

    return build;
  }

}
