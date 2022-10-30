public class MultiLevelInheritance {
    public void PrintStartMantra(){
        System.out.println("hare krishna hare krishna \n krihna krishna hare hare");
    }
}
class FirstDerived extends MultiLevelInheritance{
    public void PrintEndMantra(){
        System.out.println("hare rama hare rama \n rama rama hare hare");
    }
}
class SecondDerived extends FirstDerived{
    public void PrintMatraName(){
        System.out.println("HARE KRISHNA MAHA MANTRA");
    }
    public static void main(String args[]){
        //object creation
        SecondDerived s=new SecondDerived();
        s.PrintMatraName();
        s.PrintStartMantra();
        s.PrintEndMantra();
    }
}
