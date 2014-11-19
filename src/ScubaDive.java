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
    Label time = new Label(" Time: ");
    Label prototype = new Label(" (THIS IS A PROTOTYPE!)");
    Label o2 = new Label("O2 Level: ");
    Label he = new Label("HE Level: ");
    Label ne = new Label("NE Level: ");
    Label previousDiveTime = new Label("Previous Dive Time: ");
    Label surfaceIntervalTime = new Label("Surface Interval Time (SIT): ");
    Label preferenceUnits = new Label("Units: ");
    Label depth = new Label("Depth:");
    Label depthFeet = new Label("Feet");
    Label runTime = new Label("Trial Time:");
    Label runTimeSeconds = new Label("Seconds");
    TextField eventNameField = new TextField();
    TextField fromField = new TextField("MM/DD/YYY");
    TextField fromTime = new TextField("HH:MM");
    TextField dateField = new TextField("MM/DD/YYY");
    TextField timeField = new TextField("HH:MM");
    TextField pdt = new TextField("00h00m00s");
    TextField sit = new TextField("00h00m00s");
    TextField depthText = new TextField();
    TextField runTimeText = new TextField("00:00");
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
    Button save = new Button("Save File");
    Button done = new Button("Done");
    Button cancel = new Button("Cancel");
    ObservableList<String> options1 = FXCollections.observableArrayList("10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%");
    ComboBox optionsList = new ComboBox(options1);
    ObservableList<String> options2 = FXCollections.observableArrayList("10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%");
    ComboBox optionsList2 = new ComboBox(options2);
    ObservableList<String> options3 = FXCollections.observableArrayList("10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%");
    ComboBox optionsList3 = new ComboBox(options3);
    ObservableList<String> options4 = FXCollections.observableArrayList("AM", "PM");
    ComboBox optionsList4 = new ComboBox(options4);
    
    public static void main(String[] args) 
    {ScubaDive.launch();}  
    @Override
    
    public void start(Stage primaryStage) 
    {
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Dive Planner (WARNING: THIS IS A PROTOTYPE!)");
        primaryStage.setScene(scene);
        primaryStage.show();
    
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
        root.setVgap(10);
        root.add(fileMenu, 1, 1);
        root.add(eventName, 1, 2);
        root.add(eventNameField, 2, 2);
        root.add(date, 1, 3);
        root.add(dateField, 2, 3);
        root.add(time, 1, 4);
        root.add(timeField, 2, 4);
        root.add(optionsList4, 3, 4);
        root.add(depth, 1, 5);
        root.add(depthText, 2, 5);
        root.add(depthFeet, 3, 5);
        root.add(runTime, 1, 6);
        root.add(runTimeText, 2, 6);
        root.add(runTimeSeconds, 3, 6);
        root.add(gas, 1, 7);
        root.add(save, 1, 8);
        root.add(prototype, 1, 9);
        
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
