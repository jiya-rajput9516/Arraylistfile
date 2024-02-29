//8)rotate the arrayList by one

import java.util.Scanner;
import java.util.ArrayList;

public  class assig13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array ");
        int n=sc.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>(n);
        ArrayList<Integer>rotate=new ArrayList<>(n);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
        int k=1,j=0;//rotated 1 time
        System.out.println("\nrotated array .... ");
        for(int i=n-k;i<n;i++){
          rotate.add(arrayList.get(i));
        }
        for(int i=0;i<n-k;i++){
          rotate.add(arrayList.get(i));
        }
        for(int i=0;i<n;i++){
          System.out.print(rotate.get(i)+"  ");
        }
      }
    }
    

