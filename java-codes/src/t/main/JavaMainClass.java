package t.main;

import t.generics.GenericMethods;

public class JavaMainClass {

	public static void main(String[] args) {
		System.out.println("inside main method");
		String[] cities = { "Bengaluru", "Chennai" };
		Integer[] codes = { 12, 14, 15 };

		GenericMethods.print(cities);
		GenericMethods gm = new GenericMethods();
		gm.print(codes); // the static method print(Integer[]) from the type GenericMethods should be
							// accessed in a static way

	}

}

