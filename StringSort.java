import java.util.Arrays;
public class StringSort {
    public static void main(String[] args){
        String  nameList[] = {"Virat","Messi","Neymar","Aswin","Sachin"};
        int len = nameList.length;
        for(int i =0; i<len-1;i++){
        for(int j =i+1; j<len;j++){
            if(nameList[i].compareTo(nameList[j])>0){
                String temp = nameList[i];
                nameList[i] = nameList[j];
                nameList[j] = temp;
            }
            }
        }
        System.out.println(Arrays.toString(nameList));
    }
}


// **************OUTPUT**************

/* 
[Aswin, Messi, Neymar, Sachin, Virat]
*/
