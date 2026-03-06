package Unit1;

public class ConsoleExample {

	public static void main(String[] args) {
		int count = 3;
		int code = 65;
		
		char ch = 'a';
		
		while (count != 0) {
			ch = (char) code;
			System.out.println("Ch: " + ch);
			code =+ 5;
			System.out.println("code: " + code);
			count--;
		}
	}
}
