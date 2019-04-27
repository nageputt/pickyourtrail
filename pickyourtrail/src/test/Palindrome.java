package test;

import java.util.Scanner;

/**
 * palindrome class is used to determine the number of its substrings that are palindromes in a given input.
 * @author Nagendra Babu Puttigamapala
 *
 */
public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		int subStringCount = inputString.length();
		for (int outerLoop = 0; outerLoop < inputString.length(); outerLoop++) {
			for (int innerLoop = outerLoop+1; innerLoop < inputString.length(); innerLoop++) {
				if(inputString.charAt(outerLoop) == inputString.charAt(innerLoop)) {
					subStringCount += palindromeChecker(outerLoop,innerLoop,inputString);
				}
			}
		}
		System.out.println(subStringCount);
	}
	
/**
 * palindromeChecker method check the data is palindrome or not.
 * 
 * @param start
 * @param end
 * @param inputString
 * @return int
 */
	private static int palindromeChecker(int start, int end, String inputString) {
		for (int i = start, j = end; i < j; i++,j--) {
			if(inputString.charAt(i)!=inputString.charAt(j)) {
				return 0;
			}
		}
		return 1;
	}


}
