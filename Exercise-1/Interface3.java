interface StackOperations
{
    public void push(int data);
    public int pop();
}
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
class DynamicStack implements StackOperations
{
    int top, size;
    int[] stack;
    DynamicStack(int size)
    {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    public void push(int data)  
    {
        if(top == size-1)
        {
            System.out.println("Stack Overflow...Increasing stack size...");
            this.increaseSize();
        }
        this.stack[++top] = data;
    }
    public int pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow...");
        }
        return this.stack[top--];
    }
    void increaseSize()
    {	         
        int[] newStack = new int[this.size*2];
        for(int i=0;i<size;i++)
        {
            newStack[i] = this.stack[i];
        }
        this.stack = newStack;
        this.size = this.size*2;
    }
    public void displayDynamicStack()
    {
        System.out.println("The stack elements are:");
        for(int i=size-1; i>=0; i--)
        {
            System.out.println(stack[i]+" ");
        }
    }
}
public class Interface3 
{
    public static void main(String[] args) 
    {
        FixedStack fixedstack = new FixedStack(3);
        fixedstack.pop();
        fixedstack.push(1);
        fixedstack.push(2);
        fixedstack.push(3);
        fixedstack.push(4);
        fixedstack.displayFixedStack();
        DynamicStack dynamicstack = new DynamicStack(2);
        dynamicstack.push(100);
        dynamicstack.push(200);
        dynamicstack.push(300);
        dynamicstack.displayDynamicStack();
    }
}
