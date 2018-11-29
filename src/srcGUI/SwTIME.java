package srcGUI;

import org.apache.commons.lang3.time.StopWatch;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import srcEntry.Player;
import srcEntry.EntryGUI;
import srcEntry.EntryNAMES;
import srcGUI.SwGUI; 

public class SwTIME {
	public int nrOfPlayers;
	//public TTTmain;

	public <TTTmain> SwTIME(int nrOfPlayers, TTTmain main) {
		this.nrOfPlayers = nrOfPlayers;
		//SwTime.nrOfPlayers
	}


//	public FlowPane timetrack() {
//	
//		FlowPane topFlow = new FlowPane(); 
//		
//		for (int i = 0; i < nrOfPlayers; i++) {
//		System.out.println(db[i].name + " has got a quit status of " + db[i].quit);
//		
//		}
//		
//		new Thread() {
//			public void run() { 
//				for (int i = 0; i < 20000; i++) {
//					try {
//						Thread.sleep(1000);
//						} catch (InterruptedException ex)
//							{ex.printStackTrace();}
//					Platform.runLater(new Runnable() 
//					{public void run() { 
//						
//						sideFlow.getChildren().clear();
//						
//						for (int i = 0; i < nrOfPlayers; i++) {
//								int k = i;
//							
//								
//								Text sideText = new Text(db[i].name);
//								sideText.setFont(Font.font("Arial", FontWeight.BOLD, 28));
//								
//								Text sideTime = new Text();
//								sideTime.setFont(Font.font("Arial", FontWeight.BOLD, 28));
//								
//								
//								if (db[i].quit == false) {
//								sideTime.setText(""+db[i].sw.getTime()/1000);
//								
//								}
//								else if (db[i].quit == true){
//									sideTime.setText("RIP");
//									}
//								else {
//									System.out.println("We got a quit = false/true problem in de sideflow");
//								}
//								
//								
//								Button sideButton = new Button("Eject");
//								sideButton.setPrefSize(200, 30);
//								 
//								sideButton.setOnAction(new EventHandler<ActionEvent>() {
//										@Override
//										public void handle(ActionEvent event) {
//											
//											db[k].quit = true;
//											
//										}  
//									}); 
//								HBox sideBox = new HBox(sideText, sideTime, sideButton);
//								sideBox.setPadding(new Insets(15, 12, 15, 12));
//								sideBox.setSpacing(40);
//								sideFlow.getChildren().addAll(sideBox);
//							}
//							}
//					});
//			}}}.start();
//	
//		return topFlow;
}
