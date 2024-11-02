package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q59 {
    public static void print(int[][] arr, int v){
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j]+" ");
                System.out.print(v++ +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[][] arr = new int[x][x];
        int m = arr.length;
        int n = arr[0].length;
        int v = 1;
        int[][] arr1 = new int[x][x];

        System.out.println(Arrays.deepToString(arr1));
        print(arr,v);

        // spiral print
        int minr = 0, maxr = m-1;
        int minc = 0, maxc = n-1;
        while (minr <= maxr && minc <= maxc){
            // left to right
            for (int j = minc; j <= maxc; j++){
                arr1[minr][j]=v;
                v++;
            }
            minr++;
            // top to bottom
            if (minr>maxr || minc>maxc) break;
            for (int i = minr; i <= maxr; i++){
                arr1[i][maxc]=v;
                v++;
            }
            maxc--;
            // right to left
            if (minr>maxr || minc>maxc) break;
            for (int j = maxc; j >= minc; j--){
                arr1[maxr][j]=v;
                v++;
            }
            maxr--;
            // bottom to top
            if (minr>maxr || minc>maxc) break;
            for (int i = maxr; i >= minr; i--){
                arr1[i][minc]=v;
                v++;
            }
            minc++;
        }
        System.out.print(Arrays.deepToString(arr1));
    }
}
