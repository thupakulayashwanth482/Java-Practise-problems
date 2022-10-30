public class SingleInheritence {
    public void print_surname(){
        System.out.println("thupakula");
    }
}
class derivedClass extends SingleInheritence{
    public void print_lastname(){
        System.out.println("yashwanth");
    }
    public void print_id(){
        System.out.println("B172173");
    }
    public static void main(String args[]){
        //object creation
        derivedClass d=new derivedClass();
        d.print_surname();
        d.print_lastname();
        d.print_id();
    }
}
