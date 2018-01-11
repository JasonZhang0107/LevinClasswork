package Lab4Three;

import java.awt.Label;
import java.awt.TextField;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GameCode extends Application
{
	private static int score = 0;
	
    public static void main(String[] args)
    {
	        launch(args);
    }
    @Override
    public void start(Stage primaryStage) 
    {
    	//Set title of stage
        primaryStage.setTitle("Fast Clicker");
        
        //Button events and text
        Button btn = new Button();
        btn.setText("Click me");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) 
            {
                GameCode.score++;
                
                long timeStep = System.nanoTime() + 10000000000L;
                new AnimationTimer()
                {
                	@Override
                	public void handle(long now) {
                		if (now > timeStep)
                		{
                			System.out.println("You clicked " + score + " times in 10 seconds");
                			System.exit(0);
                		}
                	}
                }.start();
            }
        });
        
        TextField name = new TextField();
        
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
