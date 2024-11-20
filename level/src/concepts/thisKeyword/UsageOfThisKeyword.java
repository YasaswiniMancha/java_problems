package concepts.thisKeyword;

public class UsageOfThisKeyword {
	
	
     int num = 30;
     public void print() {
    	 System.out.println("num:" + this.num);  //this keyword to refer current class instance variable
     }
     
     
     //this.yourMethodName() to invoke current class method.
      public void invokeThisMethod() {
    	 System.out.println("invoked current class method");
     }
     
     public void call() {
    	 //invokeThisMethod();
    	 this.invokeThisMethod();
    	 // But If you don't use this keyword, the compiler automatically adds this keyword while invoking the method. 
     }
     
     
     //to invoke the current class constructor using this()- constructor chaining
     public UsageOfThisKeyword() {
    	 this(10);
     }
     public UsageOfThisKeyword(int k) {
    	 System.out.println("constructor method called with value :"+k); 
     }
    
     
     //this to pass AS an argument in the method, It is mainly used in the event handling.
     int test=23;
     public void f1 () {
    	 System.out.println("it is f1");
    	 f2(this);
     }
     
     public void f2(UsageOfThisKeyword obj) {
    	 System.out.println("it is f2");
    	 System.out.println(obj.test);
     }
     
     
     
     
     
     //this keyword to refer to be used to return the current class instance
     //We can return this keyword as a statement from the method. 
     //In such a case, the return type of the method must be the class type (non-primitive). 
     void func1() {
    	 System.out.println("return using this");
     }
     
     UsageOfThisKeyword func2() {
    	return this;
     }
     
     public static void main(String args[]) {
    	 UsageOfThisKeyword u= new UsageOfThisKeyword();  //creating class instance and calling constructor
    	 u.print();  //variable invoke
    	 u.call();   //method invoke
    	 u.f1(); //this as argument
    	 
    	 UsageOfThisKeyword returnObj=  u.func2();
    	 returnObj.func1();
     }
}

//this keyword refer to 
//this: current class instance variable
//this: to invoke the current class method(implicitly)  this can be used to invoke the current class method. 
//this: to invoke the current class constructor, It is used to reuse the constructor. In other words, it is used for constructor chaining.
//this: to pass as an argument in the method
//this keyword can be used to return the current class instance from the method

