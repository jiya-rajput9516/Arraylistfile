//3)search in element in array:linear, binary
//Linear search
import java.util.ArrayList;
import java.util.Scanner;
public class assig7{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the size of array: ");
    int n=sc.nextInt();

     ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }

    int index=-1;
    System.out.print("search element: ");
    int search=sc.nextInt();
    
    for(int i=0;i<n;i++){
      if(search==arrayList.get(i)){
        index=i;
        break;
      }
    }
    if(index==-1)
      System.out.println("\nElement not found");
    else
      System.out.println("\nElement found at index: "+index);
  }
}
