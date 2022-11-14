package org.soln.leet_code_solutions.easy;

public class PalindromeNumber {
	 public boolean isPalindrome(int x) {
	        var num =String.valueOf(x);
	        var left =0;
	        var right=num.length()-1;
	        while(left<right){
	            if(num.charAt(left)!=num.charAt(right))
	                return false;
	                left++;
	                right--;
	        }
	        return true;
	    }

}
