package application;
	
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import framework.rmi.ReseauSocial;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class demo9share extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/views/Chat.fxml"));
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
		ReseauSocial reseauSocial = null; //REPRESENTE L'OBJET QU'ON VA RECUPERER DU SERVEUR
		try {
			reseauSocial = (ReseauSocial) Naming.lookup("reseau");
		} catch (NotBoundException e) {
			System.err.println("NotBoundException");
		} catch (MalformedURLException e) {
			System.err.println("MalformedURLException");
		} catch (RemoteException e) {
			System.err.println("RemoteException");
		}
		
		//LANCER L'IHM
		
		// CONNEXION
		//
	}
}
