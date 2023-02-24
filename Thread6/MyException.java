package Thread6;

public class MyException {
    int total=0;
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
