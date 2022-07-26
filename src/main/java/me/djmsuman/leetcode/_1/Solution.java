package me.djmsuman.leetcode._1;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] indices = new int[] {};

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          indices = new int[] { i, j };
          break;
        }
      }
    }

    return indices;
  }
}
