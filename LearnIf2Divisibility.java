package week1.day1;

public class LearnIf2Divisibility {

	public static void main(String[] args) {
	
		int i=30;
		
		if(i%3 == 0 && i%5 == 0) {
			
			System.out.println("TRIZZ-FIZZ ");
		}
		
		else if(i%3 == 0){
			
			System.out.println("TRIZZ");
			
			}
		else if(i%5 == 0) {
			
			System.out.println("FIZZ");
		}
			
			

	}

}
