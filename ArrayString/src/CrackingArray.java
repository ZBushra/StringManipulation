
public class CrackingArray {

	public static String input = "abc";	
	static String toFindStr = "Hello World today! ";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrackingString obj1 = new CrackingString();
		obj1.SubstringSearch(toFindStr);
		obj1.ReverseString();
		obj1.SortingString();
		obj1.checkPalindrome();
		obj1.TransformString(input);
		obj1.GeneratePermutation(input);
		obj1.checkNumberPalindrome();
	}

}
