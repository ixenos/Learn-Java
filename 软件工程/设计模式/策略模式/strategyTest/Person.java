

public class Person{
	private int ID;
	private String name;
	private int age;
	
	public Person(){
		this.ID = 0;
		this.name = null;
		this.age = 0;
	}
	
	public Person(int ID,String name,int age){
		this.ID = ID;
		this.name = name;
		this.age = age;
	}

	
	public int getID(){
		return ID;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}

	@Override
	public String toString() {
		//return "Person [ID=" + ID + ", name=" + name + ", age=" + age + "]";
		return ID + name;
	}
	
	
}