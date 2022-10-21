// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.io.*;
class ConstructorsPractice {
    int age;
    String name;
    //method1
    ConstructorsPractice(){
        System.out.println("constructor is called:");
    }
    ConstructorsPractice(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println("age is: "+this.age);
        System.out.println("name is: "+this.name);
    }
    ConstructorsPractice(String surname){
        System.out.println("surname is :"+surname);
    }
    public static void main(String[] args) {
       //types of Constructors in java
       //1.No-arguement constructor
       //2.parameterized constructor
       
       
       //1.No-arguement constructor or default Constructor
       System.out.println("method 1:\n");
       ConstructorsPractice cp=new ConstructorsPractice();
       System.out.println(cp.age);
       System.out.println(cp.name);
       
       //method 2 -->parameterized constructors
       System.out.println("method 2:\n");
       ConstructorsPractice cp1=new ConstructorsPractice(21,"yashwanth");
       System.out.println(cp1.age);
       System.out.println(cp1.name);
       
       
       //Constructor overloading
       ConstructorsPractice cp2=new ConstructorsPractice();
       ConstructorsPractice cp3=new ConstructorsPractice(21,"Krishna");
       ConstructorsPractice cp4=new ConstructorsPractice("lord rama");
    }
}
