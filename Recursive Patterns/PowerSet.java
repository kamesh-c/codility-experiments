import java.util.*;

public class PowerSet {

    public static List<List<Integer>> combinations(int[] n){
        List<List<Integer>> results = new LinkedList<>();
       // combinations(n,0)
        return results;
    }

    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

     //Adding elements to the Linked list
     list.add("Steve");
     list.add("Carl");
     list.add("Raj");

     //Adding an element to the first position
     list.addFirst("Negan");

     //Adding an element to the last position
     list.addLast("Rick");
     Iterator<String> iterator=list.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());
     }
     //Adding an element to the 3rd position
     list.add(20, "Glenn");

     //Iterating LinkedList
     Iterator<String> iterator1=list.iterator();
     while(iterator1.hasNext()){
       System.out.println(iterator1.next());
     }
    }
}
