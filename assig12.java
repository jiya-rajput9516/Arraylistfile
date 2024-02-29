import java.util.Scanner;
import java.util.ArrayList;

public class assig12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the first size of array::");
        int n = sc.nextInt();
        System.out.println("Enter the second size of array::");
        int m = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>(n);

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
        ArrayList<Integer> arrayList1 = new ArrayList<>(m);

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < m; i++) {
            arrayList1.add(sc.nextInt());
        }

        ArrayList<Integer> arrayList2 = new ArrayList<>(n + m);

        System.out.println("\nmerge the arr1 and arr2");
        for (int i = 0, j = 0; i < (n+m); i++) {
            if (i < n)
                arrayList2.add( arrayList.get(i));
            else
                arrayList2.add( arrayList1.get(j++));
            System.out.print(arrayList2.get(i) + " ");
        }
    }

}
