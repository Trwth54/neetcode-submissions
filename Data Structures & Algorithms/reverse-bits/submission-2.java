class Solution {
    public int reverseBits(int n) {
        int targetLength = 32;
        
        // original string
        String binaryString = Integer.toBinaryString(n);

        //System.out.println(i + ": " + binaryString);

        // string with leading zeros
        String extendedString = String.format("%32s", binaryString).replace(' ', '0');

        // reversed string
        String reversed = new StringBuilder(extendedString).reverse().toString();

        System.out.println(reversed);

        // return resulting int
        return Integer.parseUnsignedInt(reversed, 2);
    }
}
