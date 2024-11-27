package concepts.superKeyword;

public class Child extends UsageOfSuperKeyWord {
	
	public Child() {
		super();
	} //using super() method invoked the parent constructor

     public void details() {
		super.details(); 
	}  //using super() method invoked the parent method
	
	int num=70;
	public void method() {
    	System.out.println("child class num :" + num);
    	System.out.println("parent class num using super keyword: " + super.num);  //using super keyword, accessed the parent class variable.
    }
	
	
	
   public static void main(String atgs[]) {
	   
	   Child u= new Child();
	   u.method();  //for super keyword
	   u.details();  //for super() method- to invoke parent class method
	   
   }
}


//The super keyword in Java is a reference variable that is used to 
//1. super.yourVariableName refer to the immediate parent class object i.e, to refer the immediate class parent class instance variable
//2. super() method refers to invoke the immediate parent class constructor.
//3. super.yourMethodName() refers to the immediate parent class method.