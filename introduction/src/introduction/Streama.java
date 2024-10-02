package introduction;

import java.util.stream.Stream;

public class Streama {

	public static void main(String[] args) {

		System.out.println(Stream.of("aa", "as","dd").filter(s->s.startsWith("a")).count());
	}

}
