package Java_Basic_Algo_and_DS.Basic_Programs.Patterns_in_Java;

import java.util.Scanner;

public class CharacterOne {
    public static void main(String args[]) {
        int row=0;
        char ch;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number rows: ");
        row=sc.nextInt();

        for(int i=1;i<=row;i++){
            ch = (char) ('A'+i-1);
            for(int j=1;j<=row;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
