class Solution {
    public int romanToInt(String s) {
        int pre = 0;
        int result = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            int val = getval(s.charAt(i));
            if (pre > val) {
                result -= val;
            }else{
                 result += val;
            }
           
            pre = val;
        }
        return result;
    }

    public int getval(char c) {
        switch (c) {
            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;

            default:
                return 0;
        }
    }
}