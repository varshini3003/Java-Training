package Visitor;

class Fruit implements ItemElement 
{
    private int pricePerKg;
    private int weight;
    private String name;
   
    public Fruit(int priceKg, int wt, String nm)
    {
        this.pricePerKg=priceKg;
        this.weight=wt;
        this.name = nm;
    }
     
    /** 
     * @return int Returns the price of the fruit per kilogram
     */
    public int getPricePerKg() 
    {
        return pricePerKg;
    }
    /** 
     * @return int Returns the weight of the fruit
     */
    public int getWeight() 
    {
        return weight;
    }
    /** 
     * @return int Returns the name of the fruit
     */   
    public String getName()
    {
        return this.name;
    }
   
    @Override
    public int accept(ShoppingCartVisitor visitor) 
    {
        return visitor.visit(this);
    }
   
}