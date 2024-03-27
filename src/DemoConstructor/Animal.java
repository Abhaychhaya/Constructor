package DemoConstructor;

//create Animal class which is base class of Animal
public class Animal {
	 // data member of Animal class
		String color = "blue";
}

//create child class of Animal  

class cat extends Animal{
	
	//defulat const
	cat()
	{
		 // data members of the Cat class 
		String color = "Green";
		System.out.println(super.color);//calling parent class data member 
		System.out.println(color);
	}
}

class superEx1 extends cat
{
	
	superEx1()
	{
		super();
		System.out.println("The sky is blue");
	}

}


