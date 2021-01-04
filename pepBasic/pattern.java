import java.util.Scanner;

public class pattern{
    public static Scanner scn = new Scanner(System.in);

  // Pattern 1
    public static void triangle(int row){    
        int nst = 1, nsp = 0;                   // nsp = number of spaces,   nst = number of stars.
        for(int r = 1; r <= row; r++){
            for(int csp = 1; csp <= nsp; csp++){     // csp = count of spaces.
                System.out.print("\t");
            }

            for(int cst = 1; cst <= nst; cst++){      // cst = count of stars.
                System.out.print("*\t");
            }
        nst++;
        nsp--;
        System.out.println();
        }
    }

   
    // Pattern 2   
    public static void upsideDownTriangle(int row){    
        int nst = 5;                   // nsp = number of spaces,   nst = number of stars.
        for(int r = 1; r <= row; r++){
           
            for(int cst = 1; cst <= nst; cst++){      // cst = count of stars.
                System.out.print("*\t");
            }
        nst--;
        
        System.out.println();
        }
    }

 // Pattern 3
 public static void mirrorTriangle(int row){    
    int nst = 1, nsp = row - 1;                   // nsp = number of spaces,   nst = number of stars.
    for(int r = 1; r <= row; r++){
        for(int csp = 1; csp <= nsp; csp++){     // csp = count of spaces.
            System.out.print("\t");
        }

        for(int cst = 1; cst <= nst; cst++){      // cst = count of stars.
            System.out.print("*\t");
        }
    nst++;
    nsp--;
    System.out.println();
    }
}

    // Pattern 4
    public static void UpsideDownMirrorTriangle(int row){    
        int nst = row;                   // nsp = number of spaces,   nst = number of stars.
        for(int r = 1; r <= row; r++){
           
            for(int cst = 1; cst <= nst; cst++){      // cst = count of stars.
                System.out.print("*\t");
            }
        nst--;
        
        System.out.println();
        }
    }

    // Pattern 5
    public static void mirrorPyramid(int row){    
        int nst = 1, nsp = row / 2;                   // nsp = number of spaces,   nst = number of stars.
        for(int r = 1; r <= row; r++){
            for(int csp = 1; csp <= nsp; csp++){     // csp = count of spaces.
                System.out.print("\t");
            }
    
            for(int cst = 1; cst <= nst; cst++){      // cst = count of stars.
                System.out.print("*\t");
            }
        if(r <= row / 2){
            nsp--;
            nst += 2;
        }
        else{
            nst -= 2;
            nsp++;
        }
        System.out.println();
        }
    }

    // Pattern 6           mirror pyramid of spaces between stars.
    public static void mirrorPyramid_2(int row){    
        int nst = (row + 1) / 2, nsp = 1;                   // nsp = number of spaces,   nst = number of stars.
        for(int r = 1; r <= row; r++){
            for(int cst = 1; cst <= nst; cst++){     // csp = count of spaces.
                System.out.print("*\t");
            }
    
            for(int csp = 1; csp <= nsp; csp++){      // cst = count of stars.
                System.out.print("\t");
            }
            for(int cst = 1; cst <= nst; cst++){     // csp = count of spaces.
                System.out.print("*\t");
            }
    
        if(r <= row / 2){
            nsp += 2;
            nst--;
            
        }
        else{
            nsp -= 2;
            nst++;
        }
        System.out.println();
        }
    }


