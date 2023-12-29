
public class Student {
int id;
String name;
int marks;
String sec;

public Student(int id, String name, int marks, String sec) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
	this.sec = sec;
	System.out.println("In constructor");
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", sec=" + sec + "]";
}




}
