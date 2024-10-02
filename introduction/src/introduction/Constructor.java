package introduction;

public class Constructor {
	int modelYear;
	String modelName;

	public Constructor(int year, String name) {
		modelYear = year;
		modelName = name;

	}

	public static void main(String[] args) {
		Constructor c = new Constructor(2024, "BMW");
		System.out.println(c.modelYear + " " + c.modelName);

	}

}
