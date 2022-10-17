// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class StringBufferPractice{
    public static void main(String[] args) {
        //String buffer is mutable
        //3 Constructors
        //1st way----->StringBuffer()-->empty StringBuffer with initial capacity of 16
        //2nd way ---->StringBuffer(String s)
        
        //3rd way ------>StringBuffer(int capacity)
        
        //methods() in StringBuffer
        
        //1.append()
        StringBuffer sb=new StringBuffer("yashwanth");
        sb.append("thupakula");
        System.out.println("after append() method: "+sb);
        
        //2.insert(int index,String str)
        
        sb.insert(9,"b172173");
        System.out.println("after inserting b172173 at index 9: "+sb);
        
        //3.replace(int startIndex,int endIndex,String stringToBeReplacedWith)
        
        sb.replace(0,9,"YASHWANTH");
        System.out.println("after replacing index 0 to 9 with \"YASHWANTH\": "+sb);
        
        //4.delete(int startIndex,int endIndex)
        sb.delete(9,16);
        System.out.println("after deleting from index 9 to index 16: "+sb);
        
        //5.reverse()
        
        System.out.println("String reversal "+sb.reverse());
        
        //6.capacity()
        
        System.out.println("String capacity "+sb.capacity());
        
        //7.length()
        
        System.out.println("String length is "+sb.length());
        
        //8.charAt()
        
        System.out.println("charcter at index: 3 is : "+sb.charAt(3));
        
        //deleteCharAt()
        
        sb.deleteCharAt(3); //'3' is index
        System.out.println("after deletion at index 3 "+sb);
     
     //finally  all the methods in Strings are applicable in StringBuffer as well
    }
}
