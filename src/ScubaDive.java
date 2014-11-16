import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class ScubaDive extends Application 
{
    
    GridPane root = new GridPane();
    Label eventName = new Label(" Project Name: ");
    Label date = new Label(" Date:      ");
    Label time = new Label(" Time: ");
    Label prototype = new Label(" (THIS IS A PROTOTYPE!)");
    Label o2 = new Label(" O2 Level:                        ");
    Label he = new Label(" HE Level:                        ");
    Label ne = new Label(" NE Level:                        ");
    TextField eventNameField = new TextField();
    TextField fromField = new TextField("MM/DD/YYY");
    TextField fromTime = new TextField("HH:MM");
    TextField dateField = new TextField("MM/DD/YYY");
    TextField timeField = new TextField("HH:MM");
    Button gas = new Button("Gas Settings");
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
        root.setAlignment(Pos.TOP_LEFT);
        root.setHgap(10);
        root.setVgap(10);
        root.add(eventName, 1, 1);
        root.add(eventNameField, 2, 1);
        root.add(date, 1, 2);
        root.add(dateField, 2, 2);
        root.add(time, 1, 3);
        root.add(timeField, 2, 3);
        root.add(optionsList4, 3, 3);
        root.add(gas, 1, 4);
        root.add(save, 1, 5);
        root.add(prototype, 1, 6);
    
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("SCUBA Dive");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        gas.setOnAction(new EventHandler<ActionEvent>() 
        {
        	@Override
        	public void handle(ActionEvent actionEvent)
                {
                    GridPane root = new GridPane();
                    Scene GasWindow = new Scene(root, 500, 500);
                    
                    root.setAlignment(Pos.TOP_LEFT);
                    root.setHgap(10);
                    root.setVgap(10);
                    root.add(o2, 1, 1);
                    root.add(optionsList, 2, 1);
                    root.add(he, 1, 2);
                    root.add(optionsList2, 2, 2);
                    root.add(ne, 1, 3);
                    root.add(optionsList3, 2, 3);
        	    
                    Stage GasOptions = new Stage();
                    GasOptions.setTitle("Gas Settings");
                    GasOptions.setScene(GasWindow);
                    GasOptions.show();
                
        	}
        });
    }
}
