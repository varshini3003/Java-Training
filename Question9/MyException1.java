package Question9;

/*
 * In the same previous program, write your own exception classes to take care of negative values and 
 * values out of range (i.e. other than in the range 0-100) and do not allow program to terminate, give 
 * the message upon the wrong input submitted by the user.
 */
class MyException1 
{
    public void validateMark(int number) throws NumberFormatException
    {
        if(number<0 || number>100) 
        {
            throw new NumberFormatException("Invalid marks...Please enter the correct marks");
        }
    }
}