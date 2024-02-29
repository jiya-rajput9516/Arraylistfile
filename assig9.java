//1)wap sum of array element.
import java.util.ArrayList;
import java.util.Scanner;
public class assig9{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the size of array: ");
    int n=sc.nextInt();
     ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
    int sum=0;
   
    for(int i=0;i<n;i++){
      System.out.print(arrayList.get(i)+" ");
      sum=sum+arrayList.get(i);
    }System.out.println("\nthe sum of array element is: "+sum);
  }
}
