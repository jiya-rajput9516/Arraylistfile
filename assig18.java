import java.util.Scanner;
import java.util.ArrayList;

public class assig18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the first size of array::");
        int n = sc.nextInt();
        System.out.println("Enter the second size of array::");
        int m = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>(n);

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
        ArrayList<Integer> arrayList1 = new ArrayList<>(m);

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < m; i++) {
            arrayList1.add(sc.nextInt());
        }

        
            for (int i = 0; i <n; i++) {
                for (int j = 0; j < m; j++) {
    
                        if (arrayList.get(i) == arrayList1.get(j)) {
                            System.out.println("Common Element::" +arrayList.get(i));
    
                            break;
                        }
    
                
        }
                  
//System.out.println("rnfjrhfg"+arrayList.get(i));
    }
  

}
}