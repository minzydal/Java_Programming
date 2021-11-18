package lab07;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import Lab03.Deck;
import Lab03.Race;
import Lab03.TicTacToe;
import Lab05.Circle;
import Lab05.GeometricInterface;
import Lab05.ResizableCircle;

public class LabsGUI {

	private TreeView<String> tree;
	private TextArea txtArea;
	
	public void displayLabsGUI() {
		Stage stage = new Stage();
		VBox root = new VBox();
		// set property and children for root
		
		root.setMinSize(700,  400);
		root.setMaxSize(900, 600);
		root.setPadding(new Insets(15,15,15,15));
		root.setStyle("-fx-border=color: Black;");
		
		HBox cbox = addCenterPane();
		cbox.prefHeightProperty().bind(root.prefWidthProperty());
		root.getChildren().add(cbox);
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("GUI for Labs");
		stage.show();
	}
	
	
	private HBox addCenterPane() {
		HBox hb = new HBox();
		hb.setSpacing(50);
		hb.setPadding(new Insets(15,15,15,15));
		hb.setStyle("-fx-border-color: Blue;");
		
		TreeView<String> tree = new TreeView<String>();
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
		
		tree.getSelectionModel().selectedItemProperty().addListener(
				(v, oldValue, newValue)->{
					if(oldValue != newValue)
					{
						String str = tree.getSelectionModel().selectedItemProperty().getValue().getValue().toString();
						txtArea.appendText("You have selected " +str +" \n");
						//if(str.equals("Lab01"))
							//{testLab01();}
						//if(str.equals("Lab02"))
							//{testLab02();}
						//if(str.equals("Lab06"))
						//{testLab06();}
//						if(str.equals("Lab04"))
							//{testLab04();}
						if(str.equals("Lab05"))
							{testLab05();}
						
						if(str.equals("Lab03"))
							{testLab03();}
							
					}
				}); 
		
		
		txtArea = new TextArea();
		txtArea.setBorder(new Border(new BorderStroke(Color.BLACK,
				BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		txtArea.appendText("");
		hb.getChildren().addAll(tree, txtArea);
		
		return hb;
		
	}
	
	
	public static void testLab05() {
		GeometricInterface[] gi = new GeometricInterface[3];
		gi[0] = new Circle(3);
		gi[1] = new ResizableCircle(4);
		ResizableCircle rc = new ResizableCircle(5);
		rc.resize(5);
		gi[2] = rc;
		
		for(GeometricInterface c:gi) {
			System.out.println("Radious: " + ((Circle)c).getRadious() + "\n");
			System.out.println("Perimeter : " + c.getPerimeter() + "\n");
			System.out.println("Area : " + c.getArea() + "\n");
		}
	}
		
		
		public static void testLab03() {
			Deck dk = new Deck();	
			dk.printDeck();
			dk.shuffle();
			dk.printDeck();
			
			Race rc = new Race();
			rc.run();
			
			TicTacToe ttt = new TicTacToe();
			ttt.play();
		}	
	}


