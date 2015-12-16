package com.interview.ds;

/** Given a string s1 and a string s2.
 *  Write a snippet to say whether s2 is a rotation of s1 using only one call to strstr routine?
 * (Eg : Given s1 = ABCD and s2 = CDAB, return true)
 * (given s1 = ABCD, and s2 = ACBD , return false)
 * */
public class StringRotationPuz {

	public static void main(String[] args) throws java.lang.Exception {
		String s1 = "ABCD";
		String s2 = "CDAB";
		
		String s = strStr(s1.concat(s1), s2);
		System.out.println("String Rotations : " + s);
		// strstr(strcat(strrev(str1),strrev(str1)), str2)
		String rev = strRev(s1); 
		System.out.println("String rev : " + rev);
		String revCon = rev.concat(rev);
		System.out.println("String revCon : " + revCon);
		s = "";
		System.out.println("String Rotations : " + s2);
		s = strStr(revCon,s2);
		
		System.out.println("String Rotations : " + s);
	}

	/**
	 *  Implement strstr() of C language in Java
	 */
	public static String strStr(String haystack, String needle) {
		int needleLen = needle.length();
		int haystackLen = haystack.length();
		
		if (needleLen == haystackLen && needleLen == 0) {
			return "";
		}
		if (haystackLen == 0 || needleLen == 0) {
			return null;
		}

		for (int i = 0; i < haystackLen; i++) {
			// make sure in boundary of needle
			if (haystackLen - i + 1 < needleLen) {
				return null;
			} else {
				// nothing
			}
			int k = i;
			int j = 0;
			while (j < needleLen && k < haystackLen && needle.charAt(j) == haystack.charAt(k)) {
				j++;
				k++;
				if (j == needleLen) {
					return haystack.substring(i);
				} else {
					// nothing
				}
			}
		}
		return null;
	}
	
	/** Reverse a given String in Java without StringBuffer// StringBuffer s = new StringBuffer("Java"); s.reverse(); 
	 * 
	 */
	public static String strRev(String originalString){
		int length = originalString.length();
		if (length <= 0) {
			return "";
		}
		String reverse = ""; 
	      for ( int i = length - 1 ; i >= 0 ; i-- ){
	         reverse = reverse + originalString.charAt(i);
	      }
	      System.out.println("Reverse of "+originalString+" is :"+reverse);
		return reverse;
	}

}
