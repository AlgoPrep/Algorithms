1.4PalindromePermutation

// Find if a string is permutation of another string

O(n) // Space
O(n) // Time

// Trick is to use a HashSet, if you see a duplicate remove it from the HashSet, and compare
// the set size. If it is a palindrome then the set size should be 1 or 0. 

// If it is of even length, each character should have a pair
// If it is of odd length, there will be one left in the set

public boolean isPalindromePermutation(String str)
{
	str = str.trim(); // removes empty spaces from the start to the end

	HashSet<Character> set = new HashSet<Character>();
	for(int i = 0; i < str.length; i++)
	{
		// removes spaces
		if(str.charAt(i) == ' ')
		{
			i += 1;
		}

		if(set.contains(str.charAt(i)))
		{
			set.remove(str.charAt(i));
		}
		else
		{
			set.add(str.charAt(i));
		}
	}
	return set.size() <= 1;
}