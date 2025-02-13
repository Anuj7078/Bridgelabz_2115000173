import java.util.*;
public class LongestConsecutiveSub{
    public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number of elements in the array:");
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
          }
          int ans=countSequence(arr);
          System.out.println("The length of the longest consecutive subsequence is:");
          System.out.println(ans);
          sc.close();
     }
     public static int countSequence(int arr[]){
          HashSet<Integer> set=new HashSet<>();
          int max=0;
          for(int i=0;i<arr.length;i++){
             set.add(arr[i]);          
          }   
          for(int x:set){
             if(!set.contains(x-1)){
                int count=1,num=x;
                while(set.contains(num+1)){
                   count++;
                   num++;
                }
                max=Math.max(max,count);
             }
           }
           return max;
      }
}