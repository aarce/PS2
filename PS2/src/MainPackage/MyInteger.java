package MainPackage;

public class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int GetValue() {
		return this.value;

	}

	public boolean isEven() {
		return value % 2 == 0;

	}

	public boolean isOdd() {
		return value % 2 != 0;
	}

	public boolean isPrime() {
		if (value % 2 == 0)
			return false;
		for (int i = 3; i * i <= value; i += 2) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int value) {
		if (value % 2 == 0)
			return false;
		for (int i = 3; i * i <= value; i += 2) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	private static boolean isEven(MyInteger MyInt) {
		return (MyInt.value % 2 == 0);
	}

	private static boolean isOdd(MyInteger MyInt) {
		return (MyInt.value % 2 != 0);
	}

	private static boolean isPrime(MyInteger MyInt) {
		return MyInt.isPrime(MyInt.GetValue());
	}

	public boolean equals(int number) {
		if (number == value) {
			return true;
		} else {
			return false;
		}
	}

	private boolean equals(MyInteger number) {
		if (number.value == value) {
			return true;
		} else {
			return false;
		}
	}

	public static int parseInt(char[] x) {
		int total = 0;

		for (int i = 0; i < x.length; i++) {
			total = x[i];
			total++;
		}

		return total;
	}

	public static int parseInt(String foo) {
		return foo.length();
	}

}
