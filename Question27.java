/*
 * Program that calculates how much a $14000 investment would be worth if it increased in value
 * by 40% the first year, lost $1500 in second year and increased 12% the third year
 */
public class Question27 {
    public static void main(String[] args) { 
        float inv = 14000;
        float Initialinv = inv;
        System.out.println("Initial investment: $" + inv);
        //Inceased by 40% the first year
        inv+=(inv * .4f);
        System.out.println("After 1st year: $" + inv);
        //Lost $1500 the second year
        inv-=1500f;
        System.out.println("After 2nd years: $" + inv);
        // Increased by 12% the third year
        inv += (inv * .12f);
        System.out.println("After 3rd years: $" + inv);
        if(Initialinv<inv)
        {
            System.out.println("The investment is worth");
        }
    }
}
