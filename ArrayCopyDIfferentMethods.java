// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
public class ArrayCopyDIfferentMethods {
    public static void main(String args[]) {
        //method 1
        //copying each element while iterating
        int a[]= {1,2,3,4,5};
        int b[]=new int[a.length];
        for(int j=0; j<a.length; j++) {
            b[j]=a[j];
        }
        //modifying existing elements in b[] array
        b[0]++;
        //printing of array elements
        for(int k=0;k<a.length;k++){
            System.out.println("a[] array elemenst are: "+a[k]);
        }
        for(int k=0;k<b.length;k++){
            System.out.println("b[] array elemenst are: "+b[k]);
        }
        
        //methods 2
        //using clone method
        int c[]=b.clone();
        
        for(int k=0;k<c.length;k++){
            System.out.println("c[] array elemenst are: "+c[k]);
        }
        
       //method 3
       //using arraycopy() method
       //public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
       /*
       Parameters:

       src denotes the source array.
       srcPos is the index from which copying starts.
       dest denotes the destination array
       destPos is the index from which the copied elements are placed in the destination array.
       length is the length of the subarray to be copied.

       */
       int d[]=new int[c.length];
       System.arraycopy(c,0,d,0,c.length);
       for(int k=0;k<c.length;k++){
            System.out.println("c[] array elemenst are: "+c[k]);
        }
        System.out.println();
        for(int k=0;k<d.length;k++){
            System.out.println("d[] array elemenst are: "+d[k]);
        }
        
        //method 4
        //copyOf() method in ArrayClass
        /*
        Syntax: 

        public static int[] copyOf(int[] original, int newLength) 
        Parameters:

        Original array
        Length of the array to get copied.
        */
        int e[]=Arrays.copyOf(a,5);
        System.out.println();
        for(int k=0;k<e.length;k++){
            System.out.println("e[] array elemenst are: "+e[k]);
        }
        
        //copyOfRange() method
        /*
        This method copies the specified range of the specified array into a new array.

public static int[] copyOfRange(int[] original, int from, int to)
Parameters:

Original array from which a range is to be copied
Initial index of the range to be copied
Final index of the range to be copied, exclusive
        */
        int f[]=Arrays.copyOfRange(a,0,4);
        System.out.println();
        for(int k=0;k<f.length;k++){
            System.out.println("f[] array elemenst are: "+f[k]);
        }
    }
}
