import java.util.Scanner;
class Inventory{
    String name;
    int itemId;
    int Quantity;
    int price;
    Inventory next;

    Inventory(String name, int itemId, int Quantity, int price){
        this.name = name;
        this.itemId = itemId;
        this.Quantity = Quantity;
        this.price = price;
        this.next = null;
    }
}
class InventoryList{
    Inventory head;
    InventoryList(){
        this.head = null;
    }
    void addAtBeginning(String name, int itemId, int Quantity, int price){
        Inventory newInventory = new Inventory(name, itemId, Quantity, price);
        if(head == null){
            head = newInventory;
        }else{
            newInventory.next = head;
            head = newInventory;
        }
    }
    void addAtEnd(String name,int itemId, int Quantity, int price){
        Inventory newInventory = new Inventory(name, itemId, Quantity, price);
        if(head == null){
            head = newInventory;
        }else{
            Inventory temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newInventory;
        }
    }
    void addAtPosition(int position, String name, int itemId, int Quantity, int price){
        if(position == 0){
            addAtBeginning(name, itemId, Quantity, price);
            return;
        }
        Inventory newInventory = new Inventory(name, itemId, Quantity, price);
        Inventory temp = head;
        int i = 0;
        while(temp!=null && i<position-1){
            i++;
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Position not found");
        }else{
            newInventory.next = temp.next;
            temp.next = newInventory;
        }
    }
    void display(){
        Inventory temp = head;
        while(temp!=null){
            System.out.println("Name: "+temp.name+" ItemId: "+temp.itemId+" Quantity: "+temp.Quantity+" Price: "+temp.price);
            System.out.println("******* next node *******");
            temp = temp.next;
        }
    }
    void remove(int itemId){
        Inventory temp = head;
        Inventory prev = null;
        while(temp!=null && temp.itemId!=itemId){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Item not found");
            return;
        }
        if(temp.next==null) prev.next = null;
        else prev.next = prev.next.next;
    }
    void update(int itemId,int Quantity){
        Inventory temp = head;
        while(temp!=null && temp.itemId!=itemId){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Item not Found");
        }else{
            temp.Quantity = Quantity;
        }
    }
    void searchByName(String name){
        Inventory temp = head;
        while(temp!=null && !temp.name.equals(name)){
            temp = temp.next;
        }
        if(temp!=null){
            System.out.println("******** Item Found ********");
            System.out.println("Name: "+temp.name+" ItemId: "+temp.itemId+" Quantity: "+temp.Quantity+" Price: "+temp.price);
        }
    }
    void searchByitemId(int itemId){
        Inventory temp =head;
        while(temp!=null && temp.itemId!=itemId){
            temp = temp.next;
        }
        if(temp!=null){
            System.out.println("******** Item Found ********");
            System.out.println("Name: "+temp.name+" ItemId: "+temp.itemId+" Quantity: "+temp.Quantity+" Price: "+temp.price);
        }
    }
    int TotalSum(){
        Inventory temp =head;
        int sum = 0;
        while(temp!=null){
            sum += temp.price * temp.Quantity;
            temp = temp.next;
        }
        return sum;
    }
    void sort() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        boolean swapped;
        for (Inventory i = head; i != null; i = i.next) {
            swapped = false;
            Inventory current = i;
            Inventory next = current.next;

            while (next != null) {
               if (current.price > next.price) {
                   int tempPrice = current.price;
                   current.price = next.price;
                   next.price = tempPrice;

                   String tempName = current.name;
                   current.name = next.name;
                   next.name = tempName;

                   int tempItemId = current.itemId;
                   current.itemId = next.itemId;
                   next.itemId = tempItemId;

                   int tempQuantity = current.Quantity;
                   current.Quantity = next.Quantity;
                   next.Quantity = tempQuantity;

                   swapped = true;
                }
                next = next.next;
            }
            if (!swapped) {
               break;
            }
        }
    }
}
public class InventoryManagementSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryList list = new InventoryList();
        list.addAtBeginning("Chashma", 1, 10, 100);
        list.addAtBeginning("bag", 2, 1, 1000);
        list.addAtEnd("Shoes", 3, 5, 500);
        list.addAtPosition(1, "Bottle", 4, 2, 200);
        list.display();

        System.out.println("Enter ItemId to remove");
        list.remove(sc.nextInt());
        System.out.println("*********After Deletion**********");
        list.display();

        System.out.println("Enter ItemId to update Quantity");
        int itemId = sc.nextInt();
        System.out.println("Enter new Quantity");
        int Quantity = sc.nextInt();
        list.update(itemId, Quantity);
        System.out.println("*********After Updation**********");
        list.display();

        System.out.println("Enter Item Name to search");
        list.searchByName(sc.next());

        System.out.println("Enter ItemId to search");
        list.searchByitemId(sc.nextInt());

        System.out.println("Total Sum of Inventory: "+list.TotalSum());

        list.sort();
        System.out.println("*********After Sorting**********");
        list.display();
    }
}
