/* Pattern

1 2 3 4 5 
11 12 13 14 15
21 22 23 24 25
16 17 18 19 20
6 7 8 9 10

 */

package Java_Basic_Algo_and_DS.Basic_Programs.Patterns_in_Java.TopQuestions;

import java.util.Scanner;

public class ZigzagSprialOne {
    public static void main(String args[]) {
        // a=starting row index,b= ending row index
        int row=0;
        int a=0;
        int num=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number rows: ");
        row=sc.nextInt();

        int b=row-1;

        String res[]=new String[row];

        for(int i=0;i<row;i++){
            String temp=new String();
            for(int j=0;j<row;j++){
                temp+=num+" ";
                num++;
            }
            if(i%2==0){
                res[a]=temp;
                a++;
            }else{
                res[b]=temp;
                b--;
            }
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
        sc.close();
    }
}
