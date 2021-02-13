import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        // YOUR CODE HERE
        ArrayList<Integer> arr = new ArrayList<>();
        arr = list;
        for(int i = 1; i < arr.size(); i++){
            int j = i;
            while(j > 0 && arr.get(j-1) > arr.get(j)){
                int tmp = arr.get(j-1);
                arr.set(j-1, arr.get(j));
                arr.set(j, tmp);
                j--;
            }
        }
        return arr;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] arr3 =  new int[arr1.length+arr2.length];
        int i = 0;
        int k = 0;
        int m = 0;
        int n = 0;
        int t = 0;
        while(i != arr1.length -1&&j!=arr2.length -1){
            if(arr1[i] <= arr2[j]){
                arr3[t] = arr1[i];
                i++;
                m++;
            }
            else{
                arr3[t] = arr2[j];
                j++;
                n++;
            }
            t++;
        }

        while(m!=arr1.length-1){
            arr3[t] = arr1[m];
            m++;
            t++;
        }

        while(n!=arr2.length-1){
            arr3[t] = arr2[n];
            n++;
            t++;
        }
        return arr3;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
