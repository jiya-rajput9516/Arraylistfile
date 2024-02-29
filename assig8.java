//2)sum of even and odd elements.
import java.util.ArrayList;
import java.util.Scanner;
public class assig8{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the size of array: ");
    int n=sc.nextInt();

      ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
    int sumE=0,sumO=0;

    for(int i=0;i<n;i++){
      if(arrayList.get(i)%2==0){
        sumE=sumE+arrayList.get(i);
      }
      else{
        sumO=sumO+arrayList.get(i);
      }
      System.out.print(arrayList.get(i) );
    }System.out.println("\nsum of even elements of array "+(sumE)+"\nodd elements of array : "+(sumO));
  }
}
