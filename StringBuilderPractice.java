// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class StringBuilderPractice{
    public static void main(String[] args) {
        //4 Constructors in StringBuilder
        //1st one
        StringBuilder sb=new StringBuilder();
        sb.append("yashwanth");
        System.out.println("1st Constructor: "+sb);
        
        //2nd Constructor with capacity
        StringBuilder sb1=new StringBuilder(10);
        sb1.append("geethanjali");
        System.out.println("2nd Constructor: "+sb1);
        
        //4th Constructor with passing string as arguements
        
        StringBuilder surname=new StringBuilder("thupakula");
        System.out.println("4th Constructor : "+surname);
        
        //note:
        //all the operations and methods performed in StringBuffer //can be used in StringBuilder as well
        //methods like
        //1.append()    2.capacity()   3.charAt(int index)
        //4.delete(int start,int end)   5.deleteCharAt(int index)
        //6.indexOf()   7.insert()  8.lastIndexOf()  9.length()
        //10.replace(int start,int end,String str) 11.reverse()
        //12.setCharAt(int index,char ch)   13.toString()
        //14.substring()   15.trimToSize()
    }
}
