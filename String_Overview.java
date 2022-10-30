//import java.nio.charset.*;
public class String_Overview { 
    public static void main(String args[]){
        //2 ways to create a String
        String name="yashwanth";
        //2nd way
        String name1=new String("yashwanth");
        //System.out.println(name);
        //System.out.println(name1);

        //using Constructors

        //1.byte array
        byte[] b_arr = {71, 101, 101, 107, 115};
        String var1=new String(b_arr);
        System.out.println(var1);

        //Charset cs = Charset.defaultCharset();
        //String s_byte_char = new String(b_arr, cs); //Geeks

        //byte[] b_arr1 = {71, 101, 101, 107, 115};
       // String s = new String(b_arr1, "US-ASCII");

       byte[] b_arr1 = {71, 101, 101, 107, 115};
       String s = new String(b_arr1, 1, 3); // eek
       System.out.println(s);

       char char_arr[]={'y','a','s','h','w','a','n','t','h'};
       String s1=new String(char_arr);
       System.out.println(s1);

       char char_arr1[] = {'G', 'e', 'e', 'k', 's'};
       String s2 = new String(char_arr1 , 1, 3); //eek
       System.out.println(s2);


       //String methods()
       //1.length()

       String fullname="yashwanth thupakula";
       System.out.println("length of string:" +fullname.length());
        
       //2.charAt(index)---->return element present at that position
       System.out.println(fullname.charAt(8));

       //3.substring(index) ---> returns substring from 'i'th index
       System.out.println(fullname.substring(8));

       //4.substring(start_index,end_index)-->returns substring from 'start_index' to 'end_index-1'
       System.out.println(fullname.substring(8,19));
       
       //5.concat()
       String myName="yashwanth";
       String surname="thupakula";
       String full=surname.concat(myName);
       System.out.println(full);

       //6.indexOf(String s) or indexOf(char c);
       String random="learn share and earn";
       int index=random.indexOf("share");
       System.out.println("index of share: "+index);

       //7.int indexOf (String s, int i): Returns the index within the string of the first occurrence 
       //of the specified string, starting at the specified index.
       String random_string = "Learn Share Learn";
       int output = random_string.indexOf("ea",3);// returns 13

       //8.Int lastIndexOf( String s): Returns the index within the string of the last occurrence of the
       // specified string.

        int lastindex=random.lastIndexOf("a"); //// returns 14
        System.out.println(lastindex);

        //9.equals()

        boolean outputTrue="yashwanth".equals("yashwanth");
        System.out.println(outputTrue);

        boolean  outputFalse="yashwanth".equals("Yashwanth");
        System.out.println(outputFalse);
      
        //10.equalsIgnoreCase(String s)
        boolean outputTrue1="yashwanth".equals("YashwanTH");
        System.out.println(outputTrue1);
        
        //11.compareTo(String s)

        /*int out = s1.compareTo(s2);  // where s1 and s2 are
                             // strings to be compared

            This returns difference s1-s2. If :
            out < 0  // s1 comes before s2
            out = 0  // s1 and s2 are equal.
            out > 0   // s1 comes after s2. */
        int out="yashwanth".compareTo("thupakula");
        System.out.println("compareTo() output"+out);

        //12.compareToIgnoreCase()

        /*
         *  int out = s1.compareToIgnoreCase(s2);  
            // where s1 and s2 are 
            // strings to be compared

            This returns difference s1-s2. If :
            out < 0  // s1 comes before s2
            out = 0   // s1 and s2 are equal.
            out > 0   // s1 comes after s2.
            Note- In this case, it will not consider case of a letter (it will ignore whether it is uppercase or lowercase).
         */
        int out1="yashwanth".compareTo("thupakula");
        System.out.println("compareToIgnoreCase() output"+out1);

        //13.toLowerCase()
        String sis="Geetha";
        System.out.println(sis.toLowerCase());

        //14.toUpperCase()
        String bro="gopi";
        System.out.println(bro.toUpperCase());

        //16.replace(char old,char new)
        String str1 = "feeksforfeeks";
        String str2 = "feeksforfeeks".replace('f' ,'g'); 

        System.out.println(str1+" "+str2);

        
    }
}
