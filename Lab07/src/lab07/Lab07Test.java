package lab07;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import Lab05.Circle;
import Lab05.GeometricInterface;
import Lab05.ResizableCircle;

public class Lab07Test extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		VBox root = new VBox();
		root.setPadding(new Insets(25,25,25,75));
		root.setSpacing(20);
		
		Button btn1 = new Button("Task-1");
		btn1.setMinSize(100, 20);
		btn1.setOnAction(evt ->{
			javaFXCalculator cal = new javaFXCalculator();
			cal.start();
			//System.out.println("call for Task -1");
		});
		
		Button btn2 = new Button("Task-2");
		btn2.setMinSize(100, 20);
		btn2.setOnAction(evt ->{
			DBGUI db = new DBGUI();
			db.displayDBGUI();
			//System.out.println("call for Task -2");
		});
		
		Button btn3 = new Button("Task-3");
		btn3.setMinSize(100, 20);
		btn3.setOnAction(evt ->{
			LabsGUI labs = new LabsGUI();
			labs.displayLabsGUI();
		});
		
		Button btn4 = new Button("Exit");
		btn4.setMinSize(100, 20);
		btn4.setOnAction(evt ->{
			System.out.println("call for Exit");
			System.exit(0);
		});
		
		root.getChildren().addAll(btn1,btn2,btn3,btn4);

		Scene sn = new Scene(root);
		stage.setScene(sn);
		stage.setTitle("Lab 07 ");
		stage.show();
		
	}
}

