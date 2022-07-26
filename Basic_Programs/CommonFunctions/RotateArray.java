package Java_Basic_Algo_and_DS.Basic_Programs.CommonFunctions;

import java.util.Scanner;

public class RotateArray {
    public static void main(String args[]) {
        
        int rc=0;
        int arr[]={3,5,7,9,8};

        System.out.print("Enter how much to rotate");
        Scanner sc= new Scanner(System.in);
        rc=sc.nextInt();

        int res[]=new int[arr.length];

        res=Rotate(arr,rc);

        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
        // int len=sc.nextInt();
        // int arr[]=new int[len];

        // for(int i=0;i<len;i++){
        //     arr[i]=sc.nextInt();
        // }
        sc.close();
    }
    static int[] Rotate(int arr[],int rc){
        
        int len=arr.length;
        int first=0;

        for(int i=0;i<rc;i++){
            first=arr[0];
            for(int j=0;j<len-1;j++){
                
                arr[j]=arr[j+1];
            }
            arr[len-1]=first;
        }
        return arr;
    }
}
