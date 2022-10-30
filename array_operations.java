import java.util.*;
public class array_operations {
    public static void main(String args[]){
        //declaration of arrays are
        //way1 
        // type[] array_name= new type[size]    here type can be int,char,string,float,etc..
        //way 2
        //int marks[]=new int[3]
        //way 3 -->iniatizing the array
        //int[] array_name={1,2,3,4,5,6,7,8};

        //array is a fixed sized data type

        //way1
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        size=sc.nextInt();
        int[] marks=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter subject "+(i+1)+" marks:");
            marks[i]=sc.nextInt();
        }
        //printing of the array
        for(int j=0;j<size;j++){
            System.out.println("subject "+(j+1)+" mark is:"+marks[j]);

        }
        //sum of array elements
        int sum=0;
        for(int j=0;j<size;j++){
            sum=sum+marks[j];
        }
        System.out.println("Sum of array elemets:"+sum);

        //way3
        int subjectMarks[]={90,70,100,80};
        int sum1=0;
        for(int j=0;j<subjectMarks.length;j++){
            sum1=sum1+subjectMarks[j];
        }
        System.out.println("Sum of subjectMarks array elemets:"+sum1);
    }
}
