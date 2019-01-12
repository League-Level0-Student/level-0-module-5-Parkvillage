
public class For_loop_gauntlet {

	// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		System.out.println("numbers from 100 to 0");
		for (int i = 100; i > 0; i--) {
			System.out.println(i);

		}
		System.out.println("numbers from 2 to 100 even");
		for(int i=2;i<=100;i+=2) {
     System.out.println(i);
		}
		System.out.println("numbers from 1 to 99 odd");
		for(int i=1; i<=99;i+=2) {
			System.out.println(i);
		}
		System.out.println("all numbers from 1 to 500 odd and even");
		for( int i=0;i<=500;i++) {
			if(i%2==0) {
				System.out.println(i+" is even");
			}else {
			System.out.println(i+" is odd");	
			}
			
		}
		System.out.println("multiples of 7 from 7 to 777");
		for( int i=0;i<=777;i+=7) {
			System.out.println(i);
		}
		System.out.println("age thoughout years");
		int age;
		for(int i=2007;i<=2018;i++) {
			age=i-2007;
			System.out.println(" in "+i+" i was "+age+" years old");
		}
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.println(i+ " "+j);
			}
		}
		for(int i=1; i<=7; i+=3) {
			System.out.print(i+" ");
			for(int j=i+1;j<=i+2; j++) {
				 
					System.out.print(j+" ");
				
			}
			System.out.println();
		}
		for(int i=1;i<=91;i+=10) {
			System.out.print(i+" ");
			for(int j=i+1; j<=i+9; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=21;i++) {
			System.out.print("*");
			for
		}
	}
}