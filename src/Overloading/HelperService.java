package Overloading;

public class HelperService {

	private static void formatNumber(int value) {
		//return String.format("%d", value);
		System.out.println(String.format("%d", value));
	}

	private String formatNumber(double value) {
		return String.format("%.3f", value);
	}

	private String formatNumber(String value) {
		return String.format("%.2f", Double.parseDouble(value));
	}

	public static void main(String[] args) {
		HelperService hs = new HelperService();
		//System.out.println(formatNumber(500));
		formatNumber(500);
		System.out.println(hs.formatNumber(89.9934));
		System.out.println(hs.formatNumber("550"));
	}
}
