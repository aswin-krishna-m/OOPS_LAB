import Arithmetic.*;
public class TestArithmetic {
 public static void main(String[] args) {
 
 Sum Sum = new Sum();
 Diff Diff = new Diff();
 Mul Mul = new Mul();
 Div Div = new Div();
 System.out.println("Addition: " + Sum.c_sum(9, 6));
 System.out.println("Subtraction: " + Diff.c_diff(17,9));
 System.out.println("Multiplication: " + Mul.c_mul(5,4));
 System.out.println("Division: " + Div.c_div(17,3));
 }
}



// **************OUTPUT**************

/*

Addition: 15
Subtraction: 8
Multiplication: 20.0
Division: 5.0


*/