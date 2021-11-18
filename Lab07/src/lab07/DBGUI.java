package lab07;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumnBase;
import javafx.scene.control.TablePosition;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DBGUI {
	private TableView table;
	private TreeView<String> tree;
	private Button[] buttons;
	private Label[] labels;
	private TextField[] txt;
	private TextArea txtArea;
	private final String[] btntext = {"clear",
									  "save",
									  "update",
									  "delete",
									  "print",
									  "search"};
	private final ObservableList<Person> dta1 = FXCollections.observableArrayList();
	private final ObservableList<Person> data =
			FXCollections.observableArrayList(
					new Person("Minzy", "Kim", "minzydal@example.com"),
					new Person("Jiwon", "Lee", "jiwon.lee@example.com"),
					new Person("Zin", "Yu", "Xin@example.com"),
					new Person("Jamin", "Lee", "jamin@example.com"),
					new Person("Jaeyeong", "Lee", "jy.lee@example.com"),
					new Person("Seongjun", "Lee", "sj.lee@example.com"),
					new Person("wooyeong", "Son", "wy.son@example.com"),
					new Person("Dagon", "Lee", "dagon.Lee@example.com"),
					new Person("Minsu", "Jeong", "ms.jeong@example.com"),
					new Person("Daizy", "Kim", "daisy@example.com")
					);
	
	public void displayDBGUI() {
		Stage stage = new Stage();
		//root node
		VBox vbox = new VBox();
		vbox.setSpacing(20);
		vbox.setMinSize(1000, 900);
		vbox.setMaxSize(1000, 700);
		vbox.setPadding(new Insets(15,15,15,15));
		vbox.setSpacing(10);
		vbox.setStyle("-fx-border-color: Black;");
		
		//create
		Scene scene = new Scene(vbox);
		stage.setScene(scene);;
		stage.setTitle("GUI for Database Operations");
		stage.show();
		
		
		//Top Box
		HBox tbox = addTopPane();
		tbox.prefHeightProperty().bind(vbox.prefWidthProperty());
		vbox.getChildren().add(tbox);

		//center pane
		HBox cbox = addCenterPane();
		cbox.prefHeightProperty().bind(vbox.prefWidthProperty());
		vbox.getChildren().add(cbox);
		
		//Bottom Pane
		StackPane bbox = addBottomPane();
		bbox.prefHeightProperty().bind(vbox.prefWidthProperty());
		vbox.getChildren().add(bbox);
		
	}
	private HBox addTopPane() {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(15,15,15,15));
		hbox.setSpacing(10);
		hbox.setStyle("-fx-border-color: Blue;");
		
		buttons = new Button[6];
		for(int i = 0; i<buttons.length; i++) {
			buttons[i] = new Button(btntext[i]);
			buttons[i].setPrefSize(80,20);
			buttons[i].prefHeightProperty().bind(hbox.prefWidthProperty());
		}
		for(int i = 0; i<buttons.length; i++) {
			final int j = i;
			buttons[j].setOnAction(
					(event) ->{
						String str = buttons[j].getText();
						txtArea.appendText("You have clicked  " + str +" Button\n");
					});
		}
		hbox.getChildren().addAll(buttons);
		return hbox;
	}
	private HBox addCenterPane()
	{
		HBox hb1 = new HBox();
		//add tableview
		VBox vb = new VBox();
		table = new TableView<Person>();
		table.setMinSize(600, 150);
		table.setMaxSize(600, 150);
		table.setStyle("-fx-border-color: Black;");
		table.prefWidthProperty().bind(vb.prefWidthProperty());
		table.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		table.getSelectionModel().setCellSelectionEnabled(false);
		TableColumn firstNameCol = new TableColumn("First Name");
		firstNameCol.setMinWidth(200);
		firstNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
		
		TableColumn lastNameCol = new TableColumn("Last Name");
		lastNameCol.setMinWidth(200);
		lastNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
		
		TableColumn emailCol = new TableColumn("Email");
		emailCol.setMinWidth(200);
		emailCol.setCellValueFactory(new PropertyValueFactory<Person, String>("Email"));
		
		table.setItems(data);;
		table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
		
		table.getSelectionModel().selectedItemProperty().addListener((v,oldV,newV)->{showFields();});
		GridPane gp = new GridPane();            
		gp.setPadding(new Insets(15,15,15,125));
		gp.setHgap(5);
		gp.setVgap(5);
		gp.setStyle("-fx-vorder-color: Green;");
		gp.prefHeightProperty().bind(table.prefWidthProperty());
		txt = new TextField[10];
		labels = new Label[10];
		
		for(int i = 0 ; i<labels.length;i++) {
			labels[i] = new Label("Label...");
			labels[i].setMinSize(150, 20);
			txt[i] = new TextField("Text..");
			txt[i].setMinSize(300, 20);
			gp.addRow(i,  labels[i],txt[i]);
			labels[i].prefHeightProperty().bind(gp.prefWidthProperty());
			txt[i].prefHeightProperty().bind(gp.prefWidthProperty());
		}
		
		vb.getChildren().addAll(table,gp);
		//hb1.getChildren().add(vb);
		
		//Add Tree
		
		StackPane stack = new StackPane();
		//Create the tree
		tree = new TreeView<String>();
		TreeItem<String> root, Lab01, Lab02, Lab03, Lab04, Lab05, Lab06;
		
		root = new TreeItem<String>("All Labs");
		Lab01 = new TreeItem<String>("Lab01");
		TreeItem<String> lab0101, lab0102;
		lab0101 = new TreeItem<String>("Task-01");
		lab0102 = new TreeItem<String>("Task-02");
		Lab01.getChildren().addAll(lab0101, lab0102);
		
		Lab02 = new TreeItem<String>("Lab02");
		Lab03 = new TreeItem<String>("Lab03");
		Lab04 = new TreeItem<String>("Lab04");
		Lab05 = new TreeItem<String>("Lab05");
		Lab06 = new TreeItem<String>("Lab06");
		root. getChildren().addAll(Lab01, Lab02, Lab03, Lab04, Lab05, Lab06);
		tree.setRoot(root);
		tree.setMaxWidth(150);
		tree.prefHeightProperty().bind(stack.prefWidthProperty());
		tree.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue)->{
			if(oldValue != newValue) {
				String str = tree.getSelectionModel().selectedItemProperty().getValue().getValue().toString();
				txtArea.appendText("You have selected "+ str + "\n");
			}
		});
		stack.getChildren().add(tree);
		
		hb1.prefHeightProperty().bind(vb.prefWidthProperty());
		hb1.getChildren().addAll(stack,vb);
		return hb1;
		
		
	}
	private void clearFields() {
		for(int i = 0; i<txt.length; i++)
		{
			txt[i].setText("");
			txt[i].setVisible(false);
			labels[i].setText("");
			labels[i].setVisible(false);
		}
	}
	private void showFields() {
		clearFields();
		TablePosition pos = (TablePosition)table.getSelectionModel().getSelectedCells().get(0);
		int row  = pos.getRow();
		int cols = table.getColumns().size();
		for(int j=0; j<cols; j++) {
			Object ch = ((TableColumnBase)table.getColumns().get(j)).getText();
			Object cell = ((TableColumnBase)table.getColumns().get(j)).getCellData(row).toString();
			txt[j].setText(cell.toString());
			txt[j].setVisible(true);
			
			labels[j].setText(ch.toString());
			labels[j].setVisible(true);
			
		}
		
	}
	
	private StackPane addBottomPane()
	{
		StackPane stack = stack = new StackPane();
		stack.setMaxHeight(150);
		stack.setMinHeight(150);
		stack.setPrefHeight(150);
		
		stack.setStyle("-fx-border-color: #336699;");
		
		txtArea = new TextArea();
		txtArea.appendText("");
		txtArea.prefHeightProperty().bind(stack.prefWidthProperty());
		stack.getChildren().add(txtArea);
		return stack;
	}
	
}
