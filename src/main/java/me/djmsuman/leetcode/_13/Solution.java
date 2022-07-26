package me.djmsuman.leetcode._13;

import java.util.HashMap;

public class Solution {
  private static HashMap<Character, Integer> symbols = new HashMap<Character, Integer>() {
    {
      put('I', 1);
      put('V', 5);
      put('X', 10);
      put('L', 50);
      put('C', 100);
      put('D', 500);
      put('M', 1000);
    }
  };

  public int romanToInt(String s) {
    int numeral = 0;

    for (int i = 0; i < s.length(); i++) {
      if (i < s.length() - 1 &&
          symbols.get(s.charAt(i)) < symbols.get(s.charAt(i + 1))) {
        numeral -= symbols.get(s.charAt(i));
      } else {
        numeral += symbols.get(s.charAt(i));
      }
    }

    return numeral;
  }
}