package Question5;

/*
 * Write a class with a method that throws an exception of the type in previous exercise.
 * Compile this without the catch exception
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

