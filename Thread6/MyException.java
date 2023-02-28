package Thread6;

public class MyException {
    int total=0;
    
    /** 
     * @param character  Character read from the user
     * @throws InvalidAlphabetException If the read character is not an alphabet
     */
    public void totalLetters(char character) throws InvalidAlphabetException
    {
        if(Character.isAlphabetic(character))
        {
            total++;
        }
        else
        {
            throw new InvalidAlphabetException("Invalid alphabet");
        }
    }
}
