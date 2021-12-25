package Day1;

public class CheckAngles {
	public static void main(String[] args) {
		int a = 14;
		int b = 29; // explicit
		int c = 0; // garbage value in assigned if not declared

		if (a <= 0 || b <= 0 || c <= 0 || (a + b + c) != 180) {
			System.out.println("Not valid angles of a triangle :(");
		} else
			System.out.println("Volla.. :)");
	}
}
