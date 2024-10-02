package introduction;

public class StringDemoBuffer {

	public static void main(String[] args) {

		
		String a = "hello";//these are literals non mutable
		String s = new String("hello");//these are literals non mutable
		
		StringBuffer sb = new StringBuffer("abcde");//these are mutable
		System.out.println(sb.append("fghij"));
		System.out.println(sb.insert(3," anguel "));
		System.out.println(sb.replace(3, 7, " aaaaa "));
		System.out.println(sb.deleteCharAt(19));
		System.out.println(sb.reverse());




		
	}

}
