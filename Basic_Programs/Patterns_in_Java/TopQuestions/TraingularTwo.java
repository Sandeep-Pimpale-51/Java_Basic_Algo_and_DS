// Another method for traingular pattern with optimal solution O(n)
/* pattern

  1
  1 1
  1 1 1

 */
package Java_Basic_Algo_and_DS.Basic_Programs.Patterns_in_Java.TopQuestions;

import java.util.Scanner;

public class TraingularTwo {
    public static void main(String args[]){
        int row=0;
        String res="";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number rows: ");
        row=sc.nextInt();  
        
        for(int i=0;i<row;i++){
            res+="1";
        }

        for(int i=0;i<row;i++){
            System.out.println(res.substring(0,i+1));
        }
        sc.close();
    }
}
