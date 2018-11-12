import org.apache.commons.lang3.time.StopWatch;
import java.util.Scanner;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class SW1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
				
		StopWatch myStopWatch = new StopWatch();
		
		long P1=0, P2=0, PA, PT;
		
		System.out.println("Press a key & ENTER to let P1 START");
		
		keyboard.next();
		
		myStopWatch.start();
		//performLengthyProcess();
		
		System.out.println("P1 is Running!");
		System.out.println("Press a key to SWTICH to P2");
		keyboard.next();
		System.out.println("P1 time elapsed is: " + myStopWatch.getTime() + " milis");
		P1 = P1 + myStopWatch.getTime();
		PA = (P1 + P2)/2;
		PT = P1 + P2;		
		myStopWatch.reset();
		myStopWatch.start();
				
		System.out.println("P2 is running!" );
		System.out.println("Press a key to SWITCH to P1");
		keyboard.next();
		System.out.println("P2 time elapsed is: " + myStopWatch.getTime() + " milis");
		P2 = P2 + myStopWatch.getTime();
		PA = (P1 + P2)/2;
		PT = P1 + P2;		
		myStopWatch.reset();
		myStopWatch.start();
		
		System.out.println("P1 is running!" );
		System.out.println("Press a key to SWITCH to P2");
		keyboard.next();
		System.out.println("P1 time elapsed is: " + myStopWatch.getTime() + " milis");
		P1 = P1 + myStopWatch.getTime();
		PA = (P1 + P2)/2;
		PT = P1 + P2;		
		myStopWatch.reset();
		myStopWatch.start();
		
		System.out.println("P2 is running!" );
		System.out.println("Press a key to SWITCH to P1");
		keyboard.next();
		System.out.println("P2 time elapsed is: " + myStopWatch.getTime() + " milis");
		P2 = P2 + myStopWatch.getTime();
		PA = (P1 + P2)/2;
		PT = P1 + P2;		
		myStopWatch.reset();
		myStopWatch.start();
		
		System.out.println("P1 is running!" );
		System.out.println("Press a key to SWITCH to P2");
		keyboard.next();
		System.out.println("P1 time elapsed is: " + myStopWatch.getTime() + " milis");
		P1 = P1 + myStopWatch.getTime();
		PA = (P1 + P2)/2;
		PT = P1 + P2;		
		myStopWatch.reset();
		myStopWatch.start();
		
		System.out.println("P2 is running!" );
		System.out.println("Press a key to SWITCH to P1");
		keyboard.next();
		System.out.println("P2 time elapsed is: " + myStopWatch.getTime() + " milis");
		P2 = P2 + myStopWatch.getTime();
		PA = (P1 + P2)/2;
		PT = P1 + P2;		
		myStopWatch.reset();
				
		
		
		System.out.println("Succesfully stopped!");
		  
		System.out.println("Total Time P1 is: " + P1 + " milis");
		System.out.println("Total Time P2 is: " + P2 + " milis");
		System.out.println("Total Time PT is: " + PT + " milis");
		System.out.println("Averedge Time PA is: " + PA + " milis");
		long PD = 0;
		
		if (P1 > P2) {
			PD = P1 - P2;
			System.out.println("Player 2 has " + PD + " milis left to spend");
		}
		else {
			PD = P2 - P1;
			System.out.println("Player 1 has " + PD + " milis left to spend");
		}
			System.out.println("Press a key to start left over time");
			
			keyboard.next();
			myStopWatch.reset();
			myStopWatch.start();
			
			long Splitterino = 0; 
				
			
			while ( myStopWatch.getTime() < PD ) {
				
				
			}
			
			
			
			
//			while ( Splitterino <= PD ) {
//				
//				performLengthyProcess();
//				Splitterino = Splitterino + 100;
//		
//		}
			
//			do { 
//				performLengthyProcess();
//				Splitterino = Splitterino + myStopWatch.getTime();
//			}
//			
//			while ( Splitterino <= PD );
			
			myStopWatch.stop();
			keyboard.close();
			System.out.println("P has used delta of " + myStopWatch.getTime());
			System.out.println("TIME IS UP! GAME OVER");
					
				
		}
		
		
		
	
	
	private static void performLengthyProcess() {
		try {
			Thread.sleep(100); //	0.1 sec delay
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 } 
	

	
}

/* 
 * ---------constructor----------
 * public StopWatch()
 * ---------Method ----------
 * 
 *   ==========void=========
 * reset()
 * resume()
 * split()
 * start()
 * stop()
 * suspend()
 * ==========long============
 * getSplitTime()
 * getStartTime()
 * getTime()
 * =========string===========
 * toSplitString()
 * toString()
 * unsplit()
 * 
 * public void start()
 * This method starts a new timing session, clearing any previous values
 * throws: IllegalStateException (if the StopWatch is already running)
 * 
 * public void stop()
 * This method ends a new timing session, allowing the time to be retreived.
 * throws: IllegalStateException (if the stopwatch is not running)
 * 
 * public void split()
 * Split the time
 * This method sets the stop time of the watch to allow a time to be extracted. 
 * The start time is unaffected, 
 * enabling unsplit() to continue the timing from the original start point.
 * throws: IllegalStateException (if the StopWatch is not running)
 * 
 * public void unsplit()
 * Split the time
 * This method sets the stop time of the watch to allow a time to be extracted.
 * The start time is unaffected,
 * enabling unsplit(). to continue the timing from the original start point.
 * throws: IllegalStateException (if the StopWatch is not running)
 * 
 * public void suspend()
 * This method suspends the watch until it is resumed. 
 * The watch will not include time between the suspend 
 * and resume calls in total time.
 * Throws: IllegalStateException if the StopWatch is not currently running
 * 
 * public void resume()
 * This method resumes the watch after it was suspended. 
 * The watch will not include time between the suspend 
 * and resume calls in the total time.
 * throws: IllegalStateException: if the stopwatch has not been suspended.
 * 
 * public long getTime()
 * This is either the time between the start and the moment this method is called,
 * or the amount of time between start and stop.
 * Returns: the time in milliseconds
 * 
 * public long getSplitTime()
 * This is the time between start and latest split
 * Returns: the split time in milliseconds.
 * Throws: IllegalStateException: if the StopWatch has not yet been split.
 * 
 * public long getStartTime()
 * Returns: the time this stopwatch was started.
 * Throws:
 * 
 * public String toString()
 * get a summary of the time that the stopwatch recorded as a string
 * format used is ISO8601-like hours:minutes:seconds.miliseconds.
 * overrides: toString in class Object
 * returns: the time as a String
 * 
 * public String toSplitString()
 * Gets a summary of the split time that the stopwatch recorded as a string
 * The format used is ISO8601-like, hours:minutes:seconds.milliseconds.
 * Returns: the split time as a string
  */

/* Java timer stuff  
 * java.util.Timer
 * java.util.concurrent.ScheduleExecutorService
 * Timer class
 * TimeTask
 * FX --> TimeLine & Animation & KeyFrames & CycleDurationProperty
 * Animation.play()
 * Animation.playFromStart()
 * 
 * dus met een loop kan je een display in een timeline laten tellen. i++ en display i met 
 * een cycleduration van 1 seconde.
 * 
 */ 
