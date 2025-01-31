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
  void isPalindromeCompareCharAndDigitWithOneSkip(){
    assertThat(i.isPalindromeCompareCharAndDigitWithOneSkip("A man, a plan, a canal: Panama")).isTrue();
    assertThat(i.isPalindromeCompareCharAndDigitWithOneSkip("aba")).isTrue();
    assertThat(i.isPalindromeCompareCharAndDigitWithOneSkip("A a")).isTrue();
    assertThat(i.isPalindromeCompareCharAndDigitWithOneSkip("")).isTrue();
    assertThat(i.isPalindromeCompareCharAndDigitWithOneSkip(" ")).isTrue();
    assertThat(i.isPalindromeCompareCharAndDigitWithOneSkip("abca")).isTrue();
    assertThat(i.isPalindromeCompareCharAndDigitWithOneSkip("abc")).isFalse();
  }

}