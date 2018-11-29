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

import srcEntry.Player;
import srcEntry.EntryGUI;
import srcEntry.EntryNAMES;
import srcGUI.SwGUI; 
import srcGUI.SwTIME;

public class TTTmain extends Application {

	public BorderPane borderE = new BorderPane();
	public int nrOfPlayers;
	public int nrOfQuitters;
	public int turnOfPlayer=0;
	public int turnOfModulus=0;
	srcEntry.EntryGUI startScreen = new srcEntry.EntryGUI();
	srcGUI.SwTIME timescreen = new srcGUI.SwTIME(5,this);
	public Player[] db = new Player[3];
	public int DWprotection = 0;
	//MAT!! EntryNAMES en = new EntryNAMES();
	
	public static void main(String[] args) {
		System.out.println(new TTTmain().timescreen.nrOfPlayers);

		launch(args);
	}
	// TODO Auto-generated method stub
	//	TODO random player starting order option
	// master vs citywork
	// en nog een keer....
	// GVD!!!!!!!!!!!!!!!!!
	// wtf ben ik mee bezig
	
	public void start(Stage myStage) throws Exception {

	//	Player[] db;
	//	db = new Player[3]; 
	//	ArrayList<String> alist = new ArrayList<String>();
	//	ArrayList<Player> db = new ArrayList<Player>();
		
		 db[0] = new Player();
		 db[0].name = "Esteban";
		 db[0].credits = 43;
		 db[0].gpa = 2.9;
	//	 db[0].sw = new StopWatch();
		 
		 db[1] = new Player();
		 db[1].name = "Dave";
		 db[1].credits = 15;
		 db[1].gpa = 4.0;
	//	 db[1].sw = new StopWatch();
		 
		 db[2] = new Player();
		 db[2].name = "Michelle";
		 db[2].credits = 132;
		 db[2].gpa = 3.72;
	//	 db[2].sw = new StopWatch();
		
		 for ( int i=0; i<db.length; i++ ) {
		 System.out.println("Name: " + db[i].name);
		 System.out.println("\tCredit hours: " + db[i].credits);
		 System.out.println("\tGPA: " + db[i].gpa + "\n");
		 }
		 
		 int maxLoc = 0;
		 
		 for ( int i=1; i<db.length; i++ )
		 if ( db[i].gpa > db[maxLoc].gpa )
		 maxLoc = i;
		
		 System.out.println(db[maxLoc].name + " has the highest GPA.");
			 
		 db[0].sw.start(); 
		 db[1].sw.start();
		 
		 performLengthyProcess();
		 
		 db[0].sw.stop();
		 db[0].timesplit = db[0].sw.getTime();
		 System.out.println(db[0].timesplit + " was the timesplit of lengthy process and of db[0] " + db[0].name);	
		 
		 performLengthyProcess();
		  
		 db[1].sw.stop();
		 db[1].timesplit = db[1].sw.getTime();
		 System.out.println(db[1].timesplit + " was the timesplit of db[1] " + db[1].name);
		 
		 Arrays.fill(db, null); 
		 System.out.println(" **** array null ***** ");
		 
		 db[0] = new Player();
		 db[0].name = "J"; 
		 db[0].credits = 666;
		 db[0].gpa = 2.666;
		 System.out.println(" array nulled got a new name:  " + db[0].name);
		 
		 db[1] = new Player();
		 db[1].name = "G"; 
		 db[1].credits = 777;
		 db[1].gpa = 2.777;
		 System.out.println(" array nulled got a new name:  " + db[1].name);
		  
		 db[2] = new Player();
		 db[2].name = "X";
		 db[2].credits = 888;
		 db[2].gpa = 3.888;
		 System.out.println(" array nulled got a new name:  " + db[2].name);
		 
		 
		 
		// BorderPane borderE = new BorderPane();
		// FlowPane magnet = new FlowPane();
		// borderE.getChildren().addAll(magnet);
 
		
		borderE.setLeft(startScreen.entryBorder());
		borderE.setBottom(addBottomEntryTestingConsole());
		
		// Scene myScene = new Scene(startScreen.entryBorder(), 800, 400);
		Scene myScene = new Scene(borderE, 800, 600);
		
		myStage.setScene(myScene);
		myStage.show();
		 
	}
	
