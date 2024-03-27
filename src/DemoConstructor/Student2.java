package DemoConstructor;
//Constructor Overloading
public class Student2 {
	
	private int id;
	private String name;
	private int age;
	//default constructor
	  Student2(){
		id = 15;
		name = "Rohit";
		age = 18;
	}
	   //creating a parameterized constructor  
    	 Student2(int i, String n, int a){
    		 
    		 id = i;
    		 name = n;
    		 age = a;
    	 }
    	//Getter and setter methods
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
    	 
    	
    	 
}
