package stopwatch;

/**
 * Add value in SumDoublePrimitive class for count times.
 * @author Sathira Kittisukmongkol
 */
public class SumDoublePrimitive implements Runnable{
	//The maximum of SumDoublePrimitive loop.
	private int count;
	//Array 500,000 arrays start from 1 to 500,000.
	double[] box = new double[500000];
	//For save value for each loop.
	double result = 0.0;
	
	/*
	 * Initialized constructor of SumDoublePrimitive class.
	 * For loop is to create n-th array to have n value.
	 * @param count , maximum of this loop.
	 */
	public SumDoublePrimitive(int count){
		this.count = count;
		for(int k=0;k<500000;k++){
			box[k] = new Double(k+1) ;
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
				j = 0;
			}
			result = result + box[j];
		}
		
	}
	
	/*
	 * To show description of the task.
	 * @return The sentence for elapsed time.
	 */
	public String toString(){
		return ("Sum array of double primitives with count =  "+count+"\nElapsed time ");
	}
}
