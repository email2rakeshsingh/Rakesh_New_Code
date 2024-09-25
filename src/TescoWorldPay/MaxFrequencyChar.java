package TescoWorldPay;
import java.util.HashMap;

public class MaxFrequencyChar {
	public static char getMaxFreqChar(String str) {
		HashMap<Character, Integer> freqMap = new HashMap<>();

		// Build frequency map
		for (char c : str.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}

		// Find the max frequency character
		char maxChar = ' ';
		int maxFreq = 0;
		for (char c : freqMap.keySet()) {
			if (freqMap.get(c) > maxFreq) {
				maxFreq = freqMap.get(c);
				maxChar = c;
			}
		}
		return maxChar;
	}

	public static void main(String[] args) {
		String str = "Google";
		System.out.println("Character with max frequency: " + getMaxFreqChar(str));
	}
}
