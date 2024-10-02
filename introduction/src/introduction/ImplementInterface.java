package introduction;

public class ImplementInterface implements InterfaceOne, InterfaceTwo {

	public static void main(String[] args) {
		InterfaceOne io = new ImplementInterface();
		InterfaceTwo it = new ImplementInterface();

		io.method1();
		io.method2();
		it.method3();
		it.methodOne();
		it.methodTwo();

	}

	@Override
	public void method1() {
		System.out.println("Metod1");
	}

	@Override
	public void method2() {
		System.out.println("Metod2");

	}

	@Override
	public void method3() {
		System.out.println("Metod3");

	}

	@Override
	public void methodOne() {
		System.out.println("MetodOne");

	}

	@Override
	public void methodTwo() {
		System.out.println("MetodTwo");

	}

}
