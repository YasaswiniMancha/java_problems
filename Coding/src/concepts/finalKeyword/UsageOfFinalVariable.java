package concepts.finalKeyword;

public class UsageOfFinalVariable {
     final int speedLimit= 90;
     void changeLimit() {
    	 //speedLimit=120;
    	 System.out.println("cannot change speed limit");
     }
     
     public static void main(String tryui[]) {
    	 UsageOfFinalVariable f= new UsageOfFinalVariable();
    	 f.changeLimit();
     }
}
