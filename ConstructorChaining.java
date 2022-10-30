public class ConstructorChaining {
    //calling one constructor from another constructor is called "Constructor Chaining" 
    //w.r.t current object
    
    //we can achieved in 2 ways
    //1.within the same class using this() method
    //2.base class or parent class using super() method
    
    //example for 1st way
    //constructor 1
    ConstructorChaining(){
        this(10);
        System.out.println("default constructor is called ");
    }
    //Constructor 2
    ConstructorChaining(int x){
        this(5,10);
        System.out.println("x value is: "+x);
    }
    //Constructor 3
    ConstructorChaining(int x,int y){
        System.out.println("sum of x and y is : "+(x+y));
    }
    public static void main(String args[]){
        //object creation
        ConstructorChaining c=new ConstructorChaining();
    }
}
