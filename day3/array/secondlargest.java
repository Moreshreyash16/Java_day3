package Bridgelabz.day3.array;

public class secondlargest {
    public static void main(String[] args) {
    int []  arr = new int[] {50,40,56,32,20};
    int   a = arr[0];
    int   secondmax = 0;

        for (int i:arr) {
            if( i > a) {
                secondmax = a;
                a = i;
            } else if (i > secondmax && i != a) {
                secondmax = i;
            }
        }
        System.out.println(secondmax);

    }
}