	private static void performLengthyProcess() {
		try {
			Thread.sleep(1000); //	1 sec delay
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
	public HBox addBottomEntryTestingConsole() {
		 HBox hboxTestingConsole = new HBox(); 	
		 VBox vbox1 = new VBox();
		 vbox1.setPadding(new Insets(15, 12, 15, 12));
		 vbox1.setSpacing(10);
		 vbox1.setStyle("-fx-background-color: #336699;");
		 
		 Text bottomTitle = new Text("TESTIN CONSOLE");
		 bottomTitle.setFont(Font.font("Arial", FontWeight.BOLD, 20));	
		 
		 Button arrayprinter = new Button("Print Array");
		 arrayprinter.setPrefSize(200, 30);
		 
		 arrayprinter.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					
										
					for ( int i=0; i<db.length; i++ ) {
						 System.out.println("Name: " + db[i].name);
						 System.out.println("\tCredit hours: " + db[i].credits);
						 System.out.println("\tGPA: " + db[i].gpa + "\n");
						 System.out.println("\tTime played " + db[i].sw.getTime()/1000 + "\n");
						 }
					
				}   
			}); 
		 
		 
		// srcEntry.EntryGUI spinnershit = new srcEntry.EntryGUI();
		// int nrOfPlayers = spinnershit.getSpinnervalue();	
			 
		 
		  
	 
		// Text confirm = new Text("confirm this shit   " );
		// confirm.setFont(Font.font("Arial", FontWeight.BOLD, 14));	
		 
		
		 
		 Button lockin = new Button("Lockin Nr of Players and make Array");
		 lockin.setPrefSize(200, 30);
		 
		 lockin.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					
					
					nrOfPlayers = startScreen.getSpinnervalue();
		//MAT!!			en.setNrOfPlayers(nrOfPlayers);
					
				//	int gekgetal = 0;
				//	srcEntry.EntryGUI spinnersetshit = new srcEntry.EntryGUI();
				//	gekgetal = spinnersetshit.setSpinnervalue(25); 
					 
					
					
				//	int nrOfPlayers = spinnershit.getSpinnervalue();
					
					System.out.println("dit is nrOfPlayers en dus spinnervalue getter: " + nrOfPlayers);
				//	System.out.println("dit is de spinnervalue als ie em ziet" + spinnervalue);
				
					Arrays.fill(db, null); 
					db = new Player[nrOfPlayers]; 
					
					for (int i=0; i < nrOfPlayers; i++) {
						db[i] = new Player();
						db[i].name = ""+(i+1);
						db[i].credits = (int) ((Math.random()+i));
						db[i].gpa = (double) ((Math.random()+i)* Math.random());
					} 
					
