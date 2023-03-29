import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.layout.*;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
public class main extends Application{

    public static void main(String args[])throws Exception{
        launch(args);
    
    }
    @Override 
    public void start(Stage stage) throws Exception{
        Group root = new Group();
        TextField textIn = new TextField(); 
        GridPane pane = new GridPane();
        Label label1In = new Label();
        Label label2In = new Label();
        Label label3In = new Label();
        Label label4In = new Label();
        Label label1Out = new Label();
        Label label2Out = new Label();
        Label label3Out = new Label();
        Label label4Out = new Label();
        Label Instructions = new Label();
        pane.setHgap(1);
        pane.setVgap(1);
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                String placeHolderString = textIn.getText();
                double placeHolder = 0;
                try {
                    placeHolder = Double.parseDouble(placeHolderString);
                    label1In.setText(placeHolderString + " km");
                    label2In.setText(placeHolderString + " L");
                    label3In.setText(placeHolderString + " kg");
                    label4In.setText(placeHolderString + " kpa");
                    label1Out.setText(String.valueOf(placeHolder/1.609344) + " Mi");
                    label2Out.setText(String.valueOf(placeHolder/3.78541178) + " Gal");
                    label3Out.setText(String.valueOf(placeHolder*2.20462262) + " Lbs");
                    label4Out.setText(String.valueOf(placeHolder/6.89475729) + " Psi");
                } catch (NumberFormatException ex) {
                    label1In.setText("nan km");
                    label2In.setText("nan L");
                    label3In.setText("nan kg");
                    label4In.setText("nan kpa");
                    label1Out.setText("nan Mi");
                    label2Out.setText("nan Gal");
                    label3Out.setText("nan Lbs");
                    label4Out.setText("nan Psi");
                }
            }
        };
        textIn.setAlignment(Pos.BOTTOM_CENTER);
        textIn.setOnAction(event);
        Scene scene = new Scene(pane, 1200, 600);
        Instructions.setText("type number and press enter");
        pane.add(textIn,100,300);
        pane.add(Instructions, 100 ,250);
        pane.add(label1In, 500,50);
        pane.add(label2In, 500,150);
        pane.add(label3In, 500,250);
        pane.add(label4In, 500,350);
        pane.add(label1Out, 700,50);
        pane.add(label2Out, 700,150);
        pane.add(label3Out, 700,250);
        pane.add(label4Out, 700,350);
        stage.setTitle("app");
        stage.setScene(scene);
        stage.show();
       

    }
}
