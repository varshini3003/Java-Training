package Question4;

/*
 * Create your own exception.
 * In main() create a try-catch clause to exercise your own exception
 */

class PhoneNoInvalidException extends RuntimeException 
{
    String message;
    public PhoneNoInvalidException(String message) 
    {
        this.message=message;
    }
    public String toString() 
    {
	return message;
    }	
}



