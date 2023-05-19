package LeetCode;

public class dfa {
    static int twoSum(int[] nums, int target) {
        // kailangan ma achieve yung targer sa pamamagitan ng sum

        int achieve = target;


        int sum = 0;
        // int 2 + 7 = 9
        for (int i = 0; i < nums.length; i++){

            sum += nums[i];


        }




       return 0;

    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        twoSum(nums, target);
    }
}
