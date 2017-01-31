package stopwatch;

/**
 * Append character in StringBuilder class for count times.
 * @author Sathira Kittisukmongkol
 */
public class AppendToStringBuilder implements Runnable{
	//The maximum of StringBuilder loop.
	private int count;
	//The new object that has nothing.
	StringBuilder result = new StringBuilder("");
	//For add character to result.
	private char add;
	
	/*
	 * Initialized constructor of AppendToStringBuilder class.
	 * @param The maximum of this loop.
	 */
	public AppendToStringBuilder(int count){
		this.count = count;
		this.add = 'a';
	}
	
	/*
	 * Add character for count times.
	 */
	public void run(){
		for(int i=0;i<count;i++){
			result.append(add);
		}
	}
	
	/*
	 * To show description of the task.
	 * @return The sentence for elapsed time.
	 */
	public String toString(){
		return ("Append "+count+" chars to StringBuilder\nElapsed time ");
	}
	
}
