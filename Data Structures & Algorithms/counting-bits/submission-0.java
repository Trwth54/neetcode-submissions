class Solution {
    public static int[] countBits(int n) {
        
        int[] bitsArray = new int[n + 1];
        
        for (int i = 0; i < bitsArray.length; i++)
        {
            int bits = 0;
            String binaryString = Integer.toBinaryString(i);

            //System.out.println(i + ": " + binaryString);

            char[] characterArray = binaryString.toCharArray();

            for (char c : characterArray)
            {
                if (c == '1')
                    bits++;
            }

            bitsArray[i] = bits;
        }

        return bitsArray;
    }
}
