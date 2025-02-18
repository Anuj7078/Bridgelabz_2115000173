import java.util.*;
class WarehouseManagementSys{
	public static void main(String[]args){

		Storage<Electronics> el = new Storage<>();
		el.addItems(new Electronics("Tablet"));
		el.addItems(new Electronics("Mobile"));
		Storage.displayItems(el.getItems());
		System.out.println();

		Storage<Groceries> grocery = new Storage<>();
		grocery.addItems(new Groceries("Sugar"));
		grocery.addItems(new Groceries("Flour"));
		grocery.addItems(new Groceries("Snacks"));
		Storage.displayItems(grocery.getItems());
		System.out.println();

		Storage<Furniture> furniture = new Storage<>();
		furniture.addItems(new Furniture("Chair"));
		furniture.addItems(new Furniture("Sofa"));
		furniture.addItems(new Furniture("Bed"));
		Storage.displayItems(furniture.getItems());
	}
}
abstract class WarehouseItem{
	private String itemName;
	WarehouseItem(String itemName){
		this.itemName = itemName;
	}
	public String getItemName(){
		return itemName;
	}
}
class Electronics extends WarehouseItem{
	Electronics(String itemName){
		super(itemName);
	}
}
class Groceries extends WarehouseItem{
	Groceries(String itemName){
		super(itemName);
	}
}
class Furniture extends WarehouseItem{
	Furniture(String itemName){
		super(itemName);
	}
}

class Storage<T extends WarehouseItem>{
	private List<T> itemsList = new ArrayList<>();
	void addItems(T item){
		itemsList.add(item);
	}
	List<T> getItems(){
		return itemsList;
	}
	public static void displayItems(List<? extends WarehouseItem> list ){
		for(WarehouseItem item : list){
			System.out.println("Item Name: "+item.getItemName());
		}
	}
}