
public class ExceptionHandlingExample {
	public static void main(String[] args) {
		try {
			String s = "Hellohslpimbgyjkoqwsfghj";
			try {
				System.out.println(s.charAt(20));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hello sunil");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello sunil");
	}

}
