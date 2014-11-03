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
import javafx.scene.layout.FlowPane;

public class ScubaDive extends Application 
{
    
    FlowPane root = new FlowPane();
    Label eventName = new Label(" Project Name: ");
    Label date = new Label(" Date:      ");
    Label time = new Label(" Time: ");
    Label prototype = new Label(" (THIS IS A PROTOTYPE!)");
    TextField eventNameField = new TextField();
    TextField fromField = new TextField("MM/DD/YYY");
    TextField fromTime = new TextField("HH:MM");
    TextField dateField = new TextField("MM/DD/YYY");
    TextField timeField = new TextField("HH:MM");
    Button gas = new Button("Gas Settings");
    Button save = new Button("Save File");
    
    public static void main(String[] args) 
    {ScubaDive.launch();}  
    @Override
    
    public void start(Stage primaryStage) 
    {
        root.setAlignment(Pos.TOP_LEFT);
        root.setHgap(10);
        root.setVgap(10);
        root.getChildren().addAll(eventName, eventNameField, date, dateField, time, timeField, gas, save, prototype);
        Scene scene = new Scene(root, 250, 600);
        primaryStage.setTitle("SCUBA Dive");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        gas.setOnAction(new EventHandler<ActionEvent>() 
        {
        	@Override
        	public void handle(ActionEvent actionEvent)
                {
                    FlowPane root = new FlowPane();
                    Label o2 = new Label(" O2 Level:                        ");
                    Label he = new Label(" HE Level:                        ");
                    Label ne = new Label(" NE Level:                        ");
        	    Button done = new Button("Done");
        	    Button cancel = new Button("Cancel");
        	    
        	    ObservableList<String> options1 = FXCollections.observableArrayList("10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%");
        	    ComboBox repeatsList = new ComboBox(options1);
        	    
        	    ObservableList<String> options2 = FXCollections.observableArrayList("10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%");
        	    ComboBox repeatsList2 = new ComboBox(options2);
        	    
        	    ObservableList<String> options3 = FXCollections.observableArrayList("10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%");
        	    ComboBox repeatsList3 = new ComboBox(options3);
        	    
                    root.setAlignment(Pos.TOP_LEFT);
                    root.setHgap(10);
                    root.setVgap(10);
                    root.getChildren().addAll(o2, repeatsList, he, repeatsList2, ne, repeatsList3, done, cancel);
                    Scene repeatScene = new Scene(root, 250, 600);
                    Stage repeatStage = new Stage();
                    repeatStage.setTitle("Gas Settings");
                    repeatStage.setScene(repeatScene);
                    repeatStage.show();
                
        	}
        });
    }
}
