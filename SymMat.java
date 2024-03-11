import java.util.Scanner;

public class SymMat {
    public void showMat(int r,int c,int[][] a){
        for(int i = 0;i<r; i++){
            for(int j = 0;j<c; j++){
                System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        SymMat obj = new SymMat();
        int temp, r = 2,c = 2;
        int[][] arr = new int [r][c];
        System.out.println("Enter Elements: ");
        for(int i = 0;i<r; i++){
            for(int j = 0;j<c; j++){
                arr[i][j] = read.nextInt();
            }
        }
        read.close();
        System.out.println("Entered Matrix is: ");
        obj.showMat(r,c,arr);
        int[][] tarr = new int [r][c];
        for(int i = 0;i<r; i++){
            for(int j = 0;j<c; j++){
                tarr[i][j] =arr[j][i];
            }
        }
        System.out.println("Transpose Matrix is: ");
        obj.showMat(r,c,tarr);
        int f=0;
        for(int i = 0;i<r; i++){
            for(int j = 0;j<c; j++){
                if(arr[i][j]!=tarr[i][j]){
                    f++;
                }
            }
            if(f!=0){
                System.out.println("Matrix is Not Symmetric");
                break;
            }
        }
    if (f==0){
    System.out.println("Matrix is Symmetric");
    }
}
}




// **************OUTPUT**************
/*
Enter Elements: 
2 3
3 2
Entered Matrix is: 
2 3 
3 2
Transpose Matrix is:
2 3
3 2
Matrix is Symmetric
*/