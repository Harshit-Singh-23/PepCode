import java.util.Scanner;
public class array{
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
    }

    public static void display1(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
       System.out.println("Array is :- ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();        
        }
        
    }

    public static int maximum(int[][] arr){
        int maxEle = -(int) 1e9; // -10^9
       for(int[] row : arr){
         for (int ele : row) {
             maxEle = Math.max(maxEle, ele);
            }
        }
        return maxEle;
    }

    public static int minimum(int[][] arr){
        int minEle = (int) 1e9; // 10^9
       for(int[] row : arr){
          for (int ele : row) {
             minEle = Math.min(minEle, ele);
          }
        }
        return minEle;
    }

    public static boolean findData(int[][] arr, int data){
        for(int[] row : arr){
            for(int ele : row){
                if(ele == data){
                    return true;
                }
            }
        }
        return false;
    }

    public static void display2(int[][] arr){
        for(int[] row : arr){
            for(int ele : row){
                System.out.print(ele + " ");
            }
           System.out.println();
        }

    }

    public static void waveTraversal(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
       System.out.println("route is :- ");
        for(int i = 0; i < n; i++){
            if(i % 2 != 0){
                for(int j = m - 1; j >= 0; j--){
                    System.out.print(arr[i][j] + " ");    
                }
            }
            else{
                for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
                }            
            }
            System.out.println();        
        }
        
    }
    
    public static void verticalWaveTraversal(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                for (int i= 0; i < n; i++)
                    System.out.println(arr[i][j] + " ");
    
            } else {
                for (int i = n - 1; i >= 0; i--)
                    System.out.println(arr[i][j] + " ");
    
            }
           // System.out.println();
    
        }
    }


    

    public static void diagonalTraversal(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
       System.out.println("route is :- ");
       for(int gap = 0; gap < m ; gap++){
           for(int i = 0, j = gap; i < n && j < m; i++, j++ ){
               System.out.print(arr[i][j] + " ");
           }
       } 
    }

    public static void rotateby90(int[][] arr) {
       // transpose.
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // switching columns.
        int j1 = 0, j2 = m - 1;
        while (j1 < j2) {
            for (int i = 0; i < n; i++) {
                int temp = arr[i][j1];
                arr[i][j1] = arr[i][j2];
                arr[i][j2] = temp;

            }        
            j1++;
            j2--;            
        }
    }

    public static void exitPoint(int[][] arr){
        int c = 0, r = 0, dir = 0;
        while(true){
            dir = ( dir + arr[r][c] ) % 4;
            if(dir == 0){
                c++;
                if(c == arr[0].length){
                    System.out.println(r);
                    System.out.println(c - 1);
                    break;
                }
            }
            else if(dir == 1){
                r++;
                if(r == arr.length){
                    System.out.println(r - 1);
                    System.out.println(c);
                    break;
                }
            }
            else if(dir == 2){
                c--;
                if(c == -1){
                    System.out.println(r);
                    System.out.println(c + 1);
                    break;
                }
            }
            else if(dir == 3){
                r--;
                if(r == -1){
                    System.out.println(r + 1);
                    System.out.println(c);
                    break;
                }
            }       
        }
    }

    public static void spiraldisplay(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int tne = n * m;
        int count = 0;
        while (count < tne) {
            // left line
            for (int i = minr, j = minc; i <= maxr && count < tne; i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;

            // lower line
            for (int i = maxr, j = minc; j <= maxc && count < tne; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;

            // right line
            for (int i = maxr, j = maxc; i >= minr && count < tne; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;

            // upper line
            for (int i = minr, j = maxc; j >= minc && count < tne; j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;


        }
    }

    public static void main(String[] args){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr);
        // display1(arr);
        // System.out.println("maximum is -> " + maximum(arr));
        // System.out.println("minimum is -> " + minimum(arr));
        // System.out.println(findData(arr, 45));
        display2(arr);
        // traversal(arr);
        // verticalTraversal(arr);

    }

}

