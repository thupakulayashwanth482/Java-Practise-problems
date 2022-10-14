//difference betwen string and stringbuilder
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

//difference betwen string and stringbuilder
class String_Operation{
     public static void main(String args[]){
      //case 1 : string--->StringBuilder conversion
      
      String name="yashwanth";
      
      System.out.println("my name is "+name);
      
      StringBuilder lastName=new StringBuilder(name);
      
      String surname="thupakula";
      
      lastName.append(surname);
      
      System.out.println(lastName);
      
      //String -->StringBuffer conversion
      StringBuffer firstName=new StringBuffer(surname);
      
      firstName.append(name);
      System.out.println(firstName);
      
      //case 2a : converting from StringBuffer to String
     
     StringBuffer sis=new StringBuffer("geetha");
     
     //simply we must use toString() method
     
     String sisName=sis.toString();
     
     System.out.println("sister name is "+sisName);
     
     sis.append(" thupakula");
     
     //separate object is created for String in heap area ,so changes done in StringBuffer will not reflect in String sis because they are refencing different objects
     System.out.println("StringBuffer :"+sis);
     System.out.println("String :"+sisName);
     
     
     //case 2b : converting from StringBuilder to String
     
     StringBuilder bro=new StringBuilder("gopi");
     
     //simply use toString() method
     
     String broName=bro.toString();
     System.out.println("StringBuilder :"+bro);
     System.out.println("String :"+broName);
     
     bro.append(" thupakula");
     //separate object is created for String in heap area ,so changes done in StringBuilder will not reflect in String sis because they are refencing different objects
     System.out.println("StringBuilder :"+bro);
     System.out.println("String :"+broName);
     
     //case 3a: StringBuilder -->StringBuffer conversion
     //logic :   first convert from StringBuilder -->String
                // then  convert from String --->StringBuffer
                
    StringBuilder dear=new StringBuilder("krishna");
    
    String dearName=dear.toString();
    
    StringBuffer myDearName=new StringBuffer(dearName);
    System.out.println(dear.getClass());
    System.out.println(myDearName.getClass());
    System.out.println("StringBuilder : "+dear);
    System.out.println("StringBuffer : "+myDearName);
    
    //similarlly we can convert from StringBuffer to StringBuilder
    
    StringBuffer devotee=new StringBuffer("yashwanth");
    
    String devoteeName=devotee.toString();
    
    StringBuilder myDevoteeName=new StringBuilder(devoteeName);
    
    System.out.println(devotee.getClass());
    System.out.println(myDevoteeName.getClass());
     }
}
