package wsjava;

public class WS01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'A';
		
		for(int i = 0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
		
		System.out.println();
		
		a = 'A';
		
		for(int i = 0; i<5; i++) {
			
			for(int j=1; j < 5-i; j++) {
				System.out.print("  ");
			}
			
			for(int j=0; j<i+1; j++) {
				System.out.printf("%2c", a);
				a++;
			}
			System.out.println();
		}
		
		System.out.println();
		
	}

}