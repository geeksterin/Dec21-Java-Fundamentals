package Day1;
public class Extractingdigits01
{   
    public static void main(String args[]) 
    {   
        int number = -72345006;
        int firstDigit = 0;
        int lastDigit = 0;
        
      //Checking for zero or neg numbers.
        if(number<=0) {
        	number = -1*number;
        }
 
        lastDigit = number%10;
        System.out.println("Last digit: "+lastDigit);
 
        while(number!=0) {
            firstDigit = number%10;
            number = number/10;
        }
        System.out.println("First digit: "+firstDigit);
    }
}

