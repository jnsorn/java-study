package techcourse.fp.mission;

import java.util.List;

public class Calculator {
	public static int sum(List<Integer> numbers, Conditional conditional) {
		return numbers.stream()
			.filter(number -> conditional.test(number))
			.mapToInt(Integer::intValue)
			.sum();
	}

	public static int sumAll(List<Integer> numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

	public static int sumAllEven(List<Integer> numbers) {
		int total = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				total += number;
			}
		}
		return total;
	}

	public static int sumAllOverThree(List<Integer> numbers) {
		int total = 0;
		return total;
	}
}
