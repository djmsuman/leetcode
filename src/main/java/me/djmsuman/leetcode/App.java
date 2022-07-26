package me.djmsuman.leetcode;

public class App {
  public static void main(String[] args) {
    solution1();
    solution13();
  }

  private static void solution1() {
    int[] nums = { 2, 7, 11, 15, 2, 32 };
    int target = 13;
    me.djmsuman.leetcode._1.Solution solution = new me.djmsuman.leetcode._1.Solution();

    int[] output = solution.twoSum(nums, target);

    System.out.print("1. [");
    for (int i = 0; i < output.length; i++) {
      System.out.print(output[i]);

      if (i == output.length - 1) {
        System.out.println("]");
      } else {
        System.out.print(", ");
      }
    }
  }

  private static void solution13() {
    String s = "MCMXCIV";
    me.djmsuman.leetcode._13.Solution solution = new me.djmsuman.leetcode._13.Solution();

    int output = solution.romanToInt(s);
    System.out.println("13. " + output);
  }
}