					for ( int i=0; i<db.length; i++ ) {
						 System.out.println("Name: " + db[i].name);
						 System.out.println("\tCredit hours: " + db[i].credits);
						 System.out.println("\tGPA: " + db[i].gpa + "\n");
						 }
					
					
		/*			FlowPane nameFlow = new FlowPane();
					
					for (int i = 0; i < nrOfPlayers; i++) {
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
					   nameFlow.getChildren().addAll(nameLine);
						
					}
					
									
					
					borderE.setCenter(nameFlow);	
					*/		
				}	
				
			});    
		 
		 Button enternames = new Button("Press to enter player names");
		 enternames.setPrefSize(200, 30);
		 enternames.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					
					borderE.setRight(null);
					FlowPane nameFlow = new FlowPane();
					
					for (int i = 0; i < nrOfPlayers; i++) {
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
							nameLine.getChildren().removeAll(nameText, enterName, nameButton);
							TextField filledName = new TextField("P"+(k+1) +": "+ db[k].name);
							nameLine.getChildren().addAll(filledName);
							}  
						});  
						 
					   nameLine.getChildren().addAll(nameText, enterName, nameButton);
					   nameFlow.getChildren().addAll(nameLine);
						
					}
					
					borderE.setRight(nameFlow);			
					
	//				srcEntry.EntryNAMES fillinNames = new srcEntry.EntryNAMES();	
	//				borderE.setRight(fillinNames.enterName());
				}  
			}); 
		 
	/*	 Button arraystarter = new Button("Press to make array");
		 arraystarter.setPrefSize(200, 30);
		 
		 arraystarter.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					
					Arrays.fill(db, null); 
					db = new Player[nrOfPlayers]; 
					
					for (int i=0; i < nrOfPlayers; i++) {
						db[i] = new Player();
						db[i].name = ""+(i+1);
						db[i].credits = (int) ((Math.random()+i));
						db[i].gpa = (double) ((Math.random()+i)* Math.random());   
					}
					
					for ( int i=0; i<db.length; i++ ) {
						 System.out.println("Name: " + db[i].name);
						 System.out.println("\tCredit hours: " + db[i].credits);
						 System.out.println("\tGPA: " + db[i].gpa + "\n");
						 }
					
				}  
			}); 
		 
		*/ 
		 
		    
		 
		 Button nextScreen = new Button("Proceed to Start Game");
		 nextScreen.setPrefSize(200, 30);
		 
		 nextScreen.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					
					borderE.setLeft(null);
					borderE.setCenter(null);
					borderE.setRight(null);
					
// ************************ TOP SIDE BAR TRACKING TIME ETC *****************
					
					FlowPane sideFlow = new FlowPane(); 
					
					for (int i = 0; i < nrOfPlayers; i++) {
					System.out.println(db[i].name + " has got a quit status of " + db[i].quit);
					
					}
					
					new Thread() {
						public void run() { 
							for (int i = 0; i < 20000; i++) {
								try {
									Thread.sleep(1000);
									} catch (InterruptedException ex)
										{ex.printStackTrace();}
								Platform.runLater(new Runnable() 
								{public void run() { 
									
									sideFlow.getChildren().clear();
									
									for (int i = 0; i < nrOfPlayers; i++) {
											int k = i;
										
											
											Text sideText = new Text(db[i].name);
											sideText.setFont(Font.font("Arial", FontWeight.BOLD, 28));
											
											Text sideTime = new Text();
											sideTime.setFont(Font.font("Arial", FontWeight.BOLD, 28));
											
											
											if (db[i].quit == false) {
											sideTime.setText(""+db[i].sw.getTime()/1000);
											
											}
											else if (db[i].quit == true){
												sideTime.setText("RIP");
												}
											else {
												System.out.println("We got a quit = false/true problem in de sideflow");
											}
											
											
											Button sideButton = new Button("Eject");
											sideButton.setPrefSize(200, 30);
											 
											sideButton.setOnAction(new EventHandler<ActionEvent>() {
													@Override
													public void handle(ActionEvent event) {
														
														db[k].quit = true;
														
													}  
												}); 
											HBox sideBox = new HBox(sideText, sideTime, sideButton);
											sideBox.setPadding(new Insets(15, 12, 15, 12));
											sideBox.setSpacing(40);
											sideFlow.getChildren().addAll(sideBox);
										}
										}
								});
						}}}.start();
					
					borderE.setLeft(timescreen.timetrack());	
					borderE.setTop(sideFlow);
					
					
					
					
