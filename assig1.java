//Q.2 Find minimum and maximum element in array
import java.util.*;
import java.util.ArrayList;
public class assig1 {
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
         ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
    
       
        // arr.add(10);
        // arr.add(20);
        // arr.add(8);
        // arr.add(32);
        // arr.add(21);
        // arr.add(31);
  
        int min = arr.get(0);
        int max = arr.get(0);
  
    
  

        for (int i = 1; i < n; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
  
        
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
  

        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);
    }
}
