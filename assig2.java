import java.util.ArrayList;
import java.util.Scanner;

class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (arrayList.get(j) > arrayList.get(j + 1)) {
                    // Swap the elements
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted array:");
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
    }
}