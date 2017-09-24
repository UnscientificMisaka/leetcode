package RomanToInteger;

public class Main {

    public int romainToInteger (String s) {
        int res = 0;
        char[] arr = s.toCharArray();
        int len = arr.length;
        int nums[] = new int[len];
        for (int i = 0; i < len; i++) {
            switch (s.charAt(i)) {
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }
        for (int i = 0;i < len-1; i++) {
            if (nums[i] < nums[i+1]) {
                res-=nums[i];
            } else {
                res+=nums[i];
            }
        }
        return res;
    }

    public static void main (String[] args) {
        System.out.println(new Main().romainToInteger("MCMXVI"));
    }
}