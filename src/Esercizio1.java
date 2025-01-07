import java.util.Arrays;

public class Esercizio1 {
    public static void main(String[] args) {
        int x = 25;
        int y = 10;
        String s = "Il numero è: ";
        String[] arr = {"s1", "s2", "s3", "s4", "s5"};
        System.out.println(moltiplica(x, y));
        System.out.println(concatena(s, y));
        System.out.println(Arrays.toString(inserisciInArray(arr, s)));

    }

    public static int moltiplica(int n1, int n2){
        return n1 * n2;
    }



    public static String concatena(String s, int n){
        return s + n;
    }

    public static String[] inserisciInArray(String[] arr, String s){
        String[] newArr = new String[arr.length + 1];
        for (int i = 0; i < newArr.length; i++){
            if(i < 2){
                newArr[i] = arr[i];
            } else if (i == 2) {
                newArr[i] = s;
            }
            else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }


}