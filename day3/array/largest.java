package Bridgelabz.day3.array;

public class largest {
    public static void main(String[] args) {
        int [] arr={4,5,77,44,56,23,55};
        int max=arr[0];
        for (int i :arr ) {
            if (i>max){
                max=i;
            }
        }
        System.out.println("largest element is " + max);
    }

}
