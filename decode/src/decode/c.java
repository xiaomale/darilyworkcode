package decode;

public class c {
	public static String a;
	public static final String b;
	public static final String c;
	public static final String d;
	public static final String e;
	public static final String f;
	public static final String g;
	public static final String h;
	public static final String i;
	public static final String j;
	public static final String k;
	public static final String l;
	public static final String m;
	public static final String n;
	public static final String o;
	public static final String p;
	public static final String q;
	public static final String r;
	public static final String s;
	public static String t;
	public static char S;
	static byte[] v0;
	static {

		a = a(new byte[] { 95, 96, 110, 121, 96, 86 });
		b = a(new byte[] { 100, 65, 79, 88, 68, 76, 6, 91, 71, 76 });
		c = a(new byte[] { 43, 5, 11, 28, 10, 5, 20, 66, 31, 3, 71 });
		d = a(new byte[] { 100, 78, 64, 87, 78, 9, 77, 70, 85, 67 });
		e = a(new byte[] { 116, 84, 90, 77, 78, 84, 19, 87, 92, 79, 73 });
		f = a(new byte[] { 57, 120, 36, 46, 36, 35, 50, 58, 120, 47, 53, 62,
				57, 120, 62, 48, 39, 62, 110 });
		v0 = new byte[29];
		v0[0] = 95;
		v0[1] = 5;
		v0[2] = 25;
		v0[3] = 25;
		v0[4] = 29;
		v0[5] = 87;
		v0[6] = 66;
		v0[7] = 66;
		v0[8] = 10;
		v0[9] = 67;
		v0[10] = 2;
		v0[12] = 1;
		v0[13] = 12;
		v0[14] = 2;
		v0[15] = 67;
		v0[16] = 14;
		v0[17] = 2;
		v0[19] = 66;
		v0[20] = 4;
		v0[21] = 10;
		v0[22] = 29;
		v0[23] = 66;
		v0[24] = 12;
		v0[25] = 29;
		v0[26] = 4;
		v0[27] = 66;
		v0[28] = 50;
		g = a(v0);
		h = a(new byte[] { 70, 43, 119, 125, 119, 112, 97, 105, 43, 104, 109,
				102, 43, 109, 99, 116, 104, 96, 42, 119, 107, 66 });
		i = a(new byte[] { 4, 33, 106, 111, 122, 111, 33, 98, 97, 109, 111, 98,
				33, 122, 99, 126, 33, 103, 105, 126, 98, 106, 32, 125, 97, 10 });
		j = a(new byte[] { 76, 20, 72, 66, 72, 79, 94, 86, 20, 87, 82, 89, 20,
				82, 92, 75, 93, 82, 67, 21, 72, 84, 119 });
		k = a(new byte[] { 67, 115, 56, 61, 40, 61, 115, 48, 51, 63, 61, 48,
				115, 40, 49, 44, 115, 53, 59, 44, 58, 53, 36, 114, 47, 51, 31 });
		l = a(new byte[] { 47, 67, 31, 21, 31, 24, 9, 1, 67, 10, 30, 13, 1, 9,
				27, 3, 30, 7, 67, 5, 11, 28, 5, 66, 6, 13, 30, 67 });
		m = a(new byte[] { 68, 121, 50, 55, 34, 55, 121, 58, 57, 53, 55, 58,
				121, 34, 59, 38, 121, 63, 49, 38, 63, 120, 60, 55, 36, 18 });
		n = a(new byte[] { 73, 77, 17, 27, 17, 22, 7, 15, 77, 4, 16, 3, 15, 7,
				21, 13, 16, 9, 77, 11, 5, 18, 17, 11, 76, 8, 3, 16, 43 });
		o = a(new byte[] { 81, 97, 42, 47, 58, 47, 97, 34, 33, 45, 47, 34, 97,
				58, 35, 62, 97, 39, 41, 62, 61, 39, 96, 36, 47, 60, 31 });
		v0 = new byte[18];
		v0[0] = 30;
		v0[1] = 87;
		v0[2] = 11;
		v0[3] = 1;
		v0[4] = 11;
		v0[5] = 12;
		v0[6] = 29;
		v0[7] = 21;
		v0[8] = 87;
		v0[10] = 26;
		v0[11] = 17;
		v0[12] = 22;
		v0[13] = 87;
		v0[14] = 86;
		v0[15] = 8;
		v0[16] = 29;
		v0[17] = 102;
		p = a(v0);
		q = a(new byte[] { 3, 13, 81, 91, 81, 86, 71, 79, 13, 90, 64, 75, 76,
				13, 12, 78, 81, 33 });
		r = a(new byte[] { 28, 28, 64, 74, 64, 71, 86, 94, 28, 81, 90, 93, 28,
				29, 82, 87, 90, 93, 47 });
		s = a(new byte[] { 106, 54, 106, 96, 106, 109, 124, 116, 54, 123, 112,
				119, 54, 55, 120, 117, 105, 113, 120, 115 });
		t = a(new byte[] { 66, 63, 44, 58, 50, 27 });
	}

	public static String a(byte[] arg7) {
		byte[] v2 = new byte[arg7.length - 2];
		byte[] v3 = new byte[] { arg7[0], arg7[arg7.length - 1] };
		System.arraycopy(arg7, 1, v2, 0, v2.length);
		int v0;
		for (v0 = 0; v0 < v2.length; ++v0) {
			v2[v0] = ((byte) (v2[v0] ^ v3[1]));
			v2[v0] = ((byte) (v2[v0] ^ v3[0]));
		}

		return new String(v2);
	}

	public static void main(String[] args) {
		S = S;
		v0 = new byte[7];
		v0[0] = 116;
		v0[1] = 67;
		v0[3] = 2;
		v0[4] = 23;
		v0[5] = 67;
		v0[6] = 23;

		System.out.println(a + ":a");
		System.out.println(b + ":b");
		System.out.println(c + ":c");
		System.out.println(d + ":");
		System.out.println(e + ":e");
		System.out.println(f + ":f");
		System.out.println(g + ":g");
		System.out.println(h + ":h");
		System.out.println(i + ":i");
		System.out.println(j + ":j");
		System.out.println(k + ":k");
		System.out.println(l + ":l");
		System.out.println(m + ":m");
		System.out.println(n + "n");
		System.out.println(o + ":o");
		System.out.println(p + ":p");
		System.out.println(q + ":p");
		System.out.println(r + ":r");
		System.out.println(s + ":s");
		System.out.println(t + ":t");
		System.out
				.println(a(new byte[] { 44, 95, 89, 82, 116, 69, 94, 70, 7 }));
		System.out.println(a(new byte[] { 51, 77, 79, 25, 76, 74, 30, 26, 74,
				78, 79, 29, 77, 64, 29, 64, 76, 75, 78, 72, 72, 73, 29, 78, 73,
				75 }));
		System.out.println(a(new byte[] { 6, 46, 48, 46, 33, 106, 107, 120, 33,
				96, 123, 98, 98, 46, 60, 48, 40, 63, 8 })
				+ ":u");
		System.out.println(a(v0));
		System.out.println(a(new byte[] { 46, 50, 117, 123, 108, 117, 50 }));
	}
}
