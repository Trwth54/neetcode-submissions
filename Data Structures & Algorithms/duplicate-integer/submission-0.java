class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int j = 0; j < nums.length; j++)
        {
            int selected = nums[j];

            for (int i = 0; i < nums.length; i++)
            {
                if (selected == nums[i] && i != j)
                    // if selected item is same and NOT the same index
                    return true;
            }
        }

        return false;
    }
}