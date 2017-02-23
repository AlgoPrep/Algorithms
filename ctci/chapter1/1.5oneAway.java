1.5OneAway

// Find if a string has a anther caracther than is one away

O(n) // Space
O(1) // Time

// Trick is to use a HashMap, if you see a duplicate decrease the count from the HashMapp, and 
// check the size of the hashmapp to be two


public boolean oneAway(String a, String b){
    int count = 0;
    HashMap<Character, Integer> map = new HashMap<Character,Integer>();
    for ( int i = 0; i < a.length(); i++){
        // adding the char to the hashmap and if we see if then we increment the values
        if(!map.contains(a.charAt(i))){
            map.put(a.charAt(i), 1);
        }
        else{
            map.put(a.charAt(i), a.get(a.charAt(i)++));
        }
        count++;
    }
    for (int i = 0; i < b.length(); i++){
        // if the values is in the map then we decrement the value
        // if that is not valid then we put the value with the negative one.
        if ( map.contains(b.charAt(i))){
            map.put(b.charAt(i), b.get(b.charAt(i)--));
        }
        else{
            map.put(b.charAt(i), -1);
        }
        count--;
    }
    return (count == 2);
}
