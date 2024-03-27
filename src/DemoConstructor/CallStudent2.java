package DemoConstructor;

public class CallStudent2 {

	public static void main(String[] args) {
		
		//default 
		
		Student2 obj1 = new Student2();
		System.out.println(obj1.getName());
		
		
		//parameterized
		Student2 obj = new Student2(1,"Abhay",30);
		System.out.println("Student details:  "+" id:"+ obj.getId() + " Name: " + obj.getName() + " age: " + obj.getAge());
		

	}

}
