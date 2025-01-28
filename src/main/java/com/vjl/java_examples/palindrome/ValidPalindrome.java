package com.vjl.java_examples.palindrome;

public class ValidPalindrome {
  public boolean isPalindrome(String input) {
    int start = 0;
    int end = input.length()-1;
    while(start<end){
      if(input.charAt(start) == input.charAt(end)){
        start++;
        end--;
      } else{
        return false;
      }
    }
    return true;
  }

  /* option: using a string builder add all the letter or character and then use
  builtin reverse method.
   */
  public boolean isPalindromeCompareCharAndDigit(String input) {
    int start = 0;
    int end = input.length()-1;
    while (start<end){
      while(!Character.isLetterOrDigit(input.charAt(start)))
        start++;
      while(!Character.isLetterOrDigit(input.charAt(end)))
        end--;
      if(Character.toLowerCase(input.charAt(start)) == Character.toLowerCase(input.charAt(end))){
        start++;
        end--;
      }else{
        return false;
      }
    }
    return true;
  }

  public boolean isPalindromeCompareCharAndDigitWithSkips(String input, int maxCharSkip) {

    return true;
  }

}
