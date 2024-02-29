//11)remove the duplicate elements.

import java.util.ArrayList;
import java.util.Scanner;

public class assig15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the Size of Array");
        int n = sc.nextInt();
        int j=0;
        ArrayList<Integer> arrayList = new ArrayList<>(n);
        System.out.println("Enetr the array element of array");
        for (int i = 0; i < n; i++){
            arrayList.add(sc.nextInt());
    }
        for(int i=0;i<n;i++){
            System.out.println(arrayList.get(i)+" ");
        }
       System.out.println("Duplicate array element delete::");
      for(int i=0;i<n;i++){
        for( j=0;j<i;j++){
            if(arrayList.get(i)==arrayList.get(j))
                break;
            }
          if(i==j)
            System.out.print(arrayList.get(i)+"");
          }
        }
      }


