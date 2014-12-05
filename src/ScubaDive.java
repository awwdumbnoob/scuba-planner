import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScubaDive extends Application 
{
    
    GridPane root = new GridPane();
    Label prototype = new Label(" (THIS IS A PROTOTYPE!)");
    Label previousDiveTime = new Label("Previous Dive Time: ");
    Label surfaceIntervalTime = new Label("Surface Interval Time (SIT): ");
    Label preferenceUnits = new Label("Units: ");
    Label depthOne = new Label("Dive 1 Depth:");
    Label depthTwo = new Label("Dive 2 Depth:");
    Label depthLabelOne = new Label("Feet");
    Label depthLabelTwo = new Label("Feet");
    Label runTimeOne = new Label("Dive 1 Time:");
    Label runTimeTwo = new Label("Dive 2 Time:");
    Label surfaceTime = new Label("Surface Time: ");
    Label runTimeSeconds = new Label("Seconds");
    Label minutesOne = new Label("Minutes");
    Label minutesTwo = new Label("Minutes");
    Label minutesThree = new Label("Minutes");
    Label resultDiveOne = new Label("Dive 1:");
    Label resultDiveOneField = new Label();
    Label resultTimeOne = new Label("Total Time:");
    Label resultTimeOneField = new Label();
    Label resultDepthOne = new Label("Depth:");
    Label resultDepthOneField = new Label();
    Label resultLetterOne = new Label("Lettergroup:");
    Label resultLetterOneField = new Label();
    Label resultDiveTwo = new Label("Dive 2:");
    Label resultDiveTwoField = new Label();
    Label resultTimeTwo = new Label("Total Time:");
    Label resultTimeTwoField = new Label();
    Label resultDepthTwo = new Label("Depth:");
    Label resultDepthTwoField = new Label();
    Label resultLetterTwo = new Label("Lettergroup:");
    Label resultLetterTwoField = new Label();
    Label resultSurfaceTime = new Label("Surface Time:");
    Label resultSurfaceTimeField = new Label();
    Label resultSurfaceLetterGroup = new Label("Surface Letter Group:");
    Label resultSurfaceLetterGroupField = new Label();
    Label resultResidualNitrogenTime = new Label("Residual Nitrogen Time:");
    Label resultResidualNitrogenTimeField = new Label();
    Label results = new Label("Results");
    Label request = new Label();
    Label spaceOne = new Label();
    Label spaceTwo = new Label();
    Label spaceThree = new Label();
    Label spaceFour = new Label();
    Label spaceFive = new Label();
    Label spaceSix = new Label();

    TextField timeField = new TextField("HH:MM");
    TextField pdt = new TextField("00h00m00s");
    TextField sit = new TextField("00h00m00s");
    TextField depthText = new TextField();
    TextField runTimeText = new TextField("00:00");
    TextField timeOne = new TextField();
    TextField timeTwo = new TextField();
    TextField surfaceTimeField = new TextField();
    Button dive = new Button ("Dive Settings");
    Button diveImport = new Button ("Import");
    Button diveOk = new Button ("OK");
    Button diveCancel = new Button ("Cancel");
    Button diveApply = new Button ("Apply");
    Button preferences = new Button ("Preferences");
    Button preferenceOk = new Button ("OK");
    Button preferenceCancel = new Button ("Cancel");
    Button preferenceApply = new Button ("Apply");
    RadioButton preferenceFeet = new RadioButton("Feet");
    RadioButton preferenceMeters = new RadioButton("Meter");
    Button calculate = new Button("Calculate");
    Button done = new Button("Done");
    Button cancel = new Button("Cancel");
    ObservableList<String> options1 = FXCollections.observableArrayList("10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%");
    ComboBox optionsList = new ComboBox(options1);
    ObservableList<String> options2 = FXCollections.observableArrayList("10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%");
    ComboBox optionsList2 = new ComboBox(options2);
    ObservableList<String> options3 = FXCollections.observableArrayList("10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%");
    ComboBox optionsList3 = new ComboBox(options3);
    ObservableList<String> depthboxOne = FXCollections.observableArrayList("35", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140");
    ComboBox optionsList9 = new ComboBox(depthboxOne);
    ObservableList<String> depthboxTwo = FXCollections.observableArrayList("35", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140");
    ComboBox optionsList10 = new ComboBox(depthboxTwo);
    public static void main(String[] args) 
    {ScubaDive.launch();}  
    @Override
    
    public void start(Stage primaryStage) 
    {
        Scene scene = new Scene(root, 600, 500);
        primaryStage.setTitle("Dive Planner (WARNING: THIS IS A PROTOTYPE!)");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    //Default comboboxes
        optionsList9.setValue("35");
        optionsList10.setValue("35");
        
     // start caluclations on save button
        calculate.setOnAction(new EventHandler<ActionEvent>()
        		{	
        		
        		@Override
        		public void handle(ActionEvent actionEvent)
        		    {
        			

        			
        		if(timeTwo.getText().isEmpty() && surfaceTimeField.getText().isEmpty())	//case when user only wants one dive
        		{
        			try{
            			resultTimeOneField.setText(timeOne.getText());
        			    resultDepthOneField.setText(optionsList9.getSelectionModel().getSelectedItem().toString());
        			    char letter1 = PadiDiveTable.getPressureGroup(Integer.parseInt(optionsList9.getSelectionModel().getSelectedItem().toString()), Integer.parseInt(timeOne.getText()));
						
    			    	resultLetterOneField.setText(Character.toString(letter1));
    			    	request.setText("");
        			}
        			
        			catch(NumberFormatException
								| DepthOutOfRangeException
								| TimeOutOfRangeException| NullPointerException e){
        				
        				request.setText("PLEASE ENTER VALID DATA!!!!!");
        				e.printStackTrace();
        			}
        			
        		}
        		else{
        			    try {
                			resultTimeOneField.setText(timeOne.getText());
            			    resultDepthOneField.setText(optionsList9.getSelectionModel().getSelectedItem().toString());
          			        resultSurfaceTimeField.setText(surfaceTimeField.getText());  			    
            			    resultTimeTwoField.setText(timeTwo.getText());
            			    resultDepthTwoField.setText(optionsList10.getSelectionModel().getSelectedItem().toString());
        			    	char letter1 = PadiDiveTable.getPressureGroup(Integer.parseInt(optionsList9.getSelectionModel().getSelectedItem().toString()), Integer.parseInt(timeOne.getText()));
							
        			    	resultLetterOneField.setText(Character.toString(letter1));
        			    	char rest = PadiDiveTable.newpressuregrouprest(Integer.parseInt(surfaceTimeField.getText()), letter1);
        			    	resultSurfaceLetterGroupField.setText(Character.toString(rest));
        			    
        			    	int residualtime = PadiDiveTable.getresidualnitrogentime(Integer.parseInt(optionsList10.getSelectionModel().getSelectedItem().toString()), rest);
        			    	resultResidualNitrogenTimeField.setText(Integer.toString(residualtime));
        			    	char letter2 = PadiDiveTable.getPressureGroup(Integer.parseInt(optionsList10.getSelectionModel().getSelectedItem().toString()), Integer.parseInt(timeTwo.getText())+residualtime);
						    resultLetterTwoField.setText(Character.toString(letter2));
						    request.setText("");
        			    } catch (NumberFormatException
								| DepthOutOfRangeException
								| TimeOutOfRangeException| NullPointerException e) {
							// TODO Auto-generated catch block
							request.setText("PLEASE ENTER VALID DATA!!!!!");
        			    	e.printStackTrace();//erease later
						} catch (PressureGroupOutOfRangeException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							request.setText("PLEASE ENTER VALID DATA!!!!!");
						}
        			    
        			    
        		    }}
        		});
        
        
        
    //File Menu
        MenuBar fileMenu = new MenuBar();
        Menu file = new Menu("File");
        MenuItem New = new MenuItem("New");
        MenuItem Open = new MenuItem("Open");
        MenuItem Save = new MenuItem("Save");
        MenuItem saveAs = new MenuItem("Save As");
        MenuItem Exit = new MenuItem("Exit");
        Exit.setOnAction(new EventHandler<ActionEvent>() 
        {
            public void handle(ActionEvent t) {
                System.exit(0);
            }
        });
        file.getItems().addAll(New, Open, Save, saveAs, Exit);
        
    //Help menu
        Menu help = new Menu("Help");
        MenuItem divePlannerManual = new MenuItem("Dive Planner Manual");
        help.getItems().addAll(divePlannerManual);
    
    //Home Screen
        fileMenu.getMenus().addAll(file, help);
        root.setAlignment(Pos.TOP_LEFT);
        root.setHgap(10);
        root.setVgap(0);
        root.add(fileMenu, 1, 1);
        root.add(spaceFive, 1, 2);
        root.add(runTimeOne, 1, 3);
        root.add(timeOne, 2, 3);
        root.add(minutesOne, 3, 3);
        root.add(depthOne, 1, 4);
        root.add(optionsList9, 2, 4);
        root.add(depthLabelOne, 3, 4);
        root.add(surfaceTime, 1, 5);
        root.add(surfaceTimeField, 2, 5);
        root.add(minutesThree, 3, 5);
        root.add(runTimeTwo, 1, 6);
        root.add(timeTwo, 2, 6);
        root.add(minutesTwo, 3, 6);
        root.add(depthTwo, 1, 7);
        root.add(optionsList10, 2, 7);
        root.add(depthLabelTwo, 3, 7);
        root.add(spaceSix, 1, 8);
        root.add(calculate, 2, 9);
        root.add(spaceOne, 1, 10);
        root.add(results, 1, 11);
        root.add(resultDiveOne, 1, 12);
        root.add(resultDiveOneField, 2, 12);
        root.add(resultTimeOne, 1, 13);
        root.add(resultTimeOneField, 2, 13);
        root.add(resultDepthOne, 1, 14);
        root.add(resultDepthOneField, 2, 14);
        root.add(resultLetterOne, 1, 15);
        root.add(resultLetterOneField, 2, 15);
        root.add(spaceFour, 1, 16);
        root.add(resultSurfaceTime, 1, 17);
        root.add(resultSurfaceTimeField, 2, 17);
        root.add(resultSurfaceLetterGroup, 1, 18);
        root.add(resultSurfaceLetterGroupField, 2, 18);
        root.add(resultResidualNitrogenTime, 1, 19);
        root.add(resultResidualNitrogenTimeField, 2, 19);
        root.add(spaceTwo, 1, 20);
        root.add(resultDiveTwo, 1, 21);
        root.add(resultDiveTwoField, 2, 21);
        root.add(resultTimeTwo, 1, 22);
        root.add(resultTimeTwoField, 2, 22);
        root.add(resultDepthTwo, 1, 23);
        root.add(resultDepthTwoField, 2, 23);
        root.add(resultLetterTwo, 1, 24);
        root.add(resultLetterTwoField, 2, 24);
        root.add(spaceThree, 1, 25);
        root.add(prototype, 1, 26);
        root.add(request, 1, 27);
    }
}
