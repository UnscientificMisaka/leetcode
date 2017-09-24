package IntegerToRoman;

public class Main {

    public char toRomain (int x) {
        switch (x) {
            case 1: return 'I';
            case 5: return 'V';
            case 10: return 'X';
            case 50: return 'L';
            case 100: return 'C';
            case 500: return 'D';
            case 1000: return 'M';
        }
        return ' ';
    }


    public static  void main (String[] args) {
        System.out.println(new Main().toRomain(100));
    }

}
