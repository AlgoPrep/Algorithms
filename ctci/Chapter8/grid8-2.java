public List<int[2]> pathFinder(int[][] grid) {
  return pathFinder(grid, 0, 0, new List<int[2]>());
}

public List<int[2]> pathFinder(int[][] grid, int x, int y, List<int[2]> moves) {
  moves.add({ x, y });

  // The goal coordinate is xMax, yMax
  int xMax = grid[0].length - 1;
  int yMax = grid.length - 1;

  // Base case when the goal is reached
  if (x == xMax && y = yMax) {
    return moves;
  }

  if (x + 1 < xMax && grid[y][x + 1] == 0) {
    moves.add({ x + 1, y });

    List<int[2]> temp = pathFinder(grid, x + 1, y, moves);

    if (temp == null) {
      moves.pop();
    } else {
      return temp;
    }
  }

  if (y + 1 < yMax && grid[y + 1][x] == 0) {
    moves.add({ x, y + 1});

    List<int[2]> temp = pathFinder(grid, x, y + 1, moves);

    if (temp == null) {
      moves.pop();
    } else {
      return temp;
    }
  }

  return null;
}
