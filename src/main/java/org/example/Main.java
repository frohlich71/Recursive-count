package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 2, 4, 6, 2));

        System.out.println(solution.recursiveCount(nums, 0));
    }
}

class Solution {
    public int recursiveCount (ArrayList<Integer> nums, int count) {

        if (nums.size() == 1) {
            return 1;
        } else {
            nums.remove(nums.size() - 1);
            count =  recursiveCount(nums, count) + 1;
            return count;
        }

    }
}