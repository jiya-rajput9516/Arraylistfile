//Suppose a one-dimensional array AR containing integers is arranged in ascending order. 
//Write a java program to search for an integer from AR with the help of Binary search method, 
import java.util.ArrayList;
import java.util.Scanner;
 
public class assig17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the Size of Array");
        int n = sc.nextInt();
         ArrayList<Integer> arrayList = new ArrayList<>(n);
         System.out.println("Enetr the array element of array");
         for (int i = 0; i < n; i++){
             arrayList.add(sc.nextInt());
     }
         for(int i=0;i<n;i++){
             System.out.println(arrayList.get(i)+" ");
 
         }

          System.out.println("Enter the element to be search");
        int x = sc.nextInt();
        int low = 0, mid, high = n - 1;
        boolean flag = false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == arrayList.get(mid)) {
                flag = true;
                break;
            } else if (x > arrayList.get(mid))
                low = mid + 1;
            else
                high = mid - 1;

        }
        if (flag)
            System.out.println("Element found ");
        else
            System.out.println("Element not found ");

    }
}
    








