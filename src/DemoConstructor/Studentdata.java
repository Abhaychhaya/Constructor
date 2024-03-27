package DemoConstructor;

public class Studentdata {
	
	private int rollno;
	
	  Studentdata(){
		  
		  rollno =500;
		 }
	  
	  Studentdata(int r)
	  
	  {
		  this();
		  rollno = rollno+r;
		  
	  }

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	  
	  
}
