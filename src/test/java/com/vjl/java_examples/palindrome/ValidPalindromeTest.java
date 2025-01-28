package com.vjl.java_examples.palindrome;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

  ValidPalindrome i = new ValidPalindrome();

  @Test
  void isPalindrome() {
    assertThat(i.isPalindrome("aba")).isTrue();
    assertThat(i.isPalindrome("")).isTrue();
    assertThat(i.isPalindrome(" ")).isTrue();
    assertThat(i.isPalindrome("abccba")).isTrue();

  }

  @Test
  void isPalindromeCompareCharAndDigit(){
    assertThat(i.isPalindromeCompareCharAndDigit("A man, a plan, a canal: Panama")).isTrue();
    assertThat(i.isPalindromeCompareCharAndDigit("A a")).isTrue();
    assertThat(i.isPalindrome("")).isTrue();
    assertThat(i.isPalindrome(" ")).isTrue();
  }

  @Test
  void iisPalindromeCompareCharAndDigitWithSkips(){
    assertThat(i.isPalindromeCompareCharAndDigitWithSkips("A man, a plan, a canal: Panama", 0)).isTrue();
//    assertThat(i.isPalindromeCompareCharAndDigitWithSkips("A a")).isTrue();
//    assertThat(i.isPalindromeCompareCharAndDigitWithSkips("")).isTrue();
//    assertThat(i.isPalindromeCompareCharAndDigitWithSkips(" ")).isTrue();
  }

}