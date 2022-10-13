import java.util.Scanner;

public class BubbleSort {
    private int arr[];
    private int size;

    BubbleSort(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        BubbleSort bs = new BubbleSort(n);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sn.nextInt();
        sn.close();

        System.out.println("Before Sorting");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        System.out.println("After Sorting");
        bs.bubbleSort(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
