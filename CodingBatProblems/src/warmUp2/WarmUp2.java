package warmUp2;

public class WarmUp2 {

	// Question 1

	/*
	 * Given a string and a non-negative int n, return a larger string that is n
	 * copies of the original string.
	 */

	public String stringTimes(String str, int n) {
		String resultString = "";
		for (int i = 0; i < n; i++) {
			resultString += str;
		}
		return resultString;
	}

	// Question 2

	/*
	 * Given a string and a non-negative int n, we'll say that the front of the
	 * string is the first 3 chars, or whatever is there if the string is less than
	 * length 3. Return n copies of the front;
	 */

	public String frontTimes(String str, int n) {
		String resultString = "";
		if (str.length() < 3) {
			for (int i = 0; i < n; i++) {
				resultString = resultString + str;
			}
		} else {
			String firstThreeCharString = str.substring(0, 3);
			for (int i = 0; i < n; i++) {
				resultString += firstThreeCharString;
			}
		}
		return resultString;
	}

	// Question 3

	/*
	 * Count the number of "xx" in the given string. We'll say that overlapping is
	 * allowed, so "xxx" contains 2 "xx"
	 */

	int countXX(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("xx"))
				count++;
		}
		return count;
	}

	// Question 4

	/*
	 * Given a string, return true if the first instance of "x" in the string is
	 * immediately followed by another "x".
	 */

	boolean doubleX(String str) {
		int i = str.indexOf("x");
		if (i == -1)
			return false; // no "x" at all

		// Is char at i+1 also an "x"?
		if (i + 1 >= str.length())
			return false; // check i+1 in bounds?
		return str.substring(i + 1, i + 2).equals("x");
	}

	// Question 5

	/*
	 * Given a string, return a new string made of every other char starting with
	 * the first, so "Hello" yields "Hlo".
	 */

	public String stringBits(String str) {
		String modString = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				modString += str.charAt(i);
			}
		}
		return modString;
	}

	// Question 6

	/*
	 * Given a non-empty string like "Code" return a string like "CCoCodCode".
	 */

	public String stringSplosion(String str) {
		String modString = "";
		if (str.length() == 1) {
			return str;
		}
		if (str.length() == 2) {
			return str.charAt(0) + str;
		} else {
			for (int i = 0; i < str.length(); i++) {
				modString += str.substring(0, i);
			}
			modString += str;
		}
		return modString;
	}

	// Question 7

	/*
	 * Given a string, return the count of the number of times that a substring
	 * length 2 appears in the string and also as the last 2 chars of the string, so
	 * "hixxxhi" yields 1 (we won't count the end substring).
	 */

	public int last2(String str) {
		// Screen out too-short string case.
		if (str.length() < 2)
			return 0;
		String end = str.substring(str.length() - 2);
		// Note: substring() with 1 value goes through the end of the string
		int count = 0;
		// Check each substring length 2 starting at i
		for (int i = 0; i < str.length() - 2; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals(end)) { // Use .equals() with strings
				count++;
			}
		}
		return count;
	}

	// Question 8

	/*
	 * Given an array of ints, return the number of 9's in the array.
	 */

	public int arrayCount9(int[] nums) {
		int numOf9 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				numOf9++;
			}
		}
		return numOf9;
	}

	// Question 9

	/*
	 * Given an array of ints, return true if one of the first 4 elements in the
	 * array is a 9. The array length may be less than 4.
	 */

	public boolean arrayFront9(int[] nums) {
		if (nums.length <= 3) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 9) {
					return true;
				}
			}
		} else if (nums.length > 3) {
			for (int i = 0; i < 3; i++) {
				if (nums[i] == 9) {
					return true;
				}
			}
		}
		return false;
	}

	// Question 10

	/*
	 * Given an array of ints, return true if the sequence of numbers 1, 2, 3
	 * appears in the array somewhere.
	 */

	public boolean array123(int[] nums) {
		if (nums.length < 3) {
			return false;
		}
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
				return true;
			}
		}
		return false;
	}

	// Question 11

	/*
	 * Given 2 strings, a and b, return the number of the positions where they
	 * contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3,
	 * since the "xx", "aa", and "az" substrings appear in the same place in both
	 * strings.
	 */

	public int stringMatch(String a, String b) {
		int numberOfMatches = 0;
		int totalIndexesNeeded;
		if (a.length() > b.length()) {
			totalIndexesNeeded = b.length();
		} else {
			totalIndexesNeeded = a.length();
		}
		for (int i = 0; i < totalIndexesNeeded - 1; i++) {
			if (b.substring(i, i + 2).equals(a.substring(i, i + 2))) {
				numberOfMatches++;
			}
		}
		return numberOfMatches;
	}
	
	// Question 12

	/*
	 * Given a string, return a version where all the "x" have been removed. Except an "x" at the
	 * very start or end should not be removed.
	 */

	public String stringX(String str) {
		String removedXString = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x' && i != 0 && i != str.length() - 1) {
				
			} else {
				removedXString += str.charAt(i);
			}
		}
		return removedXString;
	}
	
	// Question 13

	/*
	 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens"
	 * yields "kien".
	 */
	
	public String altPairs(String str) {
		String modString = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 4 == 0 || i % 4 == 1 ) {
				modString += str.charAt(i);
			}
		}
		return modString;
	}
	
	// Question 14

	/*
	 * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak"
	 * are removed, but the "a" can be any char. The "yak" strings will not overlap.
	 */
	
	public String stringYak(String str) {
		String modString = "";
		if (str.length() < 3) {
			return str;
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (i+ 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
					i += 2;
				} else {
					modString += str.charAt(i);
				}
			}
		}
		return modString;
	}
	
	// Question 15

	/*
	 * Given an array of ints, return the number of times that two 6's are next to each other in
	 * the array. Also count instances where the second "6" is actually a 7.
	 */
	
	public int array667(int[] nums) {
		int numberOf667 = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)) {
				numberOf667++;
			}
		}
		return numberOf667;
	}

	// Question 16

	/*
	 * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the
	 * array. Return true if the array does not contain any triples.
	 */
	
	public boolean noTriples(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == nums[i + 1] && nums[i + 1] == nums [i + 2]) {
				return false;
			}
		}
		return true;
	}
	
	// Question 17

	/*
	 * GiGiven an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the
	 * value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1"
	 * differs by 2 or less from the correct value.
	 */
	
	public boolean has271(int[] nums) {
		  // Iterate < length-2, so can use i+1 and i+2 in the loop.
		  // Return true immediately when seeing 271.
		  for (int i=0; i < (nums.length-2); i++) {
		    int val = nums[i];
		    if (nums[i+1] == (val+5) &&              // the "7" check
		      Math.abs(nums[i+2] - (val-1)) <= 2) {  // the "1" check
		        return true;
		    }
		  }
		  
		  // If we get here ... none found.
		  return false;
		}
	
	
	
}
	

