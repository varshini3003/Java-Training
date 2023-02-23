package Question_8;

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