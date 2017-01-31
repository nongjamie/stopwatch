package stopwatch;

//import IOException and BigDecimal package to use it.
import java.io.IOException;
import java.math.BigDecimal;

/**
 * The Main class is to control the direction of all the tasks.
 * @author Sathira Kittisukmongkol
 */
public class Main {
	/** Initialize TaskTimer object to run and measure run time */
	static TaskTimer timer = new TaskTimer();

	/**
	 * Run the tasks.
	 */
	public static void main(String[]args) throws IOException {
		// same task but with a larger string size (append more chars)
		Main.testAppendToString(50000);
		// do the same thing using StringBuilder.
		Main.testAppendToStringBuilder(50000);

		Main.testAppendToString(100000);
		Main.testAppendToStringBuilder(100000);

		// Use a large loop count for floating point tests in order to get accurate times
		Main.testSumDoublePrimitive(1000000000);
		Main.testSumDouble(1000000000);
		Main.testSumBigDecimal(1000000000);
	}

	/**
	 * task 1: append chars to a string.
	 */
	public static void testAppendToString(int count){
		AppendToString appendToString = new AppendToString(count);
		timer.measureAndPrint(appendToString);
	}

	/**
	 * task 2: append chars to a StringBuilder
	 */
	public static void testAppendToStringBuilder(int count){
		AppendToStringBuilder appendToStringBuilder = new AppendToStringBuilder(count);
		timer.measureAndPrint(appendToStringBuilder);
	}

	/**
	 * task 3: add double primitives from an array.
	 * You need a large counter value to get a measurable time.
	 */
	public static void testSumDoublePrimitive(int count) {
		SumDoublePrimitive sdp = new SumDoublePrimitive(count);
		timer.measureAndPrint(sdp);
	}

	/**
	 * task 4: add Double objects from an array.
	 * You need a large counter value to get a measurable time.
	 */
	public static void testSumDouble(int count) {
		SumDouble sumDouble = new SumDouble(count);
		timer.measureAndPrint(sumDouble);
	}

	/**
	 * task 5: add BigDecimal objects from an array.
	 * You need a large counter value to get a measurable time.
	 */
	public static void testSumBigDecimal(int count) {
		SumBigDecimal sumBigDecimal = new SumBigDecimal(count);
		timer.measureAndPrint(sumBigDecimal);
	}
}
