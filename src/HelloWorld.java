public class HelloWorld{
	public static void main(String [] a){
		String s = "";
		while (!s.contains("quit")){
			s = Adder.getString();
			System.out.println(s);
		}
	}
}

