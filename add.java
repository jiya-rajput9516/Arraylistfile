import java.lang.reflect.Array;
import java.util.ArrayList;

class Addition<T extends Number>{
    private T a;
    private T b;
    public Addition(T a, T b){
        this.a=a;
        this.b=b;
    }
     public void add(){
        System.out.println(" Addition:"+(a.intValue()+b.intValue()));
     }
      public void add(T obj){}
  }
  class Test{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList(10);
        al.add(2,3);
    }
  }