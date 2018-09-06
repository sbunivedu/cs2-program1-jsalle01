import java.util.Scanner;

public class OpStack
{
    
    public static void main (String [] args)
    {
        System.out.println("Enter infix notation expression:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Postfix = " + convert(input));
    }//main
    
    public static String convert (String input)
    {
        CharStack opstack = new CharStack();
        char current;
        String postfix = "";
        
        for (int x = 0; x < input.length(); x++)
        {
            current = input.charAt(x);
            
            if (isOperand(current))
            {
             postfix += current;
            }//if statement
            
            else if(current == '(')
            {
                opstack.push(current);
            }//else if statement
            
            else if (current == ')')
            {
                while (opstack.peek() != '(')
                {
                    postfix = postfix + opstack.pop();
                }
                opstack.pop();
            }// else if statement 
            else if (isOperator(current))
            {
                while (opstack.isEmpty() != true && isOperator(opstack.peek()) && findPrecedence(opstack.peek()) >= findPrecedence(current))
                {
                    postfix = postfix + opstack.pop();
                }//while loop
              
                opstack.push(current);
           }//else if statement
        }// for loop
        while (!opstack.isEmpty())
        {
          postfix += opstack.pop();
        }
        return postfix;
    }// convert method 
    
    public static boolean isOperand(char y)
    {
      if ((y >='a' && y <= 'z') || (y >= 'A' && y <='Z') || (y >= '0' && y <= '9'))
      {
          return true;
      }// if statement
      else
      {
        return false;
      }// else statement
    }
    public static boolean isOperator(char y)
    {
        if ((y == '+') || (y == '-') || (y == '/') || (y == '*'))
        {
            return true;
        }// if statement 
        else 
        {
            return false;
        }// else statement
    }
    private static int findPrecedence(char y)
    {
        if ((y == '/') || (y == '*'))
        {
            return 2;
        }
        else 
        {
            return 1;
        }
    }
}