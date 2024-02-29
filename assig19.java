
import java.util.ArrayList;
import java.util.Scanner;
public class assig19 {
     public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the first size of array::");
        int n = sc.nextInt();
      int last, i=0;
      System.out.print("The original array is: ");
      ArrayList<Integer> arrayList = new ArrayList<>(n);
      while(i<n){
      for (i = 0; i < n; ++i)
      System.out.print(arrayList.get(i) + " ");
      last = arr[n-1];
      for (i = n-1; i > 0; i--)
      arr[i] = arr[i-1];
      arr[0] = last;
      System.out.print("The rotated Array is: ");
      for (i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
   }
}
}
