package Bridgelabz.day3.array;

public class frequency {
    public static void main(String[] args) {
        int [] arr={4,5,5,77,44,56,23,77,55,77,77};
        int count1=1;
        for (int i=0;i<=arr.length;i++){
            count1=1;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    count1 += 1;

                }
            }
               System.out.println("frequency of " + arr[i]+ " is " + count1);

        }
    }
}
