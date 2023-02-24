package Thread6;

public class InvalidAlphabetException extends Exception
{
    String msg;
    InvalidAlphabetException(String msg)
    {
        this.msg=msg;
    } 
}
