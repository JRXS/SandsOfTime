package srcEntry;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;




public class EntryNAMES {
//	int nrOfPlayers;
// MAT!!	TTTmain main= null;
	
//	public void setNrOfPlayers(int nrOfPlayers) {
//		this.nrOfPlayers = nrOfPlayers;
//	}

	public FlowPane enterName() {
		FlowPane fillname = new FlowPane();
		
		Text nameText = new Text("een hele dikke vinger!");
		fillname.getChildren().addAll(nameText);
// MAT!!		for (int i = 0; i < main.nrOfPlayers; i++) { }
		return fillname;
		}
		
		
	}

		
	/*	for (int i = 0; i < nrOfPlayers; i++) { 
			HBox nameLine = new HBox();
			Text nameText = new Text("enter name of player " +(i+1));
			nameText.setFont(Font.font("Arial", FontWeight.BOLD, 14));
			
			TextField enterName = new TextField();
			enterName.setEditable(true);
			enterName.setFont(Font.font("Arial", FontWeight.BOLD, 14));
			int k = i;
			
			Button nameButton = new Button("accept");
			nameButton.setPrefSize(100, 20);
			nameButton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					
		//		db[k].name = enterName.getEditor().getText();
		db[k].name = enterName.getText();
		
				}  
			});  
			
		   nameLine.getChildren().addAll(nameText, enterName, nameButton);
		   fillname.getChildren().addAll(nameLine);
			
		}
		
		
		return fillname;
	}
	
	
}
*/
