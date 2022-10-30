public class HierarchicalInheritance{
    public void print_krishna(){
        System.out.println("lord krishna loves his devotees");
    }
}
class krishna extends HierarchicalInheritance{
    public void print_shiva(){
        System.out.println("lord shiva never disappointed his devotees");
    }
}
class rama extends HierarchicalInheritance{
    public void print_durga(){
        System.out.println("how come we forget that maa durga showers on his beloved once");
    }
}
class hanuman extends HierarchicalInheritance{
    public void print_hanuman(){
        System.out.println("who else can serve lord rama other than lord hanuman");
    }
    public static void main(String args[]){
        //object creation
        hanuman h=new hanuman();
        h.print_krishna();
        h.print_hanuman();
    }
}
