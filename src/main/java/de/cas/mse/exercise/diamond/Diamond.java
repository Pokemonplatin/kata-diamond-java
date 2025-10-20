package de.cas.mse.exercise.diamond;

import java.util.Arrays;

public class Diamond {

	public String getDiamond(int diamondWidth) {
		if (diamondWidth <= 0 || diamondWidth % 2 == 0) {
			return null;
		}
		char[] centerLine = makeLine(diamondWidth, diamondWidth);
		StringBuilder builder = new StringBuilder(new String(centerLine));

		for (int oddLineIndex = diamondWidth - 2; oddLineIndex > 0; oddLineIndex -= 2) {
			char[] chars = makeLine(diamondWidth, oddLineIndex);
			builder.insert(0, chars);
			builder.append(chars);
		}
		return builder.toString();
	}

	private char[] makeLine(int diamondWidth, int stars) {
		int spaces = ((diamondWidth - stars) / 2);
		char[] chars = new char[spaces + stars + 1];
		
		fillLine(chars, stars, spaces);
		return chars;
	}

	private void fillLine(char[] chars, int stars, int spaces) {
		Arrays.fill(chars, 0, spaces, ' ');
		Arrays.fill(chars, spaces, spaces + stars, '*');
		chars[chars.length - 1] = '\n';
	}

}
