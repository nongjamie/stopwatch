package stopwatch;

//import DecimalFormat package to set output to be 6 decimal digits.
import java.text.DecimalFormat;

/**
 * The TaskTimer class is to control the direction of each task.
 * @author Sathira Kittisukmongkol
 */
public class TaskTimer {
	//Stopwatch object to start and stop the time.
	Stopwatch sw = new Stopwatch();
	//DecimalFormat object to set output to be 6 decimal digits.
	DecimalFormat formatter = new DecimalFormat("#0.000000");
	
	/*
	 * Constructor of TaskTimer class.
	 */
	public TaskTimer(){
		
	}
	
	/*
	 * This is measureAndPrint method .
	 * To control the direction of each task.
	 */
	public void measureAndPrint(Runnable runnable){
		//To start timer.
		sw.start();
		
		runnable.run();
		
		//To stop timer.
		sw.stop();
		
		//Print the toString method.
		System.out.print(runnable);
		
		//Print the elapsed time with 6 decimal digits.
		System.out.println(formatter.format(sw.getElapsed())+" sec");
		
		//Space the line for easy to read.
		System.out.println("");
	}
	
}
