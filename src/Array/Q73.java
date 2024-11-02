package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q73 {
    public static void input(int[][] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for a " + arr.length + "x" + arr[0].length + " array:");
        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j<arr[i].length;j++){
                System.out.print("Enter value for element [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row : ");
        int A = sc.nextInt();
        System.out.println("Enter the column : ");
        int B = sc.nextInt();
        int[][] arr = new int[A][B];
        input(arr);
        int m = arr.length, n = arr[0].length;
        boolean zeroRow = false;
        boolean zeroCol = false;
        // check the 0th row
        for(int j=0; j<n; j++){
            if(arr[0][j] == 0){
                zeroRow = true;
                break;
            }
        }
        // check the 0th col
        for(int i=0; i<m; i++){
            if(arr[i][0] == 0){
                zeroCol= true;
                break;
            }
        }
        // traverse in the submatrix without 0th row & 0th column
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(arr[i][j]==0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        // traverse in the 0th row
        for (int j = 1; j < n; j++) {
            if(arr[0][j] ==0){  // set jth column to 0
                for(int i=1;i<m;i++){
                    arr[i][j] = 0;
                }
            }
        }
        // traverse in the 0th column
        for (int i = 1; i < m; i++) {
            if(arr[i][0] ==0){  // set jth column to 0
                for(int j=1;j<n;j++){
                    arr[i][j] = 0;
                }
            }
        }
        // set the 0th row to 0
        if(zeroRow==true){
            for(int j=0; j<n; j++){
                arr[0][j]=0;
            }
        }
        // set the 0th col to 0
        if(zeroCol==true){
            for(int i=0; i<m; i++){
                arr[i][0]=0;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
