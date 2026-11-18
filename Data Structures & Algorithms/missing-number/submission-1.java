class Solution {
    public int missingNumber(int[] nums) 
    {
        List<Integer> allNumbers = new ArrayList<>();

        // fill arrayList with length + 1 (includes missing number too)
        for (int j = 0; j <= nums.length; j++)
        {
            allNumbers.add(j);
        }

        System.out.println(allNumbers);

        // compare numbers
        // note: only remove numbers if they are equal on both lists
        for (int i = 0; i < nums.length; i++)
        {
            for (int k = 0; k < allNumbers.size(); k++)
            {
                System.out.println("(!) Comparing " + nums[i] + " to " + allNumbers.get(k));
                
                if (nums[i] == allNumbers.get(k))
                {
                    System.out.println("Values match: " + nums[i] + " = " + allNumbers.get(k));
                    allNumbers.remove(k);
                    break;
                }
                
                else
                {
                    System.out.println("Values differ (SKIP): " + nums[i] + " != " + allNumbers.get(k));
                }
            }
        }

        return allNumbers.get(0);
    }
}
