package Java_Basic_Algo_and_DS.Basic_Programs.Patterns_in_Java.TopQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String args[]) {
        
        ArrayList <ArrayList<Integer>> a=new ArrayList<>();
        int num=1;
        int row=0;

        Scanner sc = new Scanner(System.in);
        row=sc.nextInt();

        // first pattern
        for(int i=0;i<row;++i){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<row-i;++j){
                temp.add(num);
                num++;
            }
            a.add(temp);
        }

        // second pattern
        for(int i=row-1;i>=0;--i){
            for(int j=0;j<row-i;++j){
                a.get(i).add(num);
                num++;
            }
        }

        System.out.println(a);
    }
}
