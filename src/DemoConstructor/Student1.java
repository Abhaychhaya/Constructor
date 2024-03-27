package DemoConstructor;

public class Student1 {
	int id;
	String name;
	//creating a parameterized constructor  
	Student1(int i,String n){
		
		id = i;
		name = n;
	}
	
	//method to display the values  
      void display() {
    	  
    	  System.out.println(id + " "+ name);
      }
      
      public static void main(String args[]) {
    	  //creating objects and passing values
    	  Student1 S1 = new Student1(111,"Abhay");
    	  //calling method to display the values of object  
    	  S1.display();
      }
}
