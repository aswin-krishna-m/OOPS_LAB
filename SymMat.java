import java.util.Scanner;

public class SymMat {
    
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int temp;
        int r = 2;
        int c = 2;
        int[][] arr = new int [r][c];
        System.out.println("Enter Elements: ");
        for(int i = 0;i<r; i++){
            for(int j = 0;j<c; j++){
                int k = read.nextInt();
                arr[i][j] = k;
            }
        }
        read.close();
        System.out.println("Entered Matrix is: ");
    for(int i = 0;i<r; i++){
        for(int j = 0;j<c; j++){
            System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
temp = r;
r = c;
c = temp;

int[][] tarr = new int [r][c];
    for(int i = 0;i<r; i++){
        for(int j = 0;j<c; j++){
            tarr[i][j] =arr[j][i];
        }
    }
    System.out.println("Transpose Matrix is: ");
    for(int i = 0;i<r; i++){
        for(int j = 0;j<c; j++){
            System.out.print(tarr[i][j] + " ");
    }
    System.out.println();
    }
    int f=0;
    for(int i = 0;i<r; i++){
        for(int j = 0;j<c; j++){
            if(arr[i][j]!=tarr[i][j]){
                f++;
            }
    }
    }
    if (f>0) {
        System.out.println("Matrix is Not Symmetric");
    }else{
    System.out.println("Matrix is Symmetric");
    }}
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