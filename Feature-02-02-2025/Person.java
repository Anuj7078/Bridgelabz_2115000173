public class Person{
    private int Age;
    private String Name;
    public Person(int Age, String Name) {
        this.Age = Age;
		this.Name = Name;
    }
    public Person(Person person) {
        this.Age = person.Age;
        this.Name = person.Name;
    }
    public String getName() {
        return Name;
    }
	public int getAge() {
        return Age;
    }
    public void setDetails(int Age, String Name) {
        this.Age = Age;
        this.Name = Name;
    }
    public static void main(String[] args) {
        Person person1 = new Person(21,"Anuj");
        Person person2 = new Person(person1);
        
        System.out.println("Person 1: Name = " + person1.getName()+" "+"Age:"+person1.getAge());
        System.out.println("Person 2: Name = " + person2.getName()+" "+"Age:"+person2.getAge());

		person2.setDetails(23,"Abhishek");
	    System.out.println("Person 2: Name = " + person2.getName()+" "+"Age:"+person2.getAge());

    }
}