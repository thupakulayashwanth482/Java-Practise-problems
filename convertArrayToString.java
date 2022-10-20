// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class convertArrayToString {
    public static void main(String[] args) {
        //method 1
        //using Arrays.toString()
        // Let us create different types of arrays and 
        // print their contents using Arrays.toString() 
        boolean[] boolArr 
            = new boolean[] { true, true, false, true }; 
        char[] charArr 
            = new char[] { 'g', 'e', 'e', 'k', 's' }; 
        double[] dblArr 
            = new double[] { 1, 2, 3, 4 }; 
        int[] intArr 
            = new int[] { 1, 2, 3, 4 }; 
        Object[] objArr 
            = new Object[] { 1, 2, 3, 4 }; 
            //boolean array
        String b=Arrays.toString(boolArr);
        System.out.println( 
            "Boolean Array: "
            +  b.getClass().getSimpleName());
            //character array
        String c=Arrays.toString(charArr);
        System.out.println( 
            "Character Array: "
            + c.getClass().getSimpleName()); 
            //double array
        String d=Arrays.toString(dblArr);
        System.out.println( 
            "Double Array: "
            + d.getClass().getSimpleName()); 
          //integer array
          String i=Arrays.toString(intArr);
        System.out.println( 
            "Integer Array: "
            + i.getClass().getSimpleName()); 
            String o=Arrays.toString(objArr);
        System.out.println( 
            "Object Array: "
            + o.getClass().getSimpleName());
            
            
    //method 2
    //using StringBuilder.append(char[] ch)
    StringBuilder sb=new StringBuilder("we are indians ");
    char[] ch={'w','e','l','o','v','e','i','n','d','i','a'};
    sb.append(ch);
    System.out.println(sb);
    }
}
