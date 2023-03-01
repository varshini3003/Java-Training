package Visitor;

class Book implements ItemElement
{
    private int price;
    private String isbnNumber; 
    public Book(int cost, String isbn)
    {
        this.price=cost;
        this.isbnNumber=isbn;
    }   
    /** 
     * @return int Returns the price of the book
     */
    public int getPrice() 
    {
        return price;
    } 
    /** 
     * @return String Returns the Isbn number of the book
     */
    public String getIsbnNumber() 
    {
        return isbnNumber;
    } 
    @Override
    public int accept(ShoppingCartVisitor visitor) 
    {
        return visitor.visit(this);
    }
   
}