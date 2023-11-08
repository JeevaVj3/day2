package day2;

public class useexercise {
	public static void main(String[] args) {
		Exercise m = new Exercise();
		m.brand = "bmw";
		m.colour = "white";
		m.model = "BMW5675";
		m.price = 400000;
		System.out.println(m.brand + "," + m.colour + "," + m.model + "," + m.price);
		Exercise m1 = new Exercise();
		m1.brand = "Audi";
		m1.colour = "Red";
		m1.model = "AUDI8907";
		m1.price = 250000;
		System.out.println(m1.brand + "," + m1.colour + "," + m1.model + "," + m1.price);
		Exercise m2= new Exercise();
		m2.brand= "Toyota";
		m2.colour="Black";
		m2.model="TY5623";
		m2.price= 200000;
		System.out.println(m2.brand+","+m2.colour+","+m2.model+","+m2.price);
	
		String car1 = m.brand.toUpperCase();
		System.out.println(car1);
		String car2 = m1.brand.toLowerCase();
		System.out.println(car2);
		String all= m.brand.concat(m1.brand+m2.brand);
		System.out.println(all);
		
		int a= m.colour.length();
		System.out.println(a);
		char[] b = m1.colour.toCharArray();
		System.out.println(b[1]);
		String[] c= m2.colour.split("a");
		System.out.println(c[0]);
		System.out.println(c[1]);
		

	}
}
