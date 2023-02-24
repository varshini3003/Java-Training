package Question_8;

class FixedStack implements StackOperations
{
    int top;
    int[] stack;
    FixedStack(int size)
    {
        stack = new int[size];
        top = -1;
    }
    public void push(int data)
    {
        if(top==stack.length-1)
        {
            System.out.println("Stack Overflow...");
        }
        else
        {
            stack[++top]=data;
        }
    }
    public int pop()
    {
        if(top<0)
        {
           System.out.println("Stack Underflow...");
           return 0;
        }    
        return stack[top--];
    }
    public void displayFixedStack()
    {
        System.out.println("The stack elements are:");
        for(int i=stack.length-1; i>=0; i--)
        {
            System.out.println(stack[i]+" ");
        }
    }
}