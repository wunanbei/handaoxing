package com.at.heart;

public class Test {

	public static void main(String[] args) {

		heart(15, 0.9, "love");
		
		for (int i = 0; i < 10; i++,inHeart(3, 3, 3)) {
			System.out.println(1);
		}
	}

	private static void heart(int r, double size, String req) {
		size = 1 / (1.5 * r * size);
		StringBuilder sb = new StringBuilder();
		for (int y = r; y > -r; y--, sb.append("\n"))
			for (int x = -2 * r; x < 2 * r; x++) {
				char msg = (req + req).charAt((x - y) % req.length() + req.length());
				sb.append((inHeart(size, x, y) ? msg + " " : "  ")); 
			}
		System.err.println(sb.toString());
//		System.out.println(sb.toString());
	}

	private static boolean inHeart(double size, int x, int y) {
		return Math.pow(Math.pow(x * size, 2) + Math.pow(y * 2 * size, 2) - 1, 3)
				- Math.pow(x * size, 2) * Math.pow(y * 2 * size, 3) <= 0;
	}

}
