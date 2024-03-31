import java.util.Scanner;
class CmdSearchArray{
	public static void main(String[] args){
	int[] arr =  new int[10]; 
	int temp,n,f=0,len;
	len = args.length;
	System.out.println("Array length is: "+ len);
	len = len-1;
	for(int i=0;i<=len ;i++){
		arr[i]= Integer.parseInt(args[i]);
	}
	for(int i=0;i<=len;i++){
		for(int j=0;j<=len;j++){
			if(arr[i]<arr[j]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println("Array after sorting: ");
	for(int i=0;i<=len;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.print("\nEnter element to be searched : ");
	Scanner r = new Scanner(System.in);
	n = r.nextInt();
	r.close();
	for(int i=0;i<=len;i++){
		if(arr[i]==n){
			f++;
			break;
		}
	}
	System.out.println(f==0 ? "Element not found" : "Element found");
	}
}


// **************OUTPUT**************

/*
javac CmdSearchArray.java
java CmdSearchArray 1 2 34 5 4 
Array length is: 5
Array after sorting: 
1 2 4 5 34
Enter element to be searched : 6
Element not found
*/