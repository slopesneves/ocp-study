public class PassingParameter {
	public static void main(String... args) {
		System.out.println("success to execute main method with the following parameters");
		for (String arg : args) {
			System.out.println(arg);
		}
	}
}