package DemoConstructor;

public class Ball {
	
	int price;
	String color;
	
	Ball(int p ,String c){
		
     this.color = c;
     this.price = p;
	}
       public static void main(String args[]) {
    	   
    	   Ball b = new Ball(20,"red");
    	   System.out.println("Color is = " + b.color + " Price is =  " + b.price );
    	   
    	   
       }
}
