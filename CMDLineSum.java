public class CMDLineSum {
    public static void main(String arg[]) {
        int sum = 0;
        int invalid = 0;
        int num = 0;
        for (int i = 0; i < arg.length; i++) {
            try {
                num = Integer.parseInt(arg[i]);
                sum = num + sum;
            } catch (NumberFormatException e) {
                invalid = invalid + 1;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("invalid integers = " + invalid);
    }
}


// **************OUTPUT**************

/*

java CMDLineSum 2 4 5 
sum = 11
invalid integers = 0

*/