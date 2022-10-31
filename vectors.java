// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class vectors {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector();
        //adding elements in the vector
        v.add(10);
        v.add(12);
        v.add(30);
        v.add(21);
        System.out.println(v);
        System.out.println("element removed is:"+v.get(3));
        //finding the required element using it's index
        v.remove(v.get(3));
        System.out.println(v);
        //set() method
        v.set(0,50); //updating 0th index with 50 value
        System.out.println(v);
        //addAll() method
        ArrayList<Integer> c=new ArrayList<Integer>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        v.addAll(c);
        System.out.println(v);
        //contain() method
        System.out.println(v.contains(50));//here 50 is element. return true if it is found and else false
        //containsAll()
        System.out.println(v.containsAll(c));
        //equals()
        /*The java.util.vector.equals(Object obj) method of Vector class in Java is used verify the equality of an Object with a vector and compare them. The list returns true only if both Vector contains same elements with same order.*/
        Vector<Integer> v2=new Vector<Integer>();
        v2.add(12);
        v2.add(30);
        v2.add(45);
        System.out.println(v.equals(v2));
        //removeAll(collection c);
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(12);
        a.add(30);
        v2.removeAll(a);
        System.out.println("elements are removed in v2:"+v2);
        //clear() method
        v.clear();
        System.out.println(v);
        //isEmpty()
        System.out.println(v.isEmpty());
    }
}
