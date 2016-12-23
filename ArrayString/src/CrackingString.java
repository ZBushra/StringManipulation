import java.util.InputMismatchException;
import java.util.Scanner;
public class CrackingString {

	//reverse a string without using String Api
	String toManipulateStr = "bfdkeac ";
	String palindrome = "ABA";
	
	public void ReverseString()
	{
		//String reverseStr= "";
		StringBuilder reverseStr = new StringBuilder();
		for(int index = toManipulateStr.length() -1; index>=0; index-- )
		{
			//reverseStr = reverseStr + toManipulateStr.charAt(index);
			reverseStr.append(toManipulateStr.charAt(index));
		}		
		System.out.println("regular string: "+toManipulateStr+"\n"+"reverse string: "+ reverseStr);
	}
	//sorting without string api
	public void SortingString()
	{
		//int l = 0 ;
		char temp = 0;
		char[] chars = toManipulateStr.toCharArray();
		for(int i = 0; i < chars.length; i++ )
		{
			for(int j = 0; j < chars.length; j++)
			{
				if(chars[j] > chars[i])
				{
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
					
				}
			}
		}
		StringBuilder sortedStr = new StringBuilder();
		for(int k = 0; k < chars.length;k++)
		{
			sortedStr.append(chars[k]);
		}
		System.out.println("sorted string "+sortedStr);
	}
	//Check String is palindrome or not?
	
	public void checkPalindrome()
	{
		//do reverse string
		
		String reverseStr ="";
		
		for(int i = palindrome.length() - 1; i >= 0; i-- )
		{
			reverseStr = reverseStr + palindrome.charAt(i);
		}
		if(reverseStr.equalsIgnoreCase(palindrome))
		{
			System.out.println(palindrome +" is a palindrome");
		}else
		{
			System.out.println(palindrome +" is not a palindrome");
		}
	}
	
	//Program to Check given number is palindrome or not?
	
	public void checkNumberPalindrome()
	{
		System.out.println("Enter a number: ");
		@SuppressWarnings("resource")
		int givenNumber = new Scanner(System.in).nextInt();
		try
		{
			int number = givenNumber;
			
			int reverse = 0;
			while(number != 0)
			{
				int remainder = number % 10;
				reverse = reverse * 10 + remainder;
				 number = number / 10;
	        }           
			if(givenNumber == reverse)
		   System.out.println("Result:Palindrome");
		    else
		    System.out.println("Result:Not Palindrome");
		}catch(InputMismatchException exception)
		{
			//Print "This is not an integer"
			  //when user put other than integer
			  System.out.println("This is not an integer " );
		}
    }
	
	//You have a string aaabbdcccccf, transform it the following way => a3b2d1c5f1 
	//ie: aabbaa -> a2b2a2 not a4b2
	
	public void TransformString(String input)
	{
		//char[] inputArr = new char[input.length()];
		char[]inputArr = input.toCharArray();
		String transformed = "";
		int count = 1;
		int i = 1;
		
		for(int j = 0; j < input.length();j++)
		{
			if(i < input.length()&& inputArr[i] == inputArr[i-1])
			{
				
				count++;
			}else
			{
				transformed =transformed + inputArr[i-1] + count;
				count = 1; //reset
			}
			i++;
		}
		System.out.println("Transformed string: "+ transformed );
	}
	//generate all permutation a given string ~ recursive way
	public void GeneratePermutation(String input)
	{
		permutation("",input);
	}
	public void permutation(String ans, String remain){
		
		int n = remain.length();
		if(n == 0) //base
		{
			System.out.println(ans);
		}else{ //recursive
			for(int i = 0; i < n; i++)
			{
				permutation(ans + remain.charAt(i), remain.substring(0, i)+remain.substring(i+1,n));
			}
		}
	}
	//Substrings of a given String: check if a two strings are substrings of each other.
	
	public void SubstringSearch(String input )
	{
		if(input.indexOf("today")!= -1)
		{
			System.out.printf("Yes '%s' contains word 'today' %n" , input);
	       }else{
	           System.out.printf("Sorry %s does not contains word 'today' %n " , input);
	       }
		if(input.contains("Hello")){
	           System.err.printf("Great '%s' contains word 'Hello' %n" , input);
	       }else{
	           System.err.printf("Sorry %s does not contains word 'Hello' %n" , input);
	       }
	}
	//recursion
	public void CheckSubstring(String sub, String main)
	{
		boolean found = false;
		int max = main.length() - sub.length();
	checkrecursion:	for(int i = 0; i <=max;i++)
		{
			int n = sub.length();
			int j =i;
			int k = 0;
			while(n-- !=0)
			{
				if(main.charAt(j++)!=sub.charAt(k++))
				{
					continue checkrecursion;
				}
			}
			found = true;
			break checkrecursion;
		}
	}
}
