//5)insert elements at a specified position of array
import java.util.ArrayList;
import java.util.Scanner;
public class assig10{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the size of array: ");
    int n=sc.nextInt();

    ArrayList<Integer> arrayList = new ArrayList<>(n);
     ArrayList<Integer> arrayList1 = new ArrayList<>(n+1);

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
   
    System.out.println("\nenter the position : ");
    int p=sc.nextInt();
    System.out.print("enter the element: ");
    int elem=sc.nextInt();
    for(int i=0,j=0;i<n+1;i++){
      if((i+1)<p)
        arrayList1.add(arrayList.get(j++));
      else if((i+1)==p)
        arrayList1.add(elem);
      else
        arrayList1.add( arrayList.get(j++));
      System.out.print(arrayList1.get(i)+"  ");
    }
  }
}
