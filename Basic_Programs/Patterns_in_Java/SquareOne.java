package Java_Basic_Algo_and_DS.Basic_Programs.Patterns_in_Java;

import java.util.Scanner;

class SquareOne{
    public static void main(String args[]) {
        int row=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number rows: ");
        row=sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}