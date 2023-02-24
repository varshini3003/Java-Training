package Question9;

class NumberFormatException extends RuntimeException 
{
    String message;
    public NumberFormatException(String message) 
    {
        this.message=message;
    }
    public String toString() 
    {
	return message;
    }	
}

