package stopwatch;

/**
 * The Stopwatch class is to count the time.
 * @author Sathira Kittisukmongkol
 */
public class Stopwatch {
	//Constant to change from nanoseconds to seconds.
	private static final double NANOSECONDS = 1.0E-9;
	//Save the time that task start.
	private long startTime;
	//Save the time that task stop.
	private long stopTime;
	//Save the status of the Stopwatch.
	private boolean isRun;

	/*
	 * Initialized constructor of Stopwatch class.
	 */
	public Stopwatch(){
		this.isRun = false;
	}
	
	/*
	 * To get the elapsed time.
	 */
	public double getElapsed(){
		if(isRunning()){
			return (System.nanoTime() - startTime)*(NANOSECONDS) ;
		}
		else{
			return (stopTime - startTime) * NANOSECONDS;
		}
	}
	 /*
	  * To get the status of Stopwatch.
	  * @return status of Stopwatch.
	  */
	public boolean isRunning( ) { 
		return isRun; 
	}
	
	/*
	 * Start the Stopwatch.
	 * Save the start time into startTime.
	 * Set isRun to true so that Stopwatch is on.
	 */
	public void start( ) {
		this.startTime = System.nanoTime();
		this.isRun = true;
	}

	/*
	 * Stop the Stopwatch.
	 * Save the stop time into stopTime.
	 * Set isRun to false so that Stopwatch is off.
	 */
	public void stop(){
		this.stopTime = System.nanoTime();
		this.isRun = false ;
	}
	
}
