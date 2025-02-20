import java.util.LinkedList;
import java.util.ListIterator;
public class NthFromEnd {
    public static String findNthFromEnd(LinkedList<String> list, int n) {
            ListIterator<String> first = list.listIterator();
            ListIterator<String> second = list.listIterator();
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) return null;
            first.next();
        }
        while (first.hasNext()) {
            first.next();
            second.next();
        }
        return second.next();
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        int n = 2;
        System.out.println(findNthFromEnd(list, n));
    }
}
