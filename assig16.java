// 32. Given two arrays of integers A and B of sizes M and N respectively. Write a Write a c 
//program, which will produce a third array named C. such that the following sequence is
//followed. 
// All even numbers of A from left to right are copied into C from left to right. 
// All odd numbers of A from left to right are copied into C from right to left. 
// All even numbers of B from left to right are copied into C from left to right. 
// All old numbers of B from left to right are copied into C from right to left.
// e.g., A is {3, 2, 1, 7, 6, 3} and B is {9, 3, 5, 6, 2, 8, 10} the resultant array C is
// {2, 6, 6, 2, 8, 10, 5, 3, 9, 3, 7, 1, 3} 
 
import java.util.ArrayList;
import java.util.Scanner;
public class assig16{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the Size of Array");
        int n = sc.nextInt();
        System.out.println("Enetr the Size of Array");
        int m= sc.nextInt();
        int j=0;
        int even=0;
        int odd=0;
        ArrayList<Integer> arrayList = new ArrayList<>(n);
         ArrayList<Integer> arrayList1 = new ArrayList<>(m);
          ArrayList<Integer> c = new ArrayList<>(n+m);
        System.out.println("Enetr the array element of array");
        for (int i = 0; i < n; i++){
            arrayList.add(sc.nextInt());
    }
        for(int i=0;i<n;i++){
            System.out.println(arrayList.get(i)+" ");

        }
        
        for(int i=0;i<n;i++){
            if(arrayList.get(i)%2==0)
           c.add(arrayList.get(i));
            else
              c.add(arrayList.get(i));
        }
          for(int i=0;i<m;i++){
            if(arrayList.get(i)%2==0)
           c.add(arrayList1.get(i));
            else
              c.add(arrayList1.get(i));
        }
        for(int i=0;i<(n+m);i++){
            System.out.println("new array::"+c.get(i));
        }

    }
}