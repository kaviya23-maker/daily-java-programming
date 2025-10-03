import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int ind=0;ind<n;ind++){
            arr[ind]=sc.nextInt();
        }
        int threshold=sc.nextInt();
        System.out.println(displayCount(arr,threshold));
    }
    static int displayCount(int[] arr,int threshold){
        int count=0;
        for(int term:arr){
            count+=term/threshold+((term%threshold==0)?0:1);
        }
        return count;
    }
}
