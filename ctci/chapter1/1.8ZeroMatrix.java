1.8ZeroMatrix


// O(n^2) time efficiency 
// O(n) space efficiency

// this is basically using 2 arrays to store row and cols.
public int [][] fillZeroes(int [][] arr)
{
	int count = 0;
	ArrayList<Integer> rows = new ArrayList<Integer>();
	ArrayList<Integer> cols = new ArrayList<Integer>();

	for(int i = 0; i < arr.length; i++)
	{
		for(int j = 0; j < arr.length; j++)
		{
			if(arr[i][j] == 0)
			{
				rows.add(i);
				cols.add(j);
			}
		}
	}

	for(int num = 0; num < rows.size; num++)
	{
		row_num = rows.get(num);
		for(int i = 0; i < arr.length; i++)
		{
			arr[i][row_num] = 0;
		}
	}

	for(int num = 0; num < cols.size; num++)
	{
		col_num = cols.get(num);
		for(int j = 0; j < arr.length; j++)
		{
			arr[col_num][j] = 0;
		}
	}
}








//complexiy:
//space O(1)
// time O(N^2) note doing the same thing twice
public int [][] fillzeros(int[][] grid){
 
   for(int row = 0; row < grid.length; row++){
    for(int col = 0; col < grid[0].length; col++){
        if(grid[row][col] == 0){
        fill(grid, row, col);
        }
         }
    }
   for(int row = 0; row < grid.length; row++){
        for(int col = 0; col < grid[0].length; col++){
        if (grid[row][col] == -1){
            grid[row][col] = 0;
                 }
         }
    }
 
void fill(int[][] grid, int row, int col){
  // goes through the whole row and change the 1 to -1
  for(int row = 0; row < grid.length; row++){
    if(grid[row][col] != 0){
       grid[row][col] = -1;
    }
 // goes through the col and change the 1 to -1;
  for(int col = 0; col < grid.length; col++){
    if(grid[row][col] != 0){
       grid[row][col] = -1;
    }
   }
