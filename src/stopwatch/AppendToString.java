package stopwatch;

/**
 * Append character in String class for count times.
 * @author Sathira Kittisukmongkol
 */
public class AppendToString implements Runnable{
	//The maximum of the String loop.
	private int count;
	//For save the value of each loop.
	private String result;
	//For add character to String.
	private char add;

	/*
	 * Initialized constructor of AppendToString class.
	 * @param count , the maximum of the loop.
	 */
	public AppendToString(int count){
		this.count = count;
		this.add = 'a';
	}
	
	/*
	 * Add character until count times.
	 */
	public void run(){
		for(int i=0;i<count;i++){
			result = result + add;
		}
	}
	
	/*
	 * To show description of the task.
	 * @return The sentence for elapsed time.
	 */
	public String toString(){
		return ("Append "+count+" chars to String\nElapsed time ");
	}
	
}
