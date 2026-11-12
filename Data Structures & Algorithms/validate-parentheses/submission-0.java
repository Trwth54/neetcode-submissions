/*You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.

The input string s is valid if and only if:

1. Every open bracket is closed by the same type of close bracket.
2. Open brackets are closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

Return true if s is a valid string, and false otherwise.
*/

// may need methods for this

/* Idea time: make a list that copies the string. Depending on the last character entered, only certain characters are allowed after.
If it's '(' then only other bracket types facing left or a closing parenthese is allowed. */

// meh

/* New idea: make a stack */

public class Solution {
    public boolean isValid(String s) {
        // converts string into readable array
        char[] inputString = s.toCharArray();

        // create a stack
        Stack<Character> readString = new Stack<Character>();

        // fill Stack recursively
        for (char c : inputString)
        {
            
            switch (c)
            {
                case (')'):
                {
                    if (readString.empty() || readString.peek() != '(')
                        return false;

                    readString.pop();
                    break;
                }
                case (']'):
                {
                    if (readString.empty() || readString.peek() != '[')
                        return false;

                    readString.pop();
                    break;
                }
                case ('}'):
                {
                    if (readString.empty() || readString.peek() != '{')
                        return false;

                    readString.pop();
                    break;
                }
                default:
                {
                    readString.push(c);
                    break;
                }
            }
        }
        
        // if Stack is empty, return true
        return readString.empty();
    }
}