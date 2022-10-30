public class String_Practice {
    public static void main(String args[]){
        //String opeartions
        //synax --> String variable_name="String_here";
        String name="yashu";
        System.out.println("my name is "+name);

        //concatenation
        String surname="yashwanth";
        String fullName=surname+name;
        System.out.println(fullName);
        System.out.println("length of the String is "+fullName.length());
        
        //printing individual characters in the java
        //using charAt() method
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
        
        //to compare 2 Strings

        //using compareTo() method--> case 1 : if s1>s2 return +ve number
                                    // case 2 : if s1==s2 return 0
                                    // case 3: if s1<s2 return -ve number
        if(name.compareTo(surname)>0){
            System.out.println(name+" > "+surname);
            System.out.println(name.compareTo(surname));
        }
        else if(name.compareTo(surname)<0){
            System.out.println(name+" < "+surname);
            System.out.println(name.compareTo(surname));
        }
        else{
            System.out.println("both are equal");
            System.out.println(name.compareTo(surname));        }

    }
}
