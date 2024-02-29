//4B)sort the array:linear,bubble
//Linear-Decrising order
import java.util.ArrayList;
import java.util.Scanner;
public class assig5{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the size of array: ");
    int n=sc.nextInt();

       ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
    
    }
    System.out.println("\nsort the array in decreasing order: ");
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arrayList.get(i)<arrayList.get(j)){
          arrayList.set(i,(arrayList.get(i)+arrayList.get(j)));
          arrayList.set(j,(arrayList.get(i)-arrayList.get(j)));
          arrayList.set(i,(arrayList.get(i)-arrayList.get(j)));
         
        }
      }
      System.out.print(arrayList.get(i)+" ");
    }
  }
}
