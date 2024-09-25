package INT_QUECTIONS_JAVA;

import java.security.PublicKey;

public class Removespace {

	public static void main(String[] args) {

		/*
		 * Remove space form given string Input String = “hello java Learning ” Output
		 * String = “hellojavaLearning”
		 */

		String str = "hello java Learning";

	String reString=str.replaceAll("\\s", "");
		System.out.println(reString);

	}

}
