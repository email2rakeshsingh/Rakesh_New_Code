package TescoWorldPay;

public class TESCO {

	public static void main(String[] args) {
		int[] arr = { 20, 10, 40, 30, 15, 50, 5 };
		int buyMin = arr[0]; // Assume the first element is the minimum buying price
		int totalProfit = 0;
		int totalLoss = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > buyMin) {
				// Calculate profit if the current price is greater than the buy price
				int profit = arr[i] - buyMin;
				totalProfit += profit;
				System.out.println("Bought at: " + buyMin + ", Sold at: " + arr[i] + ", Profit: " + profit);
			} else if (arr[i] < buyMin) {
				// If a lower price is encountered, calculate the loss
				int loss = buyMin - arr[i];
				totalLoss += loss;
				System.out.println("Bought at: " + buyMin + ", Sold at: " + arr[i] + ", Loss: " + loss);
				// Update the buyMin to the new lower value
				buyMin = arr[i];
			}
		}

		System.out.println("Total Profit: " + totalProfit);
		System.out.println("Total Loss: " + totalLoss);
	}

}
