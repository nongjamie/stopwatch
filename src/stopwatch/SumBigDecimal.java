package stopwatch;

// import BigDeciaml package to use it.
import java.math.BigDecimal;

/**
 * Add value in SumDouble class for count times.
 * @author Sathira Kittisukmongkol
 */
public class SumBigDecimal implements Runnable{
	//The maximum round of the task loop.
	private int count;
	//Array 500,000 arrays , theirs value start from 1 to 500,000.
	BigDecimal[] box = new BigDecimal[500000];
	//For save value in each loop , its initialized value set to 0.0 . 
	BigDecimal value = new BigDecimal(0.0);
	
	/*
	 * Initialized constructor of SumBigDecimal class.
	 * For loop is to set the a-th array to have a value.
	 * @param count , the maximum round of the loop.
	 */
	public SumBigDecimal(int count){
		this.count = count;
		for(int a=0;a<500000;a++){
			box[a] = new BigDecimal(a+1) ;
		}
	}
	
	/*
	 * For loop is to run the task loop.
	 * variable c will control the loop for count times.
	 * variable b will determine the value of array box.
	 */
	public void run(){
		for(int b=0 , c=0 ; c<count ; b++ , c++){
			if(c>=500000){
				b=0 ;
			}
			value = value.add(box[b]) ;
		}
	}
	
	/*
	 * To show description of the task.
	 * @return The sentence for elapsed time.
	 */
	public String toString(){
		return ("Sum array of BigDecimal with count =  "+count+"\nElapsed time ");
}
	
}
