import java.util.ArrayList;
import java.util.Collections;
public class ArrayListIntroduction {
    public static void main(String args[]) throws NullPointerException{
        try{
            ArrayList<Integer> al=new ArrayList<Integer>();

            //insertion of elemets into al
            for(int i=0;i<5;i++){
               al.add(i+5);
            }
   
            //printing
            System.out.println(al);
   
           
            //get(int index)----->returns element present at that index
            System.out.println("get(2) =: "+al.get(2));
   
            //remove element
            al.remove(1);//'1'-->index but not element
   
            System.out.println(al);

            boolean b=Collections.addAll(al,10,11,12,13,14,15);

            //result
            System.out.println("result: "+b);

            //after the "al" arraylist
            System.out.println("updated arraylist: "+al);
          }
          catch(NullPointerException e){
               System.out.println("Exception1: "+e);
          }
    }
}
