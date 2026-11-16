class Solution {
    public int hammingWeight(int n) {
        int bits = 0;
        String binaryString = Integer.toBinaryString(n);

        //System.out.println(i + ": " + binaryString);

        char[] characterArray = binaryString.toCharArray();

        for (char c : characterArray)
        {
            if (c == '1')
                bits++;
        }

        return bits;
    }
}
