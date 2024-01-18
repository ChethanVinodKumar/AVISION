package Getapcs_Avision.Getapcs_Avision1;

public class Practice1 {

	public static void main(String[] args) {

		double up = 125;
		double f = 9;
		double d = 8;
		double moq = 34245;
		double reqQty = 21000;

		double f1 = up * (f / 100);
		double d1 = up * (d / 100);
		double lp = up + f1 + d1;

		System.out.println("f1 : " + f1 + "\n" + "d1 : " + d1 + "\n" + "lp1 : " + lp + "\n");

		double remainingQty = moq - reqQty;
		System.out.println("remainingQty : " + remainingQty);

		double moqCost = remainingQty * lp / reqQty;

		// Format moqCost to display only two decimal places
		String formattedMoqCost = String.format("%.2f", moqCost);

		System.out.println("moqCost : " + formattedMoqCost);

	}

}
