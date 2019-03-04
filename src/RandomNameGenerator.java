import java.util.Random;

public class RandomNameGenerator {

	private static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String number = "12345674890";

	public static String gen(int length, GenType genType) {
		if (genType == GenType.LETTERS) {
			return generate(length, letters);
		}
		return generate(length, number);
	}

	private static String generate(int length, String letters) {
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < letters.length(); i++) {
			sb.append(letters.charAt(rand.nextInt(letters.length())));
		}
		return sb.toString();
	}
}
