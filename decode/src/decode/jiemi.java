package decode;

public class jiemi {
	public static String[] l;

	static {
		l = new String[67];
	}

	public static void main(String[] args) {
		System.out.println(a(new int[] { 33, 45, 45, 41, 55, 54, 54, 26, 41,
				34, 53, 58, 57, 57, 57, 44, 46, 53, 28, 40, 38, 54, 30, 43, 43,
				40, 43, 17, 30, 41, 40, 43, 45, 0, 41, 34, 53, 41, 33, 41 }));
	}

	public static String a(int[] params) {
		if (l == null) {
			l = new String[67];
			initLetter();
		}

		if (l.length > 0 && l[0] == null) {
			initLetter();
		}

		String v1 = "";
		int v0;
		for (v0 = 0; v0 < params.length; ++v0) {
			v1 = String.valueOf(v1) + l[params[v0]];
		}

		return v1;
	}

	public static void initLetter() {
		int v4 = 26;
		int v0;
		for (v0 = 0; v0 < v4; ++v0) {
			l[v0] = String.valueOf(((char) (v0 + 65)));
		}

		for (v0 = 0; v0 < v4; ++v0) {
			l[v0 + 26] = String.valueOf(((char) (v0 + 97)));
		}

		for (v0 = 0; v0 < 10; ++v0) {
			l[v0 + 57] = String.valueOf(((char) (v0 + 48)));
		}

		l[52] = String.valueOf('-');
		l[53] = String.valueOf('.');
		l[54] = String.valueOf('/');
		l[55] = String.valueOf(':');
		l[56] = String.valueOf('_');
	}

}
