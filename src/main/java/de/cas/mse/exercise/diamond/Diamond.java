package de.cas.mse.exercise.diamond;

public class Diamond {

	private static final String DIAMOND_SYMBOL = "*";

	public String print(int width) {
		if (isInvalidWidth(width)) {
			return null;
		}

		StringBuilder builder = new StringBuilder();

		appendUpperHalf(width, builder);
		appendMiddleLine(width, builder);
		appendLowerHalf(width, builder);

		return builder.toString();
	}

	private void appendUpperHalf(int width, StringBuilder builder) {
		for (int symbolCount = 1; symbolCount < width; symbolCount += 2) {
			var line = createSymbolsLine(symbolCount, width);
			builder.append(line);
		}
	}

	private void appendMiddleLine(int width, StringBuilder builder) {
		var middleLine = createSymbolsLine(width, width);
		builder.append(middleLine);
	}

	private void appendLowerHalf(int width, StringBuilder builder) {
		for (int symbolCount = width-2; symbolCount >= 1; symbolCount -= 2) {
			var line = createSymbolsLine(symbolCount, width);
			builder.append(line);
		}
	}

	private String createSymbolsLine(int symbolCount, int width) {
		int leftPaddingCount = ((width - symbolCount) / 2);
		return " ".repeat(leftPaddingCount) + DIAMOND_SYMBOL.repeat(symbolCount) + "\n";
	}

	private boolean isInvalidWidth(int width) {
		return width <= 0 || width % 2 == 0;
	}

}
