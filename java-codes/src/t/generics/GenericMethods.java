package t.generics;

public class GenericMethods<E> {
	public static <E> void print(E[] list) {
		for (E e : list) {
			System.out.print(e + "\t");
		}
		System.out.println();
	}
}
