//6)delete the element from array
import java.util.ArrayList;
import java.util.Scanner;
public class assig11{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the size of array: ");
    
    int n=sc.nextInt();
     ArrayList<Integer> arrayList = new ArrayList<>(n);

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
     System.out.println("\ndelete the element: ");
    int del=sc.nextInt();
    for(int i=0,j=0;i<n;i++){
      if(del==arrayList.get(i)&&(j!=(n-1))){
        j=i+1;
        arrayList.set(i,arrayList.get(j++));
        n--;
      }
      else if((arrayList.get(i)==del)&&(j==(n-1)))
        break;
      else
        arrayList.set(i,arrayList.get(j++));
      System.out.print(arrayList.get(i)+"  ");
    }
  }
}

