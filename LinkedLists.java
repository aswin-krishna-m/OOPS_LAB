import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        System.out.println("Initial LinkedList: " + linkedList);
        linkedList.clear();
        System.out.println("LinkedList after removing all elements: " + linkedList);
    }
}

// **************OUTPUT**************

/*

Initial LinkedList: [Apple, Banana, Cherry, Date]
LinkedList after removing all elements: []

*/