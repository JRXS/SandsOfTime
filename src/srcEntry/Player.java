package srcEntry;

import org.apache.commons.lang3.time.StopWatch;

import javafx.scene.text.Text;

public class Player {
	public String name;
	public int credits;
	public double gpa;
	public long timetotal;
	public long timesplit;
	public long timeleft;
//	public StopWatch sw; // = new StopWatch();
	public StopWatch sw = new StopWatch(); 
	public Text naamtekst = new Text(""+name);
	public Text displaytimer = new Text(""+sw.getTime());
	public boolean active = false;
	public boolean suspended = false;
	public boolean quit = false;
	
}


	
	
	
	
