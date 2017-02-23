// check if a string is a permutation of another

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