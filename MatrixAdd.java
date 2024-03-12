import java.util.Scanner;

public class MatrixAdd {
    int row,col;
    int[][] arr;
    int[][] arr2;
    public MatrixAdd(int r, int c){

        this.row = r;
        this.col = c;
        this.arr= new int[r][c];
        this.arr2= new int[r][c];
    }
    public int[][] readMatrix(){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Elements: ");
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
            int k = r.nextInt();
            this.arr[i][j] = k;
            }
        }
        r.close();
        return arr;
    }
    public int[][] addMatrix(int[][] a, int[][] b){
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                this.arr2[i][j] = a[i][j]+b[i][j];
            }
        }
        return arr2;
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter Row And Column: ");
        int r1 = read.nextInt();
        int c1 = read.nextInt();
        read.close();
        MatrixAdd x = new MatrixAdd(r1,c1);
        int[][] a1 = x.readMatrix();

        int r2 = r1;
        int c2 = c1;
        MatrixAdd y = new MatrixAdd(r2,c2);
        int[][] a2 = y.readMatrix();

        int[][] a3 = x.addMatrix(a1,a2);
        System.out.println("Resulting Matrix Is:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(a3[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}




// **************OUTPUT**************
/*
Enter Row And Column: 2 2
Enter Elements: 
2 3
3 2
Enter Elements: 
4 5
6 2
Resulting Matrix Is:
6 8 
9 4
*/