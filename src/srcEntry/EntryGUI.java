package srcEntry;

import org.apache.commons.lang3.time.StopWatch;

import javafx.application.*;
import javafx.concurrent.Task;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;
import java.util.concurrent.*;
import java.util.*;



public class EntryGUI {

	private int spinnervalue;
	
		public FlowPane entryBorder() {
		// BorderPane borderE = new BorderPane();

		FlowPane magnet = new FlowPane();

		VBox boxspin = new VBox();
		
		Text nrOfPlayersTitle = new Text("ENTER NR of Players");
		nrOfPlayersTitle.setFont(Font.font("Arial", FontWeight.BOLD, 14));
	
		Spinner<Integer> spin = new Spinner<Integer>(1, 20, 1);
		spin.setEditable(true);
		spin.setPrefSize(60, 20); 
		spin.setMinSize(60, 20); 
		
		Button nrOfPlayersOk = new Button("GO! Numers!");
		nrOfPlayersOk.setPrefSize(100, 20);
		
		nrOfPlayersOk.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

			setSpinnervalue(Integer.valueOf(spin.getEditor().getText()));	
		//	 spinnervalue = Integer.valueOf(spin.getEditor().getText());
				System.out.println("dit is de spinnervalue: " + spinnervalue);	
				
				int spinnertest = Integer.valueOf(spin.getEditor().getText());
				setSpinnervalue(spinnertest);
				System.out.println("dit is de spinnervalue met spinnertest method etc " + spinnervalue);
				
				
				
				
			}
		});

		boxspin.getChildren().addAll(nrOfPlayersTitle, spin, nrOfPlayersOk);
		
		magnet.getChildren().addAll(boxspin);
	
		// borderE.setLeft(magnet);
		
		return magnet; 
	} 
		 
		public int getSpinnervalue() { 
		      return this.spinnervalue;
		    }
		
		public void setSpinnervalue(Integer value)	{
			if (value < 1 || value > 20) {
		        throw new IllegalArgumentException();
		    }
		     //include more logic
		     this.spinnervalue = value;
		}
		 
		
	
}


/*                     *********** OLD BUTTON SPAGHETTI ********


Button nrOfPlayersOk = new Button("GO! Numers!");
nrOfPlayersOk.setPrefSize(100, 20);
nrOfPlayersOk.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent event) {

	
//			Player player = new Player();
		int spinnervalue = Integer.valueOf(spin.getEditor().getText());
		
//		player.setEntryPlayer(spinnervalue);
		
		magnet.getChildren().clear();
		
		
		for (int i = 0; i < spinnervalue; i++) {
			int index = i;
			int playernumber = i + 1;

			HBox nameboxlooped = new HBox();
			nameboxlooped.setPadding(new Insets(10));
			nameboxlooped.setSpacing(8);

			Text nameOfPlayersTitle = new Text("ENTER name of Player " + (i + 1));
			nameOfPlayersTitle.setFont(Font.font("Arial", FontWeight.BOLD, 14));
			TextField inputname = new TextField();
			Label namecheck = new Label();

			Button acceptname = new Button("Accept Name!");
			acceptname.setPrefSize(100, 20);
			acceptname.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					arrayNames[index] = inputname.getText();
					namecheck.setText("P" + playernumber + " saved as: " + arrayNames[index]);
					namecheck.setFont(Font.font("Arial", FontWeight.BOLD, 14));
				}
			});
			nameboxlooped.getChildren().addAll(nameOfPlayersTitle, inputname, acceptname, namecheck);
			magnet.getChildren().addAll(nameboxlooped);
		}

		HBox testbox = new HBox();
		Button buttontestarray = new Button("Test Array");
		buttontestarray.setPrefSize(100, 20);
		buttontestarray.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				for (int i = 0; i < entryPlayers; i++) {
					System.out.println(arrayNames[i]);
				}
			}
		});
		Button buttonresetentry = new Button("reset entry");
		buttonresetentry.setPrefSize(100, 20);
		buttonresetentry.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// alles clearen
				magnet.getChildren().clear();
				magnet.getChildren().addAll(NrOfPlayers);
				Arrays.fill(arrayNames, null);
			} 
		});

		Button buttonstartstopwatch = new Button("Go SW");
		buttonstartstopwatch.setPrefSize(100, 20);
		buttonstartstopwatch.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				magnet.getChildren().clear();
				magnet.getChildren().clear();

				Button buttonsecondclickstopwatch = new Button("Button of Doom");
				buttonsecondclickstopwatch.setFont(Font.font("Arial", FontWeight.BOLD, 60));
				buttonsecondclickstopwatch.setPrefSize(800, 400);
				buttonsecondclickstopwatch.setStyle("-fx-background-color: red;");
				buttonsecondclickstopwatch.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						magnet.getChildren().clear();
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!								
						// Mega Class?!?
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						SwGUI stopwatchborder = new SwGUI();
						magnet.getChildren().addAll(stopwatchborder.swBorder());
					}
				});
				magnet.getChildren().addAll(buttonsecondclickstopwatch);
			}
		});

		testbox.getChildren().addAll(buttonresetentry, buttontestarray, buttonstartstopwatch);
		magnet.getChildren().addAll(testbox);
	}
});

*/
