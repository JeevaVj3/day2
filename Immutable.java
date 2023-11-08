package day2;

public class Immutable {
	public static void main(String[] args) {
		String a = "Raja";
		a = "Ram";
		// System.out.println(a);
		a = "suriya";
		System.out.println(a);

		StringBuffer b = new StringBuffer("Shiva");
		b.append("Sakthi");
		System.out.println(b);
		StringBuilder c = new StringBuilder("Raja");
		c.append("Ram");
		System.out.println(c);

	}

}