// ************************** GAME INTERFACE *************************************	
					
					Text screenName = new Text(db[turnOfPlayer].name);
					screenName.setFont(Font.font("Arial", FontWeight.BOLD, 100));
					Text screenTime = new Text(""+db[turnOfPlayer].sw.getTime()/1000);
					screenTime.setFont(Font.font("Arial", FontWeight.BOLD, 100));
					
			/*		
			  new Thread() {
						public void run() { 
							for (int i = 0; i < 20000; i++) {
								try {
									Thread.sleep(1000);
									} catch (InterruptedException ex)
										{ex.printStackTrace();}
								Platform.runLater(new Runnable() 
								{public void run() { 
								
									
							//	if (db[turnOfPlayer].name != null) {
							//		screenName.setText(db[turnOfPlayer].name); }
							//	if (db[turnOfPlayer].sw != null) {
							//		screenTime.setText(""+db[turnOfPlayer].sw.getTime()/1000);}
								try {
									screenName.setText(db[turnOfPlayer].name);
									screenTime.setText(""+db[turnOfPlayer].sw.getTime()/1000);
								}
								catch (NullPointerException e) { 
								//	System.out.println("Null pointer exception of topscreen refresh thread");
									}
								
								}
							});
						}	
						}
						}.start();
					*/	
						Thread Refresh = new Thread() {
							public void run() { 
								for (int i = 0; i < 20000; i++) {
									try {
										Thread.sleep(1000);
										} catch (InterruptedException ex)
											{ex.printStackTrace();}
									Platform.runLater(new Runnable() 
									{public void run() { 
									
									try {
										screenName.setText(db[turnOfPlayer].name);
										screenTime.setText(""+db[turnOfPlayer].sw.getTime()/1000);
									}
									catch (NullPointerException e) { 
									//	System.out.println("Null pointer exception of topscreen refresh thread");
										}
									}
								});
							}}};
						Refresh.start();
				
					FlowPane gameFlow = new FlowPane();
					VBox gameBox = new VBox();
					
					Text textwhoisup = new Text("TURN: player ");
					Text texttimer = new Text("123456789 BOOM!");
					Button butstarttheclock = new Button("BEGIN!");
					butstarttheclock.setPrefSize(100, 20);
					butstarttheclock.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
						
					gameFlow.getChildren().clear();
					 
					VBox timeturn = new VBox();
					timeturn.getChildren().addAll(screenName, screenTime);
					gameFlow.getChildren().addAll(timeturn);
					
					db[turnOfPlayer].sw.start();
					db[turnOfPlayer].active = true;
					} 
					});  
					
					gameBox.getChildren().addAll(textwhoisup, texttimer, butstarttheclock);
					gameFlow.getChildren().addAll(gameBox);
					
					borderE.setCenter(gameFlow);
					
					
