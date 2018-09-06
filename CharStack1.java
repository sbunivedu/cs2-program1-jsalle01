public class CharStack
{
  private final int MAX_CAP = 100;
  private int top; //location of top item on the stack
  private char [] s; //The stack

  public CharStack()
    //PRE:
    //POS: top == -1; empty stack
    //TAS: Create an empty stack with a default capacity
  {
    s = new char[MAX_CAP];
    top = -1;
  }

  public void push(char element)
    //PRE: top < ( MAX_SIZE -1 ) && !isFull
    //POS: to < exit > = top < entry > + 1 && s [top < entry > + 1] contains element 
    //TAS: Add a new item to the stack
  {
    top++;
    s[top] = element;
  }

  public char pop ()
    //PRE: top <= 0 && !isEmpty
    //POS: top < exit > == top < entry > -1 
    //TAS: remove and return the item on the top of the stack
  {
    char result = s[top];
    top--;
    return result;
  }
  public char peek()
  {
    return s[top];
    
  }
  public String toString()
  {
    String result = "";
    for (int x = 0; x < top +1; x++)
    {
      result = result + s[x] + "";
    }
    return result;
  }

  public boolean isEmpty()
    //PRE: N/A
    //POS: N/A
    //TAS: Return whether or not the stack is empty. HINT: look
    //     at the constructor.
  {
    if(top == -1)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public boolean isFull()
    //PRE: N/A
    //POS: N/A
    //TAS: return whether or not the stack is full
  {  
    
    return top == MAX_CAP-1;
    
  }
  
  public int size ()
    //PRE: N/A
    //POS: N/A
    //TAS: return how many items are on the stack 
  {
    return top + 1;
  }
}//end class
