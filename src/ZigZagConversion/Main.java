package ZigZagConversion;
//Input
// string: PAYPALISHIRING numRows: 3

//P   A   H   N
//A P L S I I G
//Y   I   R
//

//Output
//PAHNAPLSIIGYIR

public class Main {

    public String zigZagConversion (String s, int numRows) {
        StringBuilder[] res = new StringBuilder[numRows];
        for (int i = 0; i < res.length; i ++) {
            res[i] = new StringBuilder();
        }

        char[] arr = s.toCharArray();
        int len = arr.length;
        int i = 0;

        while (i < len) {
            for (int j = 0; j < numRows && i < len; j++) {
                res[j].append(arr[i++]);
            }
            for (int k = numRows - 2; k >= 1 && i < len; k-- ) {
                res[k].append(arr[i++]);
            }
        }

        for (int j = 1; j < res.length; j++) {
            res[0].append((res[j]));
        }


        return res[0].toString();
    }


    public static void main (String[] args) {
        System.out.print(new Main().zigZagConversion("PAYPALISHIRING", 3));
    }

}
