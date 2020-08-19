package com.hashmap.exercise;

public class EncodeString {

	public static void encodeString(String s) {
		StringBuilder sb = new StringBuilder();
		char[] c = s.toCharArray();
		int count = 0;
		char curr;

		for (int i = 0; i < c.length; i++) {
			curr = c[i];

			while (i < c.length && curr == c[i]) {
				count++;
				i++;

			}
			sb.append(curr).append(count);
			count = 0;
			i--;
		}

		System.out.println("Decode: " + sb.toString());
	}

	public static void decodeString(String s) {
		char[] c = s.toCharArray();
		int times = 0;
		char c1 = ' ';
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < c.length; i++) {
			if (Character.isDigit(c[i])) {

				times = Character.getNumericValue(c[i]);

				while (times > 0) {
					sb.append(c1);
					times--;
				}
			} else {
				c1 = c[i];

			}
		}

		System.out.println("Encode: " + sb.toString());
	}

	public static void main(String[] args) {
		EncodeString.encodeString("EEEAABBCaaacc");
		EncodeString.decodeString("E3A2B2C1a3c2");
	}
}
