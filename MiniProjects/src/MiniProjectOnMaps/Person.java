package MiniProjectOnMaps;

public class Person {

	String name;
	int age;
	String city;
	public Person(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	
	public Person() {
		super();
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
}
