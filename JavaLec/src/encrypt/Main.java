package encrypt;

public class Main {
	public static void main(String[] args) {
		Aes256 aes256 = new Aes256();

		System.out.println(aes256.encrypt("seungjin kang"));
		System.out.println(aes256.decrypt("3GFqmJ01PGap3ulEUTmHTw=="));
	}
}
