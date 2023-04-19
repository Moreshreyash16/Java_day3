package Bridgelabz.day3.array;

public class smallest {
    public static void main(String[] args) {
        int [] arr={4,5,77,44,56,23,55};
        int min=arr[0];
        for (int i :arr ) {
            if (i<min){
                min=i;
            }
        }
        System.out.println("smallest element is " + min);
    }
}
