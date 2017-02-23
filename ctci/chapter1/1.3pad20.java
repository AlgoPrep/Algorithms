/**
 * This performs the string padding in place by starting at the end.
 * Knowing that the str is at a valid capacity to contain all '%20'.
 * Keep a counter to know where to place the character.
 * This runs in linear time and requires no extra space.
 * O(n) time and O(1) space.
 */
public char[] pad20(char[] str, int len) {
	int counter = str.length;
	for ( int i = len - 1; i >= 0 ; i -- ) {
		
		if ( str[i] == '\s' ) {
			str[counter] = '0';
			str[counter - 1] = '2';
			str[counter - 2] = '%';
			counter -= 3;
		} else {
			str[counter] = str[i];
			counter--;
		}
	}

	return str;
}
