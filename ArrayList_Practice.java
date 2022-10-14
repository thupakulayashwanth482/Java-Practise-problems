import java.util.*;
class ArrayList_Practice{
    public static void main(String args[]){
        //practice on arraylist
        ArrayList <Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);
            int num;
            System.out.println("Enter the elements:");
            num=sc.nextInt();
            //adding elements into the arrayList
            arr.add(num);
        }
        //printing the elements
        System.out.println(arr);
        //removing the element by mentioning it's index
        arr.remove(0); //'2' is the index in arrayList
        System.out.println(arr);
        //to print the elements individually
        //we will use get method
        for(int j=0;j<arr.size();j++){
            System.out.print(arr.get(j)+" ");
        }
        //add(index,element)---->This method is used to insert a specific element at a specific position index in a list.
        arr.add(0,100);
        System.out.println(arr);
        int numbers[]=new int[]{10,20,30,40,50,60,70,80,90,100};
        ArrayList<Integer> arr1 = new ArrayList<Integer>(arr);
        System.out.println(arr1);
        for(int k=0;k<numbers.length;k++){
            arr.add(new Integer(numbers[k]));
        }
        System.out.println(arr);
        //addAll(Collection)
        ArrayList<Integer> arr2=new ArrayList<Integer>();
        arr2.add(10);
        arr2.add(20);
        ArrayList<Integer> arr3=new ArrayList<Integer>();
        arr3.add(30);
        arr3.add(40);
        arr2.addAll(arr3);
        System.out.println(arr2);
    }

}