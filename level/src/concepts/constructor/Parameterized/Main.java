package concepts.constructor.Parameterized;

public class Main {
	
    public static void main(String args[]) {
    	
    	User u= new User("Yash",1);
    	System.out.println(u.getId());
    	System.out.println(u.getName());
   
    	System.out.println("-----------o---------------");
    	
    	new ConstructorOverloading("pandey",2,34,true);
    	new ConstructorOverloading("yash",1);
        
    }
}
