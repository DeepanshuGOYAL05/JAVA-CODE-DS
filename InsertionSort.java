import java.util.Scanner;

public class InsertionSort {
    private int arr[];
    private int size;

    InsertionSort(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void insertionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        InsertionSort is = new InsertionSort(n);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sn.nextInt();

        System.out.println("Before Sorting");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        System.out.println("After Sorting");
        is.insertionSort(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }
}

























