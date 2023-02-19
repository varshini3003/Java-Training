class Question18 
{
    static void wordConvert(char[] num)
    {
        int size = num.length;
        String[] singleDigits = new String[]{"zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine" };
        String[] twoDigits = new String[]{"ten", "eleven", "twelve",
            "thirteen",  "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"};
        String[] tens = new String[]{ "", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety" };
        String[] power_of_tens = new String[]{ "hundred", "thousand"};
        if(size == 1) 
        {
            System.out.println(singleDigits[num[0]-'0']);
            return;
        }
        int idx = 0;
        while (idx < num.length) 
        { 
            if(size >= 3) 
            {
                if(num[idx]-'0' != 0) 
                {
                    System.out.print(singleDigits[num[idx]-'0']+" ");
                    System.out.print(power_of_tens[size-3]+" ");        
                }
                size--;
            }
            else 
            {
                if(num[idx]-'0'==1) 
                {
                    int sum = num[idx]-'0' + num[idx+1]-'0';
                    System.out.println(twoDigits[sum]);                    
                    return;
                }          
                else 
                {
                    int i=(num[idx]-'0');
                    if(i>0)
                    {   
                        System.out.print(tens[i]+" ");
                    }
                    idx++;
                    if(num[idx]-'0'!= 0)
                    {
                        System.out.println(singleDigits[num[idx]-'0']);
                    }     
                }
            }
            idx++;
        }
    }
    public static void main(String[] args)
    {
        int num=125;
        String n = Integer.toString(num);
        wordConvert(n.toCharArray());
    }
}