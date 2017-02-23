// check if a string is a permutation of another

// Better Solution 
// This is the better solution is to compare the ASCII values of the two strings
// If they are palindromes, they will have the same character thus the same ASCII Values

// O(1) Space
// O(n) Time
public boolean isPermutation(String A, String B)
{
	int value = 0;
	if(A.length != B.length)
	{
		return false;
	}

	for(int i = 0; i < A.length; i++)
	{
		value += A.charAt(i);
	}
	for(int i = 0; i < B.length; i++)
	{
		value -= B.charAt(i);
	}

	return value == 0;
}


// First Solution

// O(n) Space 
// O(n) Time
public boolean isPermutation(String A, String B)
{
	if(A.length != B.length)
	{
		return false;
	}

	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for(int i = 0; i < A.length; i++)
	{
		Character c = A.charAt(i);
		if(map.contains(c))
		{
			map.add(c, map.get(c) + 1);
		}
		else
		{
			map.add(c, 1);
		}
	}

	for(int i = 0; B.length; i++)
	{
		Character c = B.charAt(i);
		// you know that you are adding a character that doesn't exist, so not a permutation. 
		// Also if you have an extra duplicate, this will account because I will remove the character 
		// if it's value is 0

		if(!map.contains(c))
		{
			return false;
		}
		else
		{
			int val = map.get(c) - 1;
			if(val == 0)
			{
				map.remove(c);
			}
		}
	}

	// Since it hasn't hit the false, it is true becuase 
	return true;


}