// ****************************** knop der knoppen ***********************************
					FlowPane derFlow = new FlowPane();
					HBox derBox = new HBox();
					
					Button derKnop = new Button("derKnop");
					derKnop.setPrefSize(200, 30);
					 
					derKnop.setOnAction(new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent event) {
								// check modulus
								
								// stop SW (SUSPEND??!!)
								if (db[turnOfPlayer].active = true) {
								db[turnOfPlayer].sw.suspend();
								db[turnOfPlayer].suspended = true;
								}
								else {System.out.println("we got a problem: der knop cannot suspend");}
								// remove images // or redundant set zero text
								// screenTime.setText("");
								// screenName.setText("");
								
								
								
								
								
								// modulus +1
								// turnOfModulus++;
								// start SW
								
								
								// while (db[turnOfPlayer].quit == true) {
								//	turnOfModulus++;
								//	}
								
								do { 
									turnOfModulus++; 
									DWprotection++;	
									if ((turnOfModulus+1) <= nrOfPlayers ) 
									{turnOfPlayer = turnOfModulus;}
									else {turnOfPlayer = (turnOfModulus % nrOfPlayers);}
								}
								while (db[turnOfPlayer].quit == true && DWprotection <= 20);	
								
								DWprotection = 0; //reset to zero again for next dowhile loop.
								
								
								
								
								
					//			if ((turnOfModulus+1) <= nrOfPlayers ) {
					//				turnOfPlayer = turnOfModulus;
					//			}
					//			else {
					//				turnOfPlayer = (turnOfModulus % nrOfPlayers);
					//			}
								
								
								
								
								/* if (db[turnOfPlayer].quit == true) {
									System.out.println("This looser quit, let's skip him!");
									turnOfModulus++;
									
									
									if ((turnOfModulus+1) <= nrOfPlayers ) {
										turnOfPlayer = turnOfModulus;
									}
									else {
										turnOfPlayer = (turnOfModulus % nrOfPlayers);
									}   
									
								}
								else {
									System.out.println("Nothing to see here, move along, noboddy quit");
								} */
								
								
								// CATCH SUSPEND EN AL DIE DINGEN MEER!
								if (db[turnOfPlayer].active == false) {
								db[turnOfPlayer].sw.start();
								db[turnOfPlayer].active = true;
								}
								else if (db[turnOfPlayer].active == true && db[turnOfPlayer].suspended == true) {
									db[turnOfPlayer].sw.resume();	
									db[turnOfPlayer].suspended = false; 
								}
								else {
									System.out.println("we got a start/resume problem");
									
								}	
								
								
								
								screenName.setText(db[turnOfPlayer].name);	// Double commando zodat het veld gevuld wordt: anders gebeurd dit pas door de thread na 1 seconde en dan heb je effe een leeg veld.		
								screenTime.setText(""+db[turnOfPlayer].sw.getTime()/1000);
								// add images
							
								// db[0].name 	db[0].sw.getTime()
					
								//gameFlow.getChildren().addAll(db[turnOfPlayer].naamtekst, db[turnOfPlayer].displaytimer);
									
							}}); 
					
					derBox.getChildren().addAll(derKnop);
					derFlow.getChildren().addAll(derBox);
					borderE.setRight(derFlow);
				
					} 
			});
		   
		 
		 vbox1.getChildren().addAll(bottomTitle, arrayprinter, lockin, enternames, nextScreen);  //arraystarter,
	
		 VBox vbox2 = new VBox();
		 vbox2.setPadding(new Insets(15, 12, 15, 12));
		 vbox2.setSpacing(10);
		 vbox2.setStyle("-fx-background-color: #336699;");
		 
		// *TestingConsole **************** knop reset **********************
		 Button resetButton = new Button("Reset");
		 resetButton.setPrefSize(200, 30);
			 
		 resetButton.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						
						System.out.println("resetting!");
						
						//stopping stopwatch
						if (db[turnOfPlayer].active == true && db[turnOfPlayer].suspended == false) {
							db[turnOfPlayer].sw.stop(); }
						
						// stopping threads?
						// Lukt me nog niet. Mathieu timeline gebeuren?
						
						// resetting imperative value objects
						turnOfPlayer=0;
						turnOfModulus=0;
						DWprotection=0;
						nrOfPlayers=0;
						nrOfQuitters=0;
						
						// resetting screen
						Arrays.fill(db, null); 
						borderE.setLeft(null);
						borderE.setTop(null);
						borderE.setRight(null);
						borderE.setCenter(null);
						borderE.setLeft(startScreen.entryBorder());
						}  
				}); 
		 
		// ************************************knop final statistics
		 
		 vbox2.getChildren().addAll(resetButton);  
		 hboxTestingConsole.getChildren().addAll(vbox1, vbox2);
		 return hboxTestingConsole;
		}
	
	/* public FlowPane entryNames() {
		FlowPane nameFlow = new FlowPane();
		
		for (int i = 0; i < nrOfPlayers; i++) {
			VBox nameLine = new VBox();
			Text nameText = new Text("enter name of Player " +(i+1));
			nameText.setFont(Font.font("Arial", FontWeight.BOLD, 14));
			TextField enterName = new TextField();
			enterName.setEditable(true);
			enterName.setFont(Font.font("Arial", FontWeight.BOLD, 14));
			Button nameButton = new Button("accept name");
			nameButton.setPrefSize(100, 20);
			nameButton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					
				// db[i].name = enterName.getText();
					
				}
			}); 
			
		   nameLine.getChildren().addAll(nameText, enterName, nameButton);
		   nameFlow.getChildren().addAll(nameLine);
			
		}
		
					
		
		return nameFlow;
	} 
	*/
	

}
