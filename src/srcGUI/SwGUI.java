package srcGUI;
import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.text.Font;

public class SwGUI {

	 





		public BorderPane swBorder() {
			
			BorderPane stopwatchborder = new BorderPane();
			
			Text wahoo = new Text("Woopdie Fucking Doo");
			wahoo.setFont(Font.font("Arial", FontWeight.BOLD, 60));
			stopwatchborder.setTop(wahoo);
//			stopwatchborder.setTop(addTop());
			stopwatchborder.setLeft(addLeft());
			stopwatchborder.setCenter(addCenter());
			stopwatchborder.setRight(addRight());
			stopwatchborder.setBottom(addBottom());
					
			return stopwatchborder;  
		}
		
		
		public VBox addLeft() {
		    VBox vbox = new VBox();
		    vbox.setPadding(new Insets(10));
		    vbox.setSpacing(8);

		    return vbox;
		}
		
		public VBox addCenter() {
		    VBox vbox = new VBox();
		    vbox.setPadding(new Insets(10));
		    vbox.setSpacing(8);

		    return vbox;
		}
		
		public VBox addRight() {
		    VBox vbox = new VBox();
		    vbox.setPadding(new Insets(10));
		    vbox.setSpacing(8);

		    return vbox;
		}
		
		public VBox addBottom() {
		    VBox vbox = new VBox();
		    vbox.setPadding(new Insets(10));
		    vbox.setSpacing(8);

		    return vbox;
		}
		
		
		
	}
	 

