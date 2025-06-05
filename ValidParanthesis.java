package Basics;
import java.util.Stack;

public class ValidParanthesis {
	
	public static boolean valid(String s)
	{
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(')
			{
				stack.push(s.charAt(i));
			}
			else
			{
				if(stack.isEmpty())
					return false;
				else if(s.charAt(i)=='}')
				{
					if(stack.peek()=='{')
						stack.pop();
				}
				else if(s.charAt(i)==']')
				{
					if(stack.peek()=='[')
						stack.pop();
				}
				else if(s.charAt(i)==')')
				{
					if(stack.peek()=='(')
						stack.pop();
				}
			}
		}
		if(stack.size()==0)
			return true;
		else
			return false;
						
	}
	
	public static void main(String[] args)
	{
		String s="()[]{})";
		boolean ans=valid(s);
		if(ans)
		{
			System.out.print("valid");
			
		}
		else
			System.out.print("invalid");
	}

}
