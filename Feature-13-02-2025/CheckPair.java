import java.util.*;
public class CheckPair{
     public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
          }
          int k=sc.nextInt();
          boolean ans=sum(arr,k);
          System.out.println(ans);
          sc.close();
     }

     public static boolean sum(int arr[],int target){
          HashMap<Integer,Integer> map=new HashMap<>();
          for(int i=0;i<arr.length;i++){
               if(map.containsKey(target-arr[i])){
                    return true;
               }
               map.put(arr[i],i);
          }
          return false;
     }
}