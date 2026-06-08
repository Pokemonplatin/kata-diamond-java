package de.cas.mse.exercise.diamond;

import java.util.Arrays;

public class Diamond {

	public String generateStringOrNull(int diamondWidth) {
		if (diamondWidth <= 0 || diamondWidth % 2 == 0) {
			return null;
		}
		String middleLine = generateLine(diamondWidth, diamondWidth);
		StringBuilder builder = new StringBuilder(middleLine);
		for (int currentIdxFromCenter = 1; currentIdxFromCenter <= (diamondWidth / 2); currentIdxFromCenter++) {
			int currentDiamondWidth = diamondWidth - (currentIdxFromCenter * 2);
			String currentLine = generateLine(diamondWidth, currentDiamondWidth);
			builder.insert(0, currentLine);
			builder.append(currentLine);
		}
		return builder.toString();
	}

	private String generateLine(int maximumWidth, int currentWidth) {
		int leftPadding = ((maximumWidth - currentWidth) / 2);
		char[] chars = new char[leftPadding + currentWidth + 1];
		if (leftPadding > 0) {
			Arrays.fill(chars, 0, leftPadding, ' ');
		}
		Arrays.fill(chars, leftPadding, leftPadding + currentWidth, '*');
		chars[chars.length - 1] = '\n';
		return new String(chars);
	}
}
