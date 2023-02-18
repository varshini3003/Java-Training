public class Question3 {
    public static void main(String[] args)
	{
		/*
		  Possible initialization
		 */
		int in1=22344_34_23;
		float fl1=4.4_4_2f, f2=-2.1_887f;
		char ch1=654, ch2='[';
		byte b1='d';
		double d1=43.1_3_2_7;
		/*
         * Implicit and explicit typecasting
         */
        int i = 30;
        long l = i;
        float f = l;
        /*
        Impossible type cnversion
        char ch = 'a';
        int num = 45;
        ch = num;
        */

        /*
         * Explicit typecasting
         */
        double d = 67.89;
        long l = (long)d;
        int i = (int)l;
        byte b;
        b = (byte)i;
        b = (byte)d;
	}
}
