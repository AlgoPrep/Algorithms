/**
 * First, remove all the valid pairs of parenthesis.
 * Then, the number of flips would be half of the remaining string.
 * Time: O(n)
 * Space: O(n)
 */
function flipParen(paren) {
  var list = [];
  for (var i = 0; i < paren.length; i ++) {
  	if (paren.charAt(i) == '(') {
  		list.push('(');
  	} else if (paren.charAt(i) == ')' && list[list.length - 1] == '(') {
  		list.pop();
  	} else {
  		list.push(paren.charAt(i));
  	}
  }

  return list.length / 2;
}

module.exports = flipParen;
