RotatingMatrix_1.7

public void rotate(int [][] matrix, int n)
{
	int layer = 0;
	for(layer; layer < n/2; layer++)
	{
		int first = layer;
		int last = n - layer - 1; // key for this, size - layer (for the mirror) - 1 (for the offset)
		for(int i = first; i < last; i++)
		{
			int offset = i - first;
			int top = matrix[first][i]; // save the top

			// left -> top
            matrix[first][i] = matrix[last-offset][first];          

            // bottom -> left
            matrix[last-offset][first] = matrix[last][last - offset]; 

            // right -> bottom
            matrix[last][last - offset] = matrix[i][last]; 

            // top -> right
            matrix[i][last] = top; // right <- saved top

		}
	}
}