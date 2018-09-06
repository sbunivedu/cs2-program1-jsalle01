import java.util.Scanner;

public class CharStackTester1
{
	public static void main(String[] args)
	//TAS: A driver class to test the character
	{
		CharStack stack = new CharStack();

		//Test push and pop
		stack.push ('a'); //stack = a
		
		stack.push ('b'); //stack = ba
		
		stack.push ('c'); //stack = cba
		
		System.out.println(stack.pop()); //shows c
		
		System.out.println(stack.pop()); //shows b
		
		System.out.println(stack.pop()); //shows a
		//Continue to test all other methods to make sure they work as they should.
		stack.push('b');
		System.out.print(stack.peek());
		
		System.out.print(stack.isEmpty());
		
		stack.pop();
		
		System.out.print(stack.isEmpty());
		
		System.out.print(stack.isFull());
		
		for (int x = 0; x < 96; x++)
			stack.push('a');
			stack.pop();
			System.out.print(stack.isFull());
			
		System.out.println(stack.peek());
		for (int i = 9; i < -1; i-- )
			{
				stack.pop();
			}
		System.out.println(stack.isEmpty());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a parenthese: ");
		String p = scan.next();
		boolean error = false;
		stack = new CharStack();
		
		for (int i = 0; i < p.length(); i++)
		{
			char current = p.charAt(i);
			if (current == '(')
			{
				stack.push(current);
			}
			else if (current == ')')
			
			if (!stack.isEmpty())
			{
				stack.pop();
			}
			else
			{
				error = true;
			}
		}
		
		if(error == true)
			System.out.println("Too many right parenshese");
		else if (!stack.isEmpty())
			System.out.println("Too many left parensthese");
		else
			System.out.println("perfect");
		
	}// end main
}//end class
