package Lab4Three;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import Lab4Three.BackEnd;

public class GameCode extends Application
{
	private static String name = null;
	private static int score = 0;
	
    public static void main(String[] args)
    {
    	//Creates CSV track file
    	File CSV = new File("FastClickerScoreSheet.csv");
		BackEnd scoreTracker =  new BackEnd(CSV);
		
    	//Gets player name, sets answer as a variable
    	Scanner sc = new Scanner(System.in);
    	System.out.println("What is your name?");
    	name = sc.nextLine();
    	sc.close();
    	
    	//Runs fast clicker
    	launch(args);
    	
    	//Writes name and score of player to CSV
    	System.out.println("Your Stats are displayed below: ");
    	System.out.println("Name: " + name +"\nScore: " + score);
    	System.out.println("\nAdding scores to score board");
    	scoreTracker.writeToCSV(name, Integer.toString(score));
    	
    	/*ArrayList<Integer> data = new ArrayList<Integer>();
		data = (ArrayList<Integer>) scoreTracker.getIntegerData(1);
    	
    	int max = data.get(0);
    	
    	for(int i=1; i<data.size(); i++)
    	{
    		if(data.get(i) > max)
    		{
    			max = data.get(i);
    		}
    	}
    	System.out.println("\nCurrent Highest Score is " + max);*/
    	
    }
    @Override
    public void start(Stage primaryStage) 
    {
    	//Set title of stage
        primaryStage.setTitle("Fast Clicker");
        
        //Button events and text
        Button btn = new Button();
        btn.setText("Click me");
        Text scoreBox = new Text("Clicks: none");
        
        btn.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {
                GameCode.score++;
                
                long gameTime = 10000000000L;
                long timeStep = System.nanoTime() + gameTime;
                
                new AnimationTimer()
                {
                	@Override
                	public void handle(long now) 
                	{
                		if (now > timeStep)
                		{
                			System.out.println("You clicked " + score + " times in 10 seconds\n");
                			Platform.exit();//Exits window
                		}
                		scoreBox.setText("Clicks: " + score);
                	}
                }.start();
            }
        });
         
        StackPane root = new StackPane();
        HBox hb = new HBox();
        
        //root
        root.getChildren().add(hb);
        root.getChildren().add(btn);
        
        //hb
        hb.getChildren().add(scoreBox);
        
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
