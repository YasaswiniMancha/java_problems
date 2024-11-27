package concepts.constructor.Default;

public class Main {
	
    public static void main(String args[]) {
    	
    	User u= new User();
    	System.out.println("Without default constructor");
    	u.setId(1);
    	u.setName("Yash");
    	System.out.println("id: "+u.getId());
    	System.out.println("name: "+u.getName());
    	
    	User2 u2= new User2();
    	u2.setId(1);
    	u2.setName("yashu");
    	System.out.println("id: "+u2.getId());
    	System.out.println("name: "+u2.getName());
    	
    }
}