    // Pattern 7
    public static void diagonal(int row){
    for(int i = 1; i <= row; i++){
        for(int j = 1; j <= row; j++){
            if(i == j)
               System.out.print("*");
            else 
               System.out.print("\t");  
            }
        System.out.println();    
        }
}

// Pattern 8
public static void inverseDiagonal(int row){
    for(int i = 1; i <= row; i++){
        for(int j = 1; j <= row; j++){
            if(i + j == row + 1)
               System.out.print("*");
            else 
               System.out.print("\t");  
            }
        System.out.println();    
        }
}

// Pattern 9
public static void bothDiagonal(int row){
    for(int i = 1; i <= row; i++){
        for(int j = 1; j <= row; j++){
            if(i == j || i + j == row + 1)
               System.out.print("*\t");
            else 
               System.out.print("\t");  
            }
        System.out.println();    
        }
}

public static void Pattern_9_1(int row){
    for(int i = 1; i <= row; i++){
        for(int j = 1; j <= row; j++){
            if(i == j || i - j == 2 || j - i == 2)
               System.out.print("*\t");
            else 
               System.out.print("\t");  
            }
        System.out.println();    
        }
}

public static void Pattern_9_2(int row){
   int p = row + 1;
    for(int i = 1; i <= row; i++){
        for(int j = 1; j <= row; j++){
            if(i + j == p || i + j == p + 2 || i + j == p - 2)
               System.out.print("*\t");
            else 
               System.out.print("\t");  
            }
        System.out.println();    
        }
}

public static void Pattern10(int row){
    int p = row + 1;
    for(int i = 1; i <= row; i++){
        for(int j = 1; j <= row; j++){
            if(i - j == 2 || j - i == 2 || i + j == p + 2 || i + j == p - 2)
               System.out.print("*\t");
            else 
               System.out.print("\t");  
            }
        System.out.println();    
        }
}

public static void pattern10(int row){
    int nsp1 = row / 2, nsp2 = -1; // nsp = number of spaces,   nst = number of stars.
        for (int r = 1; r <= row; r++) {
            for (int csp = 1; csp <= nsp1; csp++) { // csp = count of spaces.
                System.out.print("\t");
            }

            cout<<"*\t";

            for (int csp = 1; csp <= nsp2; csp++) { // cst = count of stars.
                
                cout<<"\t";
                
            }

            if(nsp2 != -1) cout<<"*\t";

            if (r <= row / 2) {
                nsp1--;
                nsp2+= 2;
            } else {
                nsp2-= 2;
                nsp1++;
            }

            cout<<endl;
        }
}

// Pattern 11
public static void integertriangle(int row){    
    int nst = 1, nsp = 0;                   // nsp = number of spaces,   nst = number of stars.
    int val = 1;
    for(int r = 1; r <= row; r++){
        for(int csp = 1; csp <= nsp; csp++){     // csp = count of spaces.
            System.out.print("\t");
        }

        for(int cst = 1; cst <= nst; cst++){      // cst = count of stars.
            System.out.print(val + "\t");
            val++;
        }
    nst++;
    nsp--;
    System.out.println();
    }
}

// public static void pattern12(int n){               // starting from 0
//     int x = 0, y = 1;
//     System.out.println(x); 
//     System.out.println(y); 
    
//     for(int i = 1; i < n - 1 ; i++){
//       int c = x + y;
//       x = y;
//       y = c; 
//       System.out.println(c); 
    
//     }
//   }

public static void pattern14(int n){

    for(int i=1;i<=10;i++){
   
       System.out.println(n + " * " + i + " = " + n * i ); 
   
      }
   }
   

public static void Pattern15(int row){    
    int nst = 1, nsp = row / 2;                   // nsp = number of spaces,   nst = number of stars.
    int val = 1;
    for(int r = 1; r <= row; r++){
        for(int csp = 1; csp <= nsp; csp++){     // csp = count of spaces.
            System.out.print("\t");
        }

        for(int cst = 1; cst <= nst; cst++){      // cst = count of stars.
            System.out.print(val + "\t");
            if(cst <= nst / 2) val++;
            else val--;
        }
    if(r <= row / 2){
        nsp--;
        nst += 2;
        val = r + 1;
    }
    else{
        nst -= 2;
        nsp++;
        val = row - r;
    }
    System.out.println();
    }
}


 
    public static void main(String[] args){
        int n = scn.nextInt();
        // mirrorTriangle(5);
        triangle(n);
        // UpsideDownMirrorTriangle(n);
        // upsideDownTriangle(n);
        // diagonal(n);
        // inverseDiagonal(n);
        // Pattern_9_1(n);
        // Pattern_9_2(n);
        // Pattern10(n);
        // pattern14(n);
        // mirrorPyramid(n);
        // mirrorPyramid_2(n);
        // Pattern15(n);
        // integertriangle(n);
        // integermirrorPyramid(n);

    
    }



}





