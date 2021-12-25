
public class CheckAnagram {

	public static void main(String args[]) {
		String str1 = "arunsxy";
		String str2 = "nuarysx";

		// converting strings to char arrays, because you cannot loop over a string.
		char[] s = str1.toCharArray();
		char[] t = str2.toCharArray();

		int freq[] = new int[26];

		for (int i = 0; i < str1.length(); i++) {
			freq[s[i] - 'a']++;
		}
		for (int i = 0; i < str2.length(); i++) {
			freq[t[i] - 'a']--;
		}
		boolean flag = false;

		for (int i = 0; i < 26; i++) {
			if (freq[i] != 0) {
				System.out.println("NOT ANAGRAMS");
				flag = true;
				break;
			}
		}
		if (flag == false)
			System.out.println("ANAGRAMS");

	}
}
