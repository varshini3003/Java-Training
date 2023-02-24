package Question_3;
/*
 * Program to prove that primitive data types are passed by value and objects and arrays are passed by reference
 */

public class Ques1 {
    public static void change(int x)
    {
        x=10;
    }
    public static void update(Proof proof)
    {      
        proof.num--;  
    }
    public static void updateArr(int arr[])
    {      
        arr[0]*=100;
    }
    public static void main(String[] args) {
        int x = 1;
        //Pass by value
        System.out.println("Pass by value");
        System.out.println("Value of x before: "+x);
        change(x);
        System.out.println("Value of x after: "+x);
        //Objects are passed by reference
        System.out.println("Pass by reference (Objects)");
        Proof proof = new Proof();
        System.out.println("Value of num before: "+proof.num);
        update(proof);
        System.out.println("Value of num after: "+proof.num);
        //Arrays are also passed by reference
        System.out.println("Pass by reference (Array)");
        int[] arr = new int[] {1};
        System.out.println("Value of array element before: "+arr[0]);
        updateArr(arr);
        System.out.println("Value of array element after: "+arr[0]);
    }
}
