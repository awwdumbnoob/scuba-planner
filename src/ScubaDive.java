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
    Label eventName = new Label(" Project Name: ");
    Label date = new Label(" Date:      ");
    Label prototype = new Label(" (THIS IS A PROTOTYPE!)");
    Label o2 = new Label("O2 Level: ");
    Label he = new Label("HE Level: ");
    Label ne = new Label("NE Level: ");
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
    Label results = new Label("Results");
    Label request = new Label();
    //Label secondsOne = new Label("Minutes");
    //Label secondsTwo = new Label("Minutes");
    TextField eventNameField = new TextField();
    TextField fromField = new TextField("MM/DD/YYY");
    TextField fromTime = new TextField("HH:MM");
    TextField dateField = new TextField("MM/DD/YYY");
    TextField timeField = new TextField("HH:MM");
    TextField pdt = new TextField("00h00m00s");
    TextField sit = new TextField("00h00m00s");
    TextField depthText = new TextField();
    TextField runTimeText = new TextField("00:00");
    TextField timeOne = new TextField();
    TextField timeTwo = new TextField();
    TextField surfaceTimeField = new TextField();
    Button gas = new Button("Gas Settings");
    Button gasOk = new Button ("OK");
    Button gasCancel = new Button ("Cancel");
    Button gasApply = new Button ("Apply");
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
    //ObservableList<String> hoursOne = FXCollections.observableArrayList("00", "02", "04", "06", "08", "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40", "42", "44", "46", "48", "50", "52", "54", "56", "58", "60");
    //ComboBox optionsList5 = new ComboBox(hoursOne);
    //ObservableList<String> minutesboxOne = FXCollections.observableArrayList("00", "02", "04", "06", "08", "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40", "42", "44", "46", "48", "50", "52", "54", "56", "58", "60");
    //ComboBox optionsList6 = new ComboBox(minutesboxOne);
    //ObservableList<String> hoursTwo = FXCollections.observableArrayList("00", "02", "04", "06", "08", "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40", "42", "44", "46", "48", "50", "52", "54", "56", "58", "60");
    //ComboBox optionsList7 = new ComboBox(hoursTwo);
    //ObservableList<String> minutesboxTwo = FXCollections.observableArrayList("00", "02", "04", "06", "08", "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40", "42", "44", "46", "48", "50", "52", "54", "56", "58", "60");
    //ComboBox optionsList8 = new ComboBox(minutesboxTwo);
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
        			    	System.out.println(rest);
        			    
        			    	int residualtime = PadiDiveTable.getresidualnitrogentime(Integer.parseInt(optionsList10.getSelectionModel().getSelectedItem().toString()), rest);
        			    	
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
    
    //Edit Menu
        Menu edit = new Menu("Edit");
        MenuItem undo = new MenuItem("Undo");
        MenuItem redo = new MenuItem("Redo");
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");
        MenuItem delete = new MenuItem("Delete");
        MenuItem selectAll = new MenuItem("Select All");
        MenuItem diveSettings = new MenuItem("Dive Settings");
        MenuItem preferences = new MenuItem("Preferences");
        edit.getItems().addAll(undo, redo, cut, copy, paste, delete, selectAll, diveSettings, preferences);
        diveSettings.setOnAction(new EventHandler<ActionEvent>() 
        {
        	@Override
        	public void handle(ActionEvent actionEvent)
                {
                    GridPane root = new GridPane();
                    Scene DiveWindow = new Scene(root, 500, 120);
                    
                    root.setAlignment(Pos.TOP_LEFT);
                    root.setHgap(10);
                    root.setVgap(10);
                    root.add(previousDiveTime, 1, 1);
                    root.add(pdt, 2, 1);
                    root.add(diveImport, 3, 1);
                    root.add(surfaceIntervalTime, 1, 2);
                    root.add(sit, 2, 2);
                    root.add(diveOk, 3, 4);
                    root.add(diveCancel, 4, 4);
                    root.add(diveApply, 5, 4);
        	    
                    Stage GasOptions = new Stage();
                    GasOptions.setTitle("Edit Dive Settings");
                    GasOptions.setScene(DiveWindow);
                    GasOptions.show();
        	}
        });
        
        preferences.setOnAction(new EventHandler<ActionEvent>() 
        {
        	@Override
        	public void handle(ActionEvent actionEvent)
                {
                    GridPane root = new GridPane();
                    Scene PreferenceWindow = new Scene(root, 290, 110);
                    
                    root.setAlignment(Pos.TOP_LEFT);
                    root.setHgap(10);
                    root.setVgap(10);
                    root.add(preferenceUnits, 1, 1);
                    root.add(preferenceFeet, 2, 1);
                    root.add(preferenceMeters, 2, 2);
                    root.add(preferenceOk, 3, 4);
                    root.add(preferenceCancel, 4, 4);
                    root.add(preferenceApply, 5, 4);
        	    
                    Stage GasOptions = new Stage();
                    GasOptions.setTitle("Preferences");
                    GasOptions.setScene(PreferenceWindow);
                    GasOptions.show();
        	}
        });
        
    //View Menu
        Menu view = new Menu("View");
        MenuItem zoomIn = new MenuItem("Zoom in");
        MenuItem zoomOut = new MenuItem("Zoom out");
        MenuItem zoomDefault = new MenuItem("Zoom default");
        MenuItem zoomToFit = new MenuItem("Zoom to fit");
        view.getItems().addAll(zoomIn, zoomOut, zoomDefault, zoomToFit);
        
    //Help menu
        Menu help = new Menu("Help");
        MenuItem divePlannerManual = new MenuItem("Dive Planner Manual");
        help.getItems().addAll(divePlannerManual);
    
    //Home Screen
        fileMenu.getMenus().addAll(file, edit, view, help);
        root.setAlignment(Pos.TOP_LEFT);
        root.setHgap(10);
        root.setVgap(0);
        root.add(fileMenu, 1, 1);
        root.add(eventName, 1, 2);
        root.add(eventNameField, 2, 2);
        root.add(date, 1, 3);
        root.add(dateField, 2, 3);
        root.add(runTimeOne, 1, 4);
        root.add(timeOne, 2, 4);
        root.add(minutesOne, 3, 4);
        //root.add(optionsList6, 4, 4);
        //root.add(secondsOne, 5, 4);
        root.add(depthOne, 1, 5);
        root.add(optionsList9, 2, 5);
        root.add(depthLabelOne, 3, 5);
        root.add(surfaceTime, 1, 6);
        root.add(surfaceTimeField, 2, 6);
        root.add(minutesThree, 3, 6);
        root.add(runTimeTwo, 1, 7);
        root.add(timeTwo, 2, 7);
        root.add(minutesTwo, 3, 7);
        //root.add(optionsList8, 4, 6);
        //root.add(secondsTwo, 5, 6);
        root.add(depthTwo, 1, 8);
        root.add(optionsList10, 2, 8);
        root.add(depthLabelTwo, 3, 8);
        root.add(gas, 1, 9);
        root.add(calculate, 1, 10);
        root.add(results, 1, 11);
        root.add(resultDiveOne, 1, 12);
        root.add(resultDiveOneField, 2, 12);
        root.add(resultTimeOne, 1, 13);
        root.add(resultTimeOneField, 2, 13);
        root.add(resultDepthOne, 1, 14);
        root.add(resultDepthOneField, 2, 14);
        root.add(resultLetterOne, 1, 15);
        root.add(resultLetterOneField, 2, 15);
        root.add(resultSurfaceTime, 1, 16);
        root.add(resultSurfaceTimeField, 2, 16);
        root.add(resultDiveTwo, 1, 17);
        root.add(resultDiveTwoField, 2, 17);
        root.add(resultTimeTwo, 1, 18);
        root.add(resultTimeTwoField, 2, 18);
        root.add(resultDepthTwo, 1, 19);
        root.add(resultDepthTwoField, 2, 19);
        root.add(resultLetterTwo, 1, 20);
        root.add(resultLetterTwoField, 2, 20);
        root.add(prototype, 1, 21);
        root.add(request, 1, 22);
        
        gas.setOnAction(new EventHandler<ActionEvent>() 
        {
        	@Override
        	public void handle(ActionEvent actionEvent)
                {
                    GridPane root = new GridPane();
                    Scene GasWindow = new Scene(root, 325, 150);
                    
                    root.setAlignment(Pos.TOP_LEFT);
                    root.setHgap(10);
                    root.setVgap(10);
                    root.add(o2, 1, 1);
                    root.add(optionsList, 2, 1);
                    root.add(he, 1, 2);
                    root.add(optionsList2, 2, 2);
                    root.add(ne, 1, 3);
                    root.add(optionsList3, 2, 3);
                    root.add(gasOk, 3, 4);
                    root.add(gasCancel, 4, 4);
                    root.add(gasApply, 5, 4);
        	    
                    Stage GasOptions = new Stage();
                    GasOptions.setTitle("Gas Settings");
                    GasOptions.setScene(GasWindow);
                    GasOptions.show();
        	}
        });
    }
}
