import java.util.ArrayList;
public class UncheckedWarnings {
    @SuppressWarnings("unchecked") 
    public static void main(String[] args) {
       
        ArrayList rawList = new ArrayList();
        rawList.add("Java");
        rawList.add("Python");
        rawList.add("C++");

        ArrayList<String> safeList = new ArrayList<>(rawList); 
        System.out.println("Safe List: " + safeList);
    }
}