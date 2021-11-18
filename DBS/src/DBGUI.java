
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javafx.util.Callback;
import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableColumnBase;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DBGUI extends Application {

// data members
	private Connection con = MyConnection.makeConnection();
	private TableView table;
	TreeView<String> tree;
	Button[] buttons;
	Label[] labels;
	TextField[] txt;
	TextArea txtArea; 
	private final String[] btntext = { "clear", "save", "update", "delete", "print", "search" };

	
// function members
	private HBox addCenterPane() {
		
		HBox hb1 = new HBox();
		
		// Add TableView
		VBox vb = new VBox();

		table = new TableView<>();
		table.setMinSize(600, 150);
		table.setMaxSize(600, 150);
		table.setStyle("-fx-border-color: Black;");
		table.prefWidthProperty().bind(vb.prefWidthProperty());
		table.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		table.getSelectionModel().setCellSelectionEnabled(false);

		// Add Labels and TextFields
		GridPane  gp = new GridPane (); 
		gp.setPadding(new Insets(15, 15, 15, 125));
		gp.setHgap(10);
		gp.setVgap(10);
		gp .setStyle("-fx-border-color: Blue;");
		gp.prefHeightProperty().bind(table.prefWidthProperty());
		  txt=new TextField[10]; 
		  labels= new Label[10];
		  
		  for (int i = 0; i < labels.length; i++) { 
			  labels[i]= new Label("Label..");
			  labels[i].setMinSize(150, 15);
		      txt[i]= new TextField(" Text.. "); 
		      txt[i].setMinSize(200, 15);
		      gp.addRow(i, labels[i],txt[i] );
		      labels[i].prefHeightProperty().bind(gp.widthProperty());
		      txt[i].prefHeightProperty().bind(gp.widthProperty());
		   }
	 
		  
		 vb.getChildren().addAll(table, gp);
		
		 // Add TreeView
				StackPane stack = new StackPane();

				// Create the tree
				tree = addNodestoTree();
				tree.setShowRoot(true);
				
			
				tree.setMaxWidth(200);
				tree.prefWidthProperty().bind(stack.prefWidthProperty());
				stack.getChildren().add(tree);

		hb1.getChildren().addAll(stack,vb);
		hb1.setStyle("-fx-border-color:black;");
		hb1.setSpacing(20);
		hb1.prefHeightProperty().bind(vb.prefWidthProperty());
	

		return hb1;
	}

	
	private StackPane addBottomPane() {

		StackPane  stack = new StackPane();
		stack.setMaxHeight(150);
		stack.setMinHeight(150);
		stack.setMinHeight(150);
		stack.setStyle("-fx-border-color: #336699;");
		txtArea  = new TextArea();
		txtArea.setEdittable(false);
		txtArea.setWrapText(true);
		txtArea.setVisible(true);
		txtArea.prefHeightProperty().bind(stack.prefWidthProperty());
		stack.getChildren().add(txtArea);
		return stack;
	}
	
	
	private HBox addTopPane() {

		HBox hbox = new HBox();
		hbox.setPadding(new Insets(15, 15, 15, 15));
		hbox.setSpacing(10); // Gap between nodes
		//hbox.setStyle("-fx-background-color: #336699;");
		hbox.setStyle("-fx-border-color: Blue;");
		

		buttons = new Button[6];
		for (int i = 0; i < buttons.length; i++) {

			buttons[i] = new Button(btntext[i]);
			buttons[i].setPrefSize(80, 20);
			buttons[i].prefHeightProperty().bind(hbox.prefWidthProperty());
		}

		hbox.getChildren().addAll(buttons);

		return hbox;
	}

	

private  TreeView<String> addNodestoTree() {
    	TreeView<String> tree = new TreeView<String>();
    	
    	TreeItem<String> root, tables, reports, exit, about;
    	
    		root = new TreeItem<String>("DreamHome");
    		
    		tables = new TreeItem<String>("Tables");
    		
    		makeChild(Nodes.Branch.toString(), tables);
    		makeChild(Nodes.Client.toString(), tables);
    		makeChild(Nodes.PrivateOwner.toString(), tables);
    		makeChild(Nodes.Staff.toString(), tables);
    		makeChild(Nodes.PropertyForRent.toString(), tables);
    		makeChild(Nodes.Registration.toString(), tables);
    		makeChild(Nodes.Viewing.toString(), tables);
     		
    		reports = new TreeItem<String>("Reports");
    		makeChild(Nodes.Report01.toString(), reports);
    		makeChild(Nodes.Report02.toString(), reports);
    		makeChild(Nodes.Report03.toString(), reports);
    		
    		exit = new TreeItem<String>(Nodes.Exit.toString());
    		about=  new TreeItem<String>(Nodes.About.toString());
     		root.getChildren().addAll(tables,reports, exit, about);
    	    tree.setRoot(root);
         return tree;

    }	
    
	// Create child
	private TreeItem<String> makeChild(String title, TreeItem<String> parent) {
		TreeItem<String> item = new TreeItem<>(title);
		item.setExpanded(false);
		parent.getChildren().add(item);
		return item;
	}


	@Override
	public void start(Stage stage) {

		// Add controls and Layouts
		
		VBox vbox = new VBox();
		vbox.setSpacing(10);
		vbox.setMinSize(800, 600);
		vbox.setMaxSize(1200, 1000);
		vbox.setPadding(new Insets(15, 15, 15, 15));
		vbox.setSpacing(10); // Gap between nodes
		vbox.setStyle("-fx-border-color: Black;");
		// Top Box
		HBox tbox=addTopPane();
		tbox.prefHeightProperty().bind(vbox.prefWidthProperty());
		vbox.getChildren().add(tbox);
		
		// Center box
		HBox cbox=addCenterPane();
		cbox.prefHeightProperty().bind(vbox.prefWidthProperty());
		vbox.getChildren().add(cbox);
			
		StackPane bbox=addBottomPane();
		bbox().prefHeightProperty().bind(vbox.prefWidthProperty());
		vbox.getChildren().add(bbox);

		//create and show stage 

		Scene scene = new Scene(vbox);
		stage.setScene(scene);
		stage.setTitle("Dream Home ");
		stage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}

}
