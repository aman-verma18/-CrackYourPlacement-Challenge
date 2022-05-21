class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch =='[' || ch == '(' || ch == '{')
                stack.push(ch);
            else {
                if(!stack.isEmpty() && ((ch=='}' && stack.peek() =='{') || (ch==')' && stack.peek() =='(') || (ch==']' && stack.peek() =='[')))
                    stack.pop();
                else
                    return false;
            }
        }
        // System.out.println(stack);
        if(stack.isEmpty())
            return true;
        else 
            return false;
        }
    
    }
