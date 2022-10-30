public class recursion_practice {
    public static void recurseNumber(int n){
        if(n<1){
            System.out.println("n is less than 1");
            return ;
        }
        else{
            recurseNumber(n-1);
            System.out.println(n);
            return  ;
        }
    }
    public static void main(String args[])
    {
      recurseNumber(4);
    }
}
