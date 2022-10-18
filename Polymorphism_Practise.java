//polymorphism

class Polymorphism_Practise{
    int sum(int x){
        return x;
    }
    int sum(int x,int y){
        return x+y;
    }
    int sum(int x,int y,int z){
        return x+y+z;
    }
    public static void main(String args[]){
        Polymorphism_Practise p=new Polymorphism_Practise();
        System.out.println("sum1: "+p.sum(4));
        System.out.println("sum2: "+p.sum(2,4));
        System.out.println("sum3: "+p.sum(2,4,6));
    }
}
