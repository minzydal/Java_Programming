import javafx.sql.Connection;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TexxtArea;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;
import javafx.stage.layout.VBox;

public class DBmain extends Application {
	private TableView table;
	private TreeView<String> tree;
	private TextArea ta;
	private Button[] buttons;
	private Label[] labels;
	private TextField[] txt;
	
	@Override
	public void start(Stage stage) {
		VBox vbox = new VBox();
		
		Scene scene = new Scene(vbox);
		stage.setScene(scene);
		stage.setTitle("Lab 03");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
