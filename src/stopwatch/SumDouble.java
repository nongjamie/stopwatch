package stopwatch;

/**
 * Add value in SumDouble class for count times.
 * @author Sathira Kittisukmongkol
 */
public class SumDouble implements Runnable {
	// The maximum round of SumDouble loop.
	private int count;
	//Array 500,000 arrays , its value start from 1 to 500,000.
	Double[] box = new Double[500000];
	//For save the value in each loop , initialized value is 0.0 .
	Double result = new Double(0.0);
	
	/*
	 * Initialized constructor of SumDouble class.
	 * For loop is to set n-th array to have n value.
	 * @param count , the maximum round of SumDouble loop.
	 */
	public SumDouble(int count){
		this.count = count;
		for(int i=0;i<500000;i++){
			box[i] = new Double(i+1);
		}
	}
	
	/*
	 * For loop is to run the task loop.
	 * variable i will control the loop for count times.
	 * variable j will determine the value of array box.
	 */
	public void run(){
		for(int j=0 , i=0 ; i<count ; j++ , i++){
			if(i>=500000){
				j=0 ;
			}
			result = result + box[j];
		}
	}
	
	/*
	 * To show description of the task.
	 * @return The sentence for elapsed time.
	 */
	public String toString(){
		return ("Sum array of Double object with count =  "+count+"\nElapsed time ");
	}
}
