class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] key = new int[2]; // brackets initialize array size

        for (int i = 0; i < nums.length; i++)
        {

            for (int j = 0; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target && i != j)
                {
                    key[0] = i;
                    key[1] = j;
                    return key;
                }
            }
        }

        return null;

    }
}
