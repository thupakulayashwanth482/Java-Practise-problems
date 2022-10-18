class Rgukt{
    String branchName1;
    String branchName2;
    String branchName3;
    int studentCount;
    double collegeFee;
    Rgukt(String b1,String b2,String b3,int sCount,double clgFee){
        branchName1=b1;
        branchName2=b2;
        branchName3=b3;
        studentCount=sCount;
        collegeFee=clgFee;
    }
    public static void main(String args[]){
        Rgukt r=new Rgukt("cse","ece","eee",8000,40000.0);
        System.out.println("branch 1: "+r.branchName1);
        System.out.println("branch 2: "+r.branchName2);
        System.out.println("branch 3: "+r.branchName3);
        System.out.println("Student Count: "+r.studentCount);
        System.out.println("collegeFee: "+r.collegeFee);
    }
}
