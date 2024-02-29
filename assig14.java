//10)find the 2nd max and 2nd min element in arrayList

import java.util.ArrayList;
import java.util.Scanner;

public class assig14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the Size of Array");
        int n = sc.nextInt();
        int j=0;
        int max=Integer.MIN_VALUE,smax=Integer.MIN_VALUE,min=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
        ArrayList<Integer> arrayList = new ArrayList<>(n);
        System.out.println("Enetr the array element of array");
        for (int i = 0; i < n; i++){
            arrayList.add(sc.nextInt());
    }
        for(int i=0;i<n;i++){
            System.out.println(arrayList.get(i)+" ");
        }
       for(int i=0;i<n;i++){
      if(arrayList.get(i)>max){
        smax=max;
        max=arrayList.get(i);
      }
    //   else if(arrayList.get(i)>smax&&max!=arrayList.get(i)){
    //     smax=arrayList.get(i);
    //   }//-------------------------------------------------
      if(arrayList.get(i)<min){
        smin=min;
        min=arrayList.get(i);
      }
      else if(arrayList.get(i)<smin&&min!=arrayList.get(i)){
       smin=arrayList.get(i);
       }
    }System.out.println("\n2nd max: "+smax+"\n2nd min: "+smin);
  }
}
