package introduction;

public class AbstractChild extends AbstractClassParent {

	public static void main(String[] args) {

		AbstractChild acp = new AbstractChild();
		acp.methodOne();
		acp.emptyMethod();
}

	@Override
	public void emptyMethod() {
		System.out.println("Comes from parent and it is an empty method");
	}
}