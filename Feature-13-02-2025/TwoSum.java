import java.util.*;
public class TwoSum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value");
        int target=sc.nextInt();
        int ans[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int x=target-arr[i];
            if(map.containsKey(x)){
                ans[0]=i;
                ans[1]=map.get(x);
                break;
            }
            map.put(arr[i],i);
        }

        System.out.println("Given pair is -> "+ans[0]+" & "+ans[1]);
     }
}