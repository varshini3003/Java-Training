package Question_8;

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

