import java.util.Scanner;

public class Adder{ 
	
	Punkt[] punkt = new Punkt[9];
	
	public static String getString(){
		return new Scanner(System.in).nextLine();
	}

	public static void luffarChack(int x, int y){
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		// blabla fortsätt
		
		
		for(int i = 0; i < 3; i++){
			System.out.println("*    *     *");
		}
	}

}

class Punkt{
	int x;
	int y;
}