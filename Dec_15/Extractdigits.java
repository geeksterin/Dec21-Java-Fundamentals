package Day1;

public class Extractdigits {

	public static void main(String[] args) {
		int num = 235236;
		
		int digitCount = (int)Math.log10(num);
		
		int first = num / (int)Math.pow(10, digitCount);
		System.out.println(first);
		
		

	}

}